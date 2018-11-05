package com.itscoder.ljuns.practise.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.itscoder.ljuns.practise.R
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener {
            Log.d("Click", "OnClick")
        }

        button.setOnLongClickListener {
            Log.d("Click", "OnLongClick")
            false
        }
    }
}
