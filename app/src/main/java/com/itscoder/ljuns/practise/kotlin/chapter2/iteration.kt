package com.itscoder.ljuns.practise.kotlin.chapter2

import java.util.*

/**
 * @author ljuns
 * Created at 2018/10/12.
 * I am just a developer.
 */

val oneToTen = 1..10

val a = 1 until 10

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) =
    when(c) {
        in '0'..'9' -> "It`s a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It`s a letter!"
        else -> "I don`t know..."
    }



fun main(args: Array<String>) {
//    println(isLetter('p'))
//    println(isNotDigit('x'))
//    println(recognize('8'))

    val binaryReps = TreeMap<Char, String>()
    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}