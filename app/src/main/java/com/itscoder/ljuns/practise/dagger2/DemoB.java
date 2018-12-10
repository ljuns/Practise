package com.itscoder.ljuns.practise.dagger2;

import javax.inject.Inject;

/**
 * Created by ljuns at 2018/11/30.
 * I am just a developer.
 */
public class DemoB {

    @Inject DemoA mA;
    @Inject DemoC mC;

    public static void main(String[] args) {
        new DemoB().test();
    }

    public void test() {
        DaggerComponent component = DaggerDaggerComponent.builder().build();
        component.daggerDemoB(this);
        component.daggerDemoC(this);

        mA.demoA();
        mC.demoC();
    }
}
