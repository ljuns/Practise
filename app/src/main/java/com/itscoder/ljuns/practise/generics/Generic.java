package com.itscoder.ljuns.practise.generics;

/**
 * @author ljuns
 * Created at 2018/9/29.
 * I am just a developer.
 * 泛型类，只需要在类名后加 <T>
 * <T>：表示类型参数
 */
public class Generic<T> {

    private T mValue;

    public T getValue() {
        return mValue;
    }

    /**
     * 普通方法，使用了泛型参数，不能使用定义类时没有声明的类型参数，比如 E
     * @param value
     */
    public void setValue(T value) {
        mValue = value;
    }

    /**
     * 根据方法返回值前面是否有 <T> 来判断是否为泛型方法，
     * 参数类型虽然和类的类型参数都是 T，实际上不是同一个类型，所以可以定义 <E> 的泛型方法
     * @param key
     * @param <T>
     */
    public <T> void setKey(T key) {
        System.out.println("key = " + key);
    }
}
