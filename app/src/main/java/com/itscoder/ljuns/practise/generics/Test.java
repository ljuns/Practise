package com.itscoder.ljuns.practise.generics;

/**
 * @author ljuns
 * Created at 2018/9/29.
 * I am just a developer.
 */
public class Test {

    public static void main(String[] args) {
        // 泛型类
        Generic<String> generic = new Generic<>();
        System.out.println("class = " + generic.getClass());
        int key = 0;
        generic.setKey(key);

        // 通配符
        Generic<Integer> integerGeneric = new Generic<>();
        Generic<Number> numberGeneric = new Generic<>();
        showValue(integerGeneric);
        showValue(numberGeneric);
    }

    /**
     * 通配符：? 是类型实参，类似于 String，可以看作是所有类的父类
     * @param generic
     */
    private static void showValue(Generic<?> generic) {
        System.out.println("value = " + generic.getValue());
    }

    /**
     * 实现泛型接口时，如果不传入泛型实参（比如 Generator<String>），实现类也需要声明泛型（FruitGeneric<T>）
     * @param <T>
     */
    private class FruitGeneric<T> implements Generator<T> {

        @Override
        public T next() {
            return null;
        }
    }

    /**
     * 如果传入了泛型实参（Generator<String>），实现类不需要声明泛型
     */
    private class FoodGeneric implements Generator<String> {

        @Override
        public String next() {
            return null;
        }
    }


}