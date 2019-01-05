package com.itscoder.ljuns.practise.algorithm

/**
 * Created by ljuns at 2019/1/5.
 * I am just a developer.
 * 插入排序
 * 从第 2 个元素开始和前面的元素比较并排序
 * 例如：1, 3, 2
 * 1、第一次 for 循环：3 和 1 比较，不需要改变
 * 2.1、第二次 for 循环：2 和 3 比较，调换位置变成 1, 2, 3，此时 j == 1
 * 2.2、2 再和 1 比较，不需要改变，排序结束
 */

class InsertionSort {

    fun main(args: Array<String>) {
        val arr = intArrayOf(3, 1, 1, 6, 2, 4, 19)
        sort(arr)
    }

    private fun sort(arr: IntArray) {
        for (i in arr.indices) {
            var j = i
            // 判断 j > 0 有两层意义：1、第一个元素不用比较；2、后面的比较排序到第 1 个元素时停止
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
