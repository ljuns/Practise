package com.itscoder.ljuns.practise.algorithm

/**
 * Created by ljuns at 2019/1/5.
 * I am just a developer.
 * 快速排序
 * 例如：3, 1, 1, 6, 2, 4, 19
 * 1、定义 left 为最左边，right 为最右边；
 * 2、选定 left 位置的元素为 temp；
 * 3、用 temp 从最右边开始比较，小于等于 temp 就 right--，否则 right 位置的元素替换掉 left 的元素，并且 left++；
 * 4、用 temp 从 left 开始比较，大于等于 temp 就 left++，否则 left 位置的元素替换掉 right 的元素，并且 right--；
 * 5、此时以 temp 为中心分为两部分，左边的都比 temp 小，右边的都比 temp 大。
 * 左边：left 仍为最左边，right 为 temp，右边：left 为 temp+1，right 为最右边；重复2～5，直到 left >= temp 的位置
 */

//class QuickSort {

    fun main(args: Array<String>) {
        val arr = intArrayOf(3, 1, 1, 6, 2, 4, 19)
        quickSort(arr, 0, arr.size - 1)

        for (i in arr) {
            println(i)
        }
    }

    private fun quickSort(arr: IntArray, left: Int, right: Int) {
        if (left >= right || arr.size <= 1) return

        val mid = partition(arr, left, right)
        quickSort(arr, left, mid)
        quickSort(arr, mid + 1, right)
    }

    private fun partition(arr: IntArray, left: Int, right: Int) : Int {
        var left = left
        var right = right
        val temp = arr[left]

        while (left < right) {
            // 比较右边
            while (temp <= arr[right] && left < right) {
                -- right
            }

            // 右边的比 temp 小，需要把 right 放在 left 的位置，并且 left 从下一个位置开始
            if (left < right) {
                arr[left] = arr[right]
                left ++
            }

            // 比较左边
            while (temp >= arr[left] && left < right) {
                ++ left
            }

            // 左边的比 temp 大，需要把 left 放在 right 的位置，并且 right 从前一个位置开始
            if (left < right) {
                arr[right] = arr[left]
                right --
            }
        }

        // 此时 left == right
        arr[left] = temp
        return left
    }
//}