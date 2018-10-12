package com.itscoder.ljuns.practise.kotlin.chapter2

/**
 * @author ljuns
 * Created at 2018/10/12.
 * I am just a developer.
 */
class Person(val name: String, var age: Int) {
    val isAdult: Boolean
        get() {
            return age >= 18
        }
    var isMarried: String = ""
        get() = "abc"
        set(value) {
            field = value + "123"
        }
}

fun main(args: Array<String>) {
    val person = Person("abc", 20)
    println(person.name)
    println(person.age)
    person.age = 18
    println(person.age)
    println(person.isAdult)
    println(person.isMarried)
    person.isMarried = "abc"
    println(person.isMarried)
}