package com.itscoder.ljuns.practise.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.itscoder.ljuns.practise.BR;

/**
 * @author ljuns
 * Created at 2018/9/20.
 * I am just a developer.
 */
public class User extends BaseObservable {
    private String mName;
    private int mAge;

    public User(String name, int age) {
        mName = name;
        mAge = age;
    }

    @Bindable
    public String getName() {
        return mName;
    }

    @Bindable
    public int getAge() {
        return mAge;
    }

    public void setName(String name) {
        mName = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(int age) {
        mAge = age;
        notifyPropertyChanged(BR.age);
    }
}

