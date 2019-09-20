package Read

import java.lang.IllegalArgumentException

fun main() {
    var a: Int = 12
    var b: Int = 11
    println(sum(a, b))
    println("hello,world")
    var items = listOf<String>("apples", "pears", "bears")
    for (item in items)//for循环
        println(item)

    var index = 0
    while (index < items.size)//while循环
    {
        println("items at $index is ${items[index]}")
        index++

    }

    //使用range
    val list = listOf<Int>(1, 2, 3, 4, 5)
    if (1 in list)
        println("hello")

    //区间迭代
    for (x in 1..5)
        print(x)
    println()
    for (y in 9 downTo 0)
        print(y)

    //lambda表达式的过滤和使用
    var fruits = listOf<String>("apple", "pears", "yes", "orange")
    fruits
        .filter { it.startsWith("a") }//过滤器
        .sortedBy { it }
        .map { it.toUpperCase() }//映射
        .forEach { println(it) }//迭代操作

    println(transform("Red"))
    //数组
    var asc = Array(5) { i -> (i * i).toString()}
    asc.forEach { println(it) }

    //原生类型数组
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    var arr = IntArray(5){42}
    arr.forEach { println(it) }


}
fun transform(color: String): Int{
    return when(color) //when和java的switch用法类似，都是匹配到某个值，执行一次
    {
        "Red" -> 0
        "Orange" -> 1
        "Green" -> 2
        "Blue" -> 3
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}
fun sum(a: Int, b: Int): Int
{
    return a + b
}

fun printsum(a: Int, b: Int): Unit//返回值为空
{
    println("sum of $a and $b is ${a + b}")
}