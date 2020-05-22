/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("String result: ${getResult(stringResult)}\n" +
            "Int result: ${getResult(intResult)}")
}

// TODO 1
fun <T> getResult(args: T): Int {
    return when(args){
        is Int -> args*5
        is String -> args.length
        else -> 0
    }

}