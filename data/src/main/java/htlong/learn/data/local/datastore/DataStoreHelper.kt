package htlong.learn.data.local.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import htlong.learn.data.common.Utils
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.mapNotNull

/**
 * - Object's purpose: save key-value data with datastore
 *
 * @author HTLong
 * @edit_at 03/04/2022
 */

class DataStoreHelper private constructor(context: Context) {

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = PREFERENCE_NAME)

    private val dataStore = context.dataStore

    fun getDatastore() = dataStore

    suspend fun saveString(key: String, value: String): Boolean {
        return safeSave(key = stringPreferencesKey(name = key), value = value)
    }

    suspend fun saveBoolean(key: String, value: Boolean): Boolean {
        return safeSave(key = booleanPreferencesKey(name = key), value = value)
    }

    suspend fun saveSetString(key: String, value: Set<String>): Boolean {
        return safeSave(key = stringSetPreferencesKey(name = key), value = value)
    }

    suspend fun getString(key: String): String? {
        return safeGetSync(key = stringPreferencesKey(key))
    }

    fun getFlowString(key: String): Flow<String>? {
        return safeGetASync(key = stringPreferencesKey(key))
    }

    suspend fun getBoolean(key: String): Boolean? {
        return safeGetSync(key = booleanPreferencesKey(key))
    }

    fun getFlowBoolean(key: String): Flow<Boolean>? {
        return safeGetASync(key = booleanPreferencesKey(key))
    }

    suspend fun getSetString(key: String): Set<String> {
        return this.safeGetSync(key = stringSetPreferencesKey(key)) ?: setOf()
    }

    fun getFlowSetString(key: String): Flow<Set<String>>? {
        return safeGetASync(key = stringSetPreferencesKey(key))
    }

    suspend fun removeString(key: String): Boolean {
        return this.safeRemove(stringPreferencesKey(name = key))
    }

    suspend fun removeBoolean(key: String): Boolean {
        return this.safeRemove(booleanPreferencesKey(name = key))
    }

    suspend fun removeSetString(key: String): Boolean {
        return this.safeRemove(stringSetPreferencesKey(name = key))
    }

    /**
     * - Desc: clear all data in data store
     *
     * @author HTLong
     * @edit_at 31/07/2022
     */
    suspend fun clear(): Boolean {
        try {
            dataStore.edit { prefs -> prefs.clear() }
            return true
        } catch (e: Exception) {
            Utils.handleException(EXCEPTION_REMOVE, e)
        }
        return false;
    }


    private suspend fun <T> safeGetSync(key: Preferences.Key<T>): T? {
        try {
            return dataStore.data.firstOrNull()?.get(key = key)
        } catch (e: Exception) {
            Utils.handleException(EXCEPTION_GET, e)
        }
        return null
    }

    private fun <T> safeGetASync(key: Preferences.Key<T>): Flow<T>? {
        try {
            return dataStore.data.mapNotNull { prefs -> prefs[key] }
        } catch (e: Exception) {
            Utils.handleException(EXCEPTION_GET, e)
        }
        return null
    }

    private suspend fun <T> safeRemove(key: Preferences.Key<T>): Boolean {
        try {
            dataStore.edit { prefs ->
                if (prefs.contains(key = key)) prefs.remove(key = key)
            }
            return true
        } catch (e: Exception) {
            Utils.handleException(EXCEPTION_REMOVE, e)
        }
        return false
    }

    private suspend fun <T> safeSave(key: Preferences.Key<T>, value: T): Boolean {
        try {
            if (safeRemove(key = key)) {
                dataStore.edit { prefs -> prefs[key] = value }
                return true
            }
        } catch (e: Exception) {
            Utils.handleException(EXCEPTION_SAVE, e)
        }
        return false
    }

    companion object {
        const val PREFERENCE_NAME = "preference_datastore"
        const val EXCEPTION_SAVE = "datastore_save_error"
        const val EXCEPTION_GET = "datastore_get_error"
        const val EXCEPTION_REMOVE = "datastore_remove_error"

        private var instance: DataStoreHelper? = null
        fun getInstance(context: Context) = instance ?: DataStoreHelper(context).also { instance = it }
    }
}


