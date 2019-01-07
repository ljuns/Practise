package com.itscoder.ljuns.practise.algorithm

/**
 * Created by ljuns at 2019/1/7.
 * I am just a developer.
 * 堆排序
 * 大顶堆：根节点 >= 左子节点 && 根节点 >= 右子节点
 * 小顶堆：根节点 <= 左子节点 && 根节点 <= 右子节点
 * 1、升序构建大顶堆，降序构建小顶堆
 * 2、交换根节点和最后一个子节点，此时的最后一个子节点不再参与排序
 * 3、重复 1、2
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(3, 1, 1, 6, 2, 4, 19)
    headSort(arr)

    for (i in arr) {
        println(i)
    }
}

fun headSort(arr: IntArray) {

    /**
     * 构造堆
     */
    // for(int i = arr.size/2 -1; i >= 0; i --)
    // start 是最后一个子节点不为空的节点
    val start = arr.size / 2 - 1
    for ((key, value) in (start downTo 0).withIndex()) {
        // println("key: $value, value: ${arr[value]}")
        headAdjust(arr, value, arr.size)
    }

    /**
     * 交换位置，再次调整为堆
     */
    for ((index, value) in (arr.size - 1 downTo 1).withIndex()) {
        // 交换根节点后最后一个子节点
        swap(arr, 0, value)
        // 重新调整为大顶堆
        // 为什么从 0 开始？因为交换了根节点和最后一个子节点，其他节点都不变，变得只是根节点，所以只需要看根节点
        headAdjust(arr, 0, value)
    }
}

/**
 * 构建堆
 */
fun headAdjust(arr: IntArray, i: Int, len: Int) {
    val temp = arr[i]
    var i = i

    // for (int j = 2 * i - 1; j < len; j = j * 2 -1)
    // 2 * i + 1 表示左子节点，2 * i + 2 表示右子节点
    val start = 2 * i + 1
    // step (start * 2 + 1)：因为有可能子节点又不满足大顶堆了，需要再次调整
    for ((index, value) in (start until len step (start * 2 + 1)).withIndex()) {
        var child = value

        // 如果右子节点比左子节点大，用右子节点来比较
        if (child + 1 < len && arr[child] < arr[child + 1]) {
            child++
        }

        // 如果右子节点比父节点大，调换位置
        if (arr[child] > temp) {
            arr[i] = arr[child]
            i = child
        } else {
            //父节点比子节点都大，不需要调整
            break
        }

        arr[i] = temp
    }
}

/**
 * 交换根节点和最后一个子节点
 */
fun swap(arr: IntArray, origin: Int, target: Int) {
    val temp = arr[origin]
    arr[origin] = arr[target]
    arr[target] = temp
}