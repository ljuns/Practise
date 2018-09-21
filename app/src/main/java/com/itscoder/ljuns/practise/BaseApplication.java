package com.itscoder.ljuns.practise;

import android.app.Application;
import android.content.Context;

/**
 * @author ljuns
 * Created at 2018/9/21.
 * I am just a developer.
 */
public class BaseApplication extends Application {

    private static BaseApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static BaseApplication getApp() {
        return mContext;
    }
}
