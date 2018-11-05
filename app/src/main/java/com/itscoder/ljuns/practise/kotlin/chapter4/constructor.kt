package com.itscoder.ljuns.practise.kotlin.chapter4

/**
 * @author ljuns
 * Created at 2018/11/4.
 */
//class User(val nickname: String)

class User constructor(nickname: String) {
    val nickname: String

    init {
        this.nickname = nickname;
    }
}
