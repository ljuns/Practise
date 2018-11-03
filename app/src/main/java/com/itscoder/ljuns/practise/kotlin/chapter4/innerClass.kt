package com.itscoder.ljuns.practise.kotlin.chapter4

/**
 * @author ljuns
 * Created at 2018/11/4.
 */

class Outer {
    val test: Int = 0
    // 嵌套类，类似于 Java 的静态内部类，不持有外部类引用
    class nest {}

    // 内部类，持有外部类引用
    inner class Inner {
        fun test() = this@Outer.test
    }
}