package com.itscoder.ljuns.practise.kotlin.chapter4

/**
 * @author ljuns
 * Created at 2018/11/4.
 *
 */
abstract class Animated {
    // 抽象方法默认 open
    abstract fun animate()

    // 非抽象方法可以显式使用 open，否则不能被重写
     fun stopAnimating() {}
}

class AbstractTest : Animated() {
    override fun animate() {

    }
}
