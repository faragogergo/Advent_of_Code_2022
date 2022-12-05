import java.io.File

fun main() {
    fun parseInput(input: String): List<List<Int>> = input.split("\r\n\r\n").map { elf ->
        elf.lines().map { it.toInt() }


    }
    fun part1(input: String): Int = parseInput(input).maxOf { it.sum() }

    fun part2(input: String): Int = parseInput(input).map { it.sum() }
        .sortedDescending()
        .take(3)
        .sum()

    // test if implementation meets criteria from the description, like:
    val input = File("src/Day01.txt").readText()
    // check(part1(testInput) == 24000)

    // val input = readInput("Day01")
    println(part1(input))
    println(part2(input))


}
