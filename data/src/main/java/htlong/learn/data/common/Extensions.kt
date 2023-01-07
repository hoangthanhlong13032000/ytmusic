package htlong.learn.data.common

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import htlong.learn.data.local.datastore.DataStoreHelper.Companion.PREFERENCE_NAME

object Extensions {
    val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = PREFERENCE_NAME)
}