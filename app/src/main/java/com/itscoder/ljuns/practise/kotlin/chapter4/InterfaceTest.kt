package com.itscoder.ljuns.practise.kotlin.chapter4

/**
 * @author ljuns
 * Created at 2018/11/4.
 *
 */

open class Button : Clickable, Focusable {
    val enable: Boolean = true
    open val text: String = "Button"

    fun disable() {}

    open fun animate() {}

    override fun click() {
        // 调用 Focusable 接口的 setFocus() 方法
        super.setFocus(true)
    }

    override fun showOff() {
        // 调用 Clickable 接口的 showOff() 方法
        super<Clickable>.showOff()
        // 调用 Focusable 接口的 showOff() 方法
        super<Focusable>.showOff()
    }
}

class RichButton : Button() {
    override val text: String
        get() = super.text + super.enable

    override fun animate() {
        super.animate()
        super.disable()
    }
}

fun main(args: Array<String>) {
    Button().click()
}