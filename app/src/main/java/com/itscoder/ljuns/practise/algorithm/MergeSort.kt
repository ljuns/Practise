package com.itscoder.ljuns.practise.algorithm

/**
 * Created by ljuns at 2019/1/8.
 * I am just a developer.
 * 归并排序
 * 1、先将数组中间分割，直到无法分割
 *                                                 3, 1, 1, 6, 2, 4, 19
 *                                                 3, 1, 1, 6
 *                                                 3, 1
 *                                                 3  1
 * 2、对最小的部分开始排序                            1  3     1, 6
 *                                                 1  3     1  6
 *                                                 1  1  3  6       2, 4, 19
 *                                                 1  1  3  6       2, 4    19
 *                                                 1  1  3  6       2  4
 *                                                 1  1  2  3  4  6     19
 *                                                 1  1  2  3  4  6 19
 * 3、合并上层的分割
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(3, 1, 1, 6, 2, 4, 19)
    val temp = intArrayOf(0, 0, 0, 0, 0, 0, 0)
    mergeSort(arr, 0, arr.size - 1, temp)

    arr.forEach { println(it) }
}

fun mergeSort(arr: IntArray, left: Int, right: Int, temp: IntArray) {
    if (left < right) {
        val mid = (left + right) / 2
        // 分割左边
        mergeSort(arr, left, mid, temp)
        // 分割右边
        mergeSort(arr, mid + 1, right, temp)
        // 合并排序
        merge(arr, left, mid, right, temp)
    }
}

fun merge(arr: IntArray, left: Int, mid: Int, right: Int, temp: IntArray) {
    var l = left
    // 从右边的第一个开始
    var r = mid + 1

    var i = 0
    while (l <= mid && r <= right) {
        if (arr[l] <= arr[r]) {
            // 将左边的元素给临时数组，并把左边指向下一个
            temp[i++] = arr[l++]
        } else {
            // 将右边的元素给临时数组，并把右边指向下一个
            temp[i++] = arr[r++]
        }
    }

    // 将左边剩余的元素放到临时数组
    while (l <= mid) {
        temp[i++] = arr[l++]
    }

    // 将右边剩余的元素放到临时数组
    while (r <= right) {
        temp[i++] = arr[r++]
    }

    // 此时的临时数组已经是个有序数组了
    var left = left
    i = 0
    // 将临时数组的元素复制到原数组，原数组的起始位置是合并前左半部分的第一个位置，即 left
    while (left <= right) {
        arr[left++] = temp[i++]
    }
}