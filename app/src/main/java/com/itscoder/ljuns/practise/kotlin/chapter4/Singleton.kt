package com.itscoder.ljuns.practise.kotlin.chapter4

/**
 * @author ljuns
 * Created at 2018/11/6.
 */
object Singleton {
    val list= arrayListOf(1, 2, 3)

    fun singleton() {
        for (i in list) {
            print(i)
        }
    }
}

fun main(args: Array<String>) {
    Singleton.list.add(4)
    Singleton.singleton()
}