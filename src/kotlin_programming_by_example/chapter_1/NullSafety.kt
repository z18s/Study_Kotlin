package kotlin_programming_by_example.chapter_1

fun main() {
    var name: String? = "James Gates"
    println(name?.length)

    name = null
    println(name?.length)
}