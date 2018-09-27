package com.itscoder.ljuns.practise.databinding.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * @author ljuns
 * Created at 2018/9/27.
 * I am just a developer.
 */
public class ObservableUser {

    public ObservableField<String> mName = new ObservableField<>();
    public ObservableInt mAge = new ObservableInt();

    public ObservableUser(String name, int age) {
        mName.set(name);
        mAge.set(age);
    }
}
