package com.itscoder.ljuns.practise.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.itscoder.ljuns.practise.R;
import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    @Inject DemoA mA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        //DaggerComponent component = DaggerDaggerComponent.builder().build();
        //component.daggerActivity(this);
    }
}
