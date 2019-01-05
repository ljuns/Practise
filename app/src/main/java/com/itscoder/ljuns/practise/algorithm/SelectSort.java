package com.itscoder.ljuns.practise.algorithm;

/**
 * Created by ljuns at 2019/1/5.
 * I am just a developer.
 * 选择排序
 * 内循环：选中一个元素和剩下的所有元素比较，找出最大或最小元素，
 * 并把找到的元素元素和选中元素交换位置，循环结束后最大的或最小的就在第一个位置（默认从0开始）
 * 外循环：在剩下的元素中执行内循环，即在剩下的元素中找到最小的那个元素
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 6, 2, 4, 19};

        sort(arr);
    }

    public static void sort(int[] arr) {

        // 内循环只能找到其中一个最小的元素，外循环的作用是在剩下的元素中找到最小的那个
        for (int i = 0; i < arr.length - 1; i++) {
            // 记录下一个最小值的位置
            int min = i;

            // 这个循环里面会找到剩下元素的最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            // 交换位置
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for (int anArr : arr) {
            System.out.println(anArr);
        }
    }
}
