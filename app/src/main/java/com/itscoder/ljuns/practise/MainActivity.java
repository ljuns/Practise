package com.itscoder.ljuns.practise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.itscoder.ljuns.practise.bottomsheet.BottomSheetActivity;

/**
 * @author ljuns
 * Created at 2018/9/14.
 * I am just a developer.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_bottom_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BottomSheetActivity.class));
            }
        });
    }
}
