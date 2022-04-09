package htlong.learn.youtube.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat

object Utils {
    fun <T> List<T>.toArrayList(): ArrayList<T> {
        return ArrayList(this)
    }

    fun Context.showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 120)
        toast.show()
    }

    fun Context.getMColor(id: Int) = ContextCompat.getColor(this, id)
    fun Context.getMDrawable(id: Int): Drawable? = AppCompatResources.getDrawable(this, id)
    fun Context.getMDimension(dimension: Int) = this.resources.getDimensionPixelSize(dimension)


    fun handleException(tag: String, e: Exception, desc: String? = null) {
        val tagU = tag.uppercase()
        Log.e("--$tagU--", "---ERROR--- ${e.localizedMessage}")
        desc?.let { Log.e("--$tagU--", "---DESC--- $desc") }
        e.printStackTrace()
    }
}