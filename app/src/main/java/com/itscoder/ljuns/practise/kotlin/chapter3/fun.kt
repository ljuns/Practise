package com.itscoder.ljuns.practise.kotlin.chapter3

/**
 * @author ljuns
 * Created at 2018/10/20.
 * I am just a developer.
 */

const val a: Int = 0

fun <T> joinToString(
    collection: Collection<T>,
    //下面三个参数都有默认值
    separator: String = "",
    prefix: String = "",
    postfix: String = ""
) {}


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)

    joinToString(list)
    joinToString(list, "")
    joinToString(list, "", "")
    joinToString(list, "", "", "")

    joinToString(list, separator = "", prefix = "", postfix = "")
    joinToString(list, "", prefix = "", postfix = "")
}