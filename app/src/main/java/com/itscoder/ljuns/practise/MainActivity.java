package com.itscoder.ljuns.practise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.itscoder.ljuns.practise.bottomsheet.BottomSheetActivity;
import com.itscoder.ljuns.practise.databinding.DataBindingActivity;

/**
 * @author ljuns
 * Created at 2018/9/14.
 * I am just a developer.
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_bottom_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
                //startActivity(new Intent(MainActivity.this, BottomSheetActivity.class));
            }
        });

        findViewById(R.id.btn_bottom_sheet).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d(TAG, "onLongClick: ");
                return true;
            }
        });

        findViewById(R.id.btn_data_binding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DataBindingActivity.class));
            }
        });
    }

}
