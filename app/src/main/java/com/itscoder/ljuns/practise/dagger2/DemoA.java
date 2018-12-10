package com.itscoder.ljuns.practise.dagger2;

import javax.inject.Inject;

/**
 * Created by ljuns at 2018/11/30.
 * I am just a developer.
 */
public class DemoA {

    @Inject
    public DemoA() {
    }

    public void demoA() {
        System.out.println("println demo a");
    }
}
