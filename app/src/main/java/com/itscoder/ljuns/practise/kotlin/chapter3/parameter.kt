package com.itscoder.ljuns.practise.kotlin.chapter3

import android.graphics.Paint

/**
 * @author ljuns
 * Created at 2018/10/27.
 *
 */

// 可变参数
fun test(vararg value: String) {
    println(value.size)
}

fun main(args: Array<String>) {
    test("one", "two", "three")
    test(*args)
}