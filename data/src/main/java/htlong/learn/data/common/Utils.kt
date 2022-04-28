package htlong.learn.data.common

import android.util.Log

object Utils {
    fun handleException(tag: String, e: Exception, desc: String? = null) {
        val tagU = tag.uppercase()
        Log.e("--$tagU--", "---ERROR--- ${e.localizedMessage}")
        desc?.let { Log.e("--$tagU--", "---DESC--- $desc") }
        e.printStackTrace()
    }
}