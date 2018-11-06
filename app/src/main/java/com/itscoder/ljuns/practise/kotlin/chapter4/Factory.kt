package com.itscoder.ljuns.practise.kotlin.chapter4

/**
 * @author ljuns
 * Created at 2018/11/6.
 */
class Factory {
    private val abc = 0
    private fun aaa() {}

    companion object Test {
        fun p() {
            Factory().abc
            Factory().aaa()
        }
    }
}

fun main(args: Array<String>) {
    Factory.p()
}
