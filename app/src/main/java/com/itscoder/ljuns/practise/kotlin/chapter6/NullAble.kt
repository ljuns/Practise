package com.itscoder.ljuns.practise.kotlin.chapter6

/**
 * Created by ljuns at 2018/12/10.
 * I am just a developer.
 */

fun main(args: Array<String>) {
    val s: String? = " "

    /**
     * 针对 null
     */
    // null 时返回 "abc"，否则返回自己
    println(s ?: "abc")

    // null 时不执行，否则执行
    println(s?.toUpperCase())

    // null 时抛异常，否则执行
    println(s!!.toUpperCase())

    // null 时不执行并返回自己，否则执行并返回结果
    s?.let { println("it = $it") }

    /**
     * 针对 null 和空字符串（" "）
     */
    // s == null || s.length == 0 || s.trim() == ""
    println(s.isNullOrBlank())

    // s == null || s.length == 0
    println(s.isNullOrEmpty())
}