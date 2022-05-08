package htlong.learn.youtube.common

import android.app.Activity
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.graphics.drawable.Drawable
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

object Extensions {
    fun Context.showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    fun Context.getMColor(id: Int) = ContextCompat.getColor(this, id)
    fun Context.getMDrawable(id: Int): Drawable? = AppCompatResources.getDrawable(this, id)
    fun Context.getMDimension(dimension: Int) = this.resources.getDimensionPixelSize(dimension)


    /**
     * - Extension: run block() in viewModel scope with Main Dispatchers
     *
     * @author HTLong
     * @edit_at 21/04/2022
     */
    inline fun ViewModel.launch(crossinline block: suspend () -> Unit) {
        this.viewModelScope.launch { block() }
    }

    fun Activity.hideSoftKeyboard(editText: EditText){
        (getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager).apply {
            hideSoftInputFromWindow(editText.windowToken, 0)
        }
    }
}