package com.itscoder.ljuns.practise.algorithm

/**
 * Created by ljuns at 2019/1/9.
 * I am just a developer.
 * 希尔排序
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(3, 1, 1, 6, 2, 4, 19)
    shellSort(arr)

    arr.forEach { println(it) }
}

/**
 * 3, 1, 1, 6, 2, 4, 19
 * 1、gap = arr.size / 2，即分成 gap 组（偶数个元素是 gap 组，奇数个元素是 gap+1 组）
 * 2、每一组进行插入排序，插入排序就是后一个和前一个比较，后一个小就进入步骤 3
 * 3、交换位置，交换位置后还需重新和前面的比较，因为交换位置后有可能比前面的还小
 * 4、每次都是 gap /= 2
 * 5、重复 1～4
 */
fun shellSort(arr: IntArray) {

    var gap = arr.size / 2

    // for(int gap = arr.size / 2; gap > 0; gap /= 2)
    for (i in (arr.size / 2) downTo 0 step gap) {

        for (i in (gap until arr.size).withIndex()) {
            var j = i.value

            while (j >= gap && arr[j] < arr[j - gap]) {
                // 交换位置
                val temp = arr[j]
                arr[j] = arr[j - gap]
                arr[j - gap] = temp

                j -= gap
            }
        }

        // 每次都是 gap/2，叫做希尔增量
        gap /= 2
    }


    /*((arr.size / 2) downTo 0 step gap).forEach { item ->
        (gap until arr.size).forEachIndexed { key, index ->
            var j = index

            while (j >= gap && arr[j] < arr[j - gap]) {
                // 交换位置
                val temp = arr[j]
                arr[j] = arr[j - gap]
                arr[j - gap] = temp

                j -= gap
            }
        }

        gap /= 2
    }*/
}