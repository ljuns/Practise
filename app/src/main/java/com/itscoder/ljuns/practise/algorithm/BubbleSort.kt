package com.itscoder.ljuns.practise.algorithm

/**
 * Created by ljuns at 2019/1/5.
 * I am just a developer.
 * 冒泡排序
 * 内循环：按顺序两两比较，找出较大的或较小的，并交换它们的位置，结束后最大的或最小的就在最末端
 * 外循环：在剩下的元素中进行内循环
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(3, 1, 1, 6, 2, 4, 19)
    sort(arr)
}

fun sort(arr: IntArray) {

//    for (j in (0 until (arr.size - 1))) {
//        println(arr[j])
//    }

//    for ((index, value) in arr.withIndex()) {
//        println("index " + arr[index])
//        println("value $value")
//    }

    for (i in arr.indices) {

        // - i 是因为内循环每次都会找到最大或最小元素，下一个循环时最后面那个就不需要遍历了
        // 这样也就意味着外循环其实有标识已经找出了几个最值
        for (j in (0 until (arr.size - i - 1))) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j + 1]
                arr[j + 1] = arr[j]
                arr[j] = temp
            }
        }
    }

    for (i in arr) {
        println(i)
    }
}