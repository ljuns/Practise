package com.itscoder.ljuns.practise.kotlin.chapter3

/**
 * @author ljuns
 * Created at 2018/10/15.
 * I am just a developer.
 */

val set1 = setOf(1, 2, 3)
val set2 = hashSetOf(1, 2, 3)
val set3 = mutableSetOf(1, 2, 3)

val list1 = listOf(1, 2, 3)
val list2 = arrayListOf(1, 2, 3)
val list3 = mutableListOf(1, 2, 3)

val map1 = mapOf(1 to "one", 2 to "two", 3 to "three")
val map2 = hashMapOf(1 to "one", 2 to "two", 3 to "fifty-three")
val map3 = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

fun main(args: Array<String>) {
    println(set1.javaClass)
    println(set2.javaClass)
    println(set3.javaClass)
    println(list1.javaClass)
    println(list2.javaClass)
    println(list3.javaClass)
    println(map1.javaClass)
    println(map2.javaClass)
    println(map3.javaClass)

    set3.add(0)
    println(set3)

}