fun main() {

    fun Char.priority() = if (isLowerCase()) code - 96 else code - 38

    fun part1(input: List<String>) = input.sumOf { rucksack ->
        val (first, second) = rucksack.chunked(rucksack.length / 2)
        second.first { first.contains(it) }.priority()
    }

    fun part2(input: List<String>) = input.chunked(3).sumOf { group ->
        group[0].first { group[1].contains(it) && group[2].contains(it) }.priority()
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}