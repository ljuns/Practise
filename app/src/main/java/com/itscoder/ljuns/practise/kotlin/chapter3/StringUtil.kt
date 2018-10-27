package com.itscoder.ljuns.practise.kotlin.chapter3

/**
 * @author ljuns
 * Created at 2018/10/24.
 *
 */

/**
 *
 */
fun String.lastChar(): Char = this.get(this.length - 1)
fun String.toString(): String = "abc"

open class View {
    open fun click() = println("view click")
}

open class Button: View() {
    override fun click() = println("button click")
}

fun View.showOff() = println("I`m a View")
fun Button.showOff() = println("I`m a Button")

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".toString())

    val view: View = Button()

    view.click()
    view.showOff()
    View().showOff()
    Button().showOff()
}