import java.io.File

fun main() {

    fun CharSequence.allUnique(): Boolean = toSet().count() == length

    fun solve(input: String, windowSize: Int): Int = input.windowedSequence(windowSize).indexOfFirst {
        it.allUnique()
    } + windowSize


    val input = File("src/Day06.txt").readLines()
    println(solve(input[0], 4))
    println(solve(input[0], 14))

}