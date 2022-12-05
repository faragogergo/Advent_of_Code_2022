fun main() {


    fun String.range(): IntRange {
        val (start, end) = split("-")
        return IntRange(start.toInt(), end.toInt())
    }

    fun String.rangePair(): Pair<IntRange, IntRange> {
        val (first, second) = split(",")
        return Pair(first.range(), second.range())

    }

    fun IntRange.contains(other: IntRange) = first <= other.first && last >= other.last

    fun part1(input: List<String>) = input.count {
        val (first, second) = it.rangePair()
        first.contains(second) || second.contains(first)
    }

    fun part2(input: List<String>) = input.count {
        val (first, second) = it.rangePair()
        first.intersect(second).isNotEmpty()
    }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}



