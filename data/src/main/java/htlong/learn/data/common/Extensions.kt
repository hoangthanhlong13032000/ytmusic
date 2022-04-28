package htlong.learn.data.common

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Extensions {

    internal inline fun <reified T> Gson.fromJson(json: String) =
        fromJson<T>(json, object : TypeToken<T>() {}.type)
}