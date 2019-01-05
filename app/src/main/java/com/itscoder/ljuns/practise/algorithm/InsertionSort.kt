package com.itscoder.ljuns.practise.algorithm

/**
 * Created by ljuns at 2019/1/5.
 * I am just a developer.
 * 插入排序
 */

class InsertionSort {

    fun main(args: Array<String>) {
        val arr = intArrayOf(3, 1, 1, 6, 2, 4, 19)
        sort(arr)
    }

    private fun sort(arr: IntArray) {
        for (i in arr.indices) {
            var j = i
            while (j > 0 && arr[j] < arr[j - 1]) {
                val temp = arr[j]
                arr[j] = arr[j - 1]
                arr[j - 1] = temp
                j --
            }
        }

        for (i in arr) {
            println(i)
        }
    }
}
