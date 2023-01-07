package htlong.learn.data.entities

data class ApiResponse (
    private val status: Int = 0,
    val data: String,
    val message: String = ""
) {
    fun isSuccess(): Boolean {
        return status == 1 && data.isNotBlank()
    }
}