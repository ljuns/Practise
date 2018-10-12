package com.itscoder.ljuns.practise.kotlin.chapter2

import java.lang.Exception

/**
 * @author ljuns
 * Created at 2018/10/12.
 * I am just a developer.
 */

//fun getMnemonic(color: Color): String {
//    return when (color) {
//        Color.RED -> "Richard"
//        Color.YELLOW -> "York"
//        Color.ORANGE -> "Of"
//        Color.GREEN -> "Gave"
//        Color.BLUE -> "Battle"
//        Color.INDIGO -> "In"
//        Color.VIOLET -> "Vain"
//    }
//}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.YELLOW -> "York"
        Color.ORANGE -> "Of"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun mixOptimized(color: Color) =
    when {
        color == Color.RED -> "Red"
        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(mixOptimized(Color.BLUE))
}