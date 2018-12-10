package com.itscoder.ljuns.practise.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ljuns at 2018/11/30.
 * I am just a developer.
 */

@Module
public class DemoModule {

    @Provides
    public DemoC provideDemoC() {
        return new DemoC();
    }
}
