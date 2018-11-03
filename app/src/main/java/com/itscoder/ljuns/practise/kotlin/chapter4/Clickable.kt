package com.itscoder.ljuns.practise.kotlin.chapter4

/**
 * @author ljuns
 * Created at 2018/11/3.
 *
 */
interface Clickable {
    // 接口方法
    fun click()
    // 带默认实现的方法
    fun showOff() = println("I`m clickable!")
}

interface Focusable {
    // 两个非抽象方法
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus")

    fun showOff() = println("I`m focusable!")
}
