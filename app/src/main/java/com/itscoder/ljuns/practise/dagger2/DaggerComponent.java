package com.itscoder.ljuns.practise.dagger2;

import dagger.Component;

/**
 * Created by ljuns at 2018/11/30.
 * I am just a developer.
 */
@Component(modules = DemoModule.class)
public interface DaggerComponent {

    void daggerActivity(DaggerActivity activity);

    void daggerDemoB(DemoB b);
    void daggerDemoC(DemoB b);
}
