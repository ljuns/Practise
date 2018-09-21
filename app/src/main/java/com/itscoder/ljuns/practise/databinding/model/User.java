package com.itscoder.ljuns.practise.databinding.model;

/**
 * @author ljuns
 * Created at 2018/9/20.
 * I am just a developer.
 */
public class User {
    private String mName;
    private int mAge;

    public User(String name, int age) {
        mName = name;
        mAge = age;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }
}

