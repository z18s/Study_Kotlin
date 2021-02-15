package kotlin_programming_by_example.chapter_1

fun main(args: Array<String>) {
    var x: Int = 33
    show(x)

    var s: String = "Hello, World!"
    showChars(s)
}

fun show(num: Int) {
    println("The number is $num")
}

fun showChars(str: String) {
    var c: Char
    for(chr in str) {
        c = chr
        println(c)
    }
}