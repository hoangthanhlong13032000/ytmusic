package htlong.learn.youtube.common

import android.app.Activity
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.graphics.drawable.Drawable
import android.view.Gravity
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

object Extensions {
    fun Context.showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 120)
        toast.show()
    }

    fun Context.getMColor(id: Int) = ContextCompat.getColor(this, id)
    fun Context.getMDrawable(id: Int): Drawable? = AppCompatResources.getDrawable(this, id)
    fun Context.getMDimension(dimension: Int) = this.resources.getDimensionPixelSize(dimension)

//    /**
//     * - Extension: run block() in launch of a new coroutine scope with IO Dispatchers
//     *
//     * @author HTLong
//     * @edit_at 21/04/2022
//     */
//    inline fun newMain(crossinline block: suspend () -> Unit) {
//        CoroutineScope(Dispatchers.Main).launch { block() }
//    }
//
//    /**
//     * - Extension: run block() in launch of a new coroutine scope with IO Dispatchers
//     *
//     * @author HTLong
//     * @edit_at 21/04/2022
//     */
//    inline fun newIO(crossinline block: suspend () -> Unit) {
//        CoroutineScope(Dispatchers.IO).launch { block() }
//    }
//
//    /**
//     * - Extension: run block() in launch of a new coroutine scope with Default Dispatchers
//     *
//     * @author HTLong
//     * @edit_at 21/04/2022
//     */
//    inline fun newDefault(crossinline block: () -> Unit) {
//        CoroutineScope(Dispatchers.Default).launch { block() }
//    }

//    /**
//     * - Extension: run block() in current coroutine scope with IO Dispatchers
//     *
//     * @author HTLong
//     * @edit_at 21/04/2022
//     */
//    suspend inline fun <T> io(crossinline block: suspend () -> T): T {
//        return withContext(Dispatchers.IO) { block() }
//    }
//
//    /**
//     * - Extension: run block() in current coroutine scope with Default Dispatchers
//     *
//     * @author HTLong
//     * @edit_at 21/04/2022
//     */
//    suspend inline fun <T> default(crossinline block: suspend () -> T): T {
//        return withContext(Dispatchers.Default) { block() }
//    }


    /**
     * - Extension: run block() in viewModel scope with Main Dispatchers
     *
     * @author HTLong
     * @edit_at 21/04/2022
     */
    inline fun ViewModel.launch(crossinline block: suspend () -> Unit) {
        this.viewModelScope.launch { block() }
    }

//    /**
//     * - Extension: run block() in viewModel scope with IO Dispatchers
//     *
//     * @author HTLong
//     * @edit_at 21/04/2022
//     */
//    inline fun ViewModel.launchIO(crossinline block: suspend () -> Unit) {
//        this.viewModelScope.launch(Dispatchers.IO) { block() }
//    }
//
//    /**
//     * - Extension: run block() in viewModel scope with Default Dispatchers
//     *
//     * @author HTLong
//     * @edit_at 21/04/2022
//     */
//    inline fun ViewModel.launchDefault(crossinline block: suspend () -> Unit) {
//        this.viewModelScope.launch(Dispatchers.Default) { block() }
//    }


    fun Activity.hideSoftKeyboard(editText: EditText){
        (getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager).apply {
            hideSoftInputFromWindow(editText.windowToken, 0)
        }
    }
}