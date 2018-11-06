package com.itscoder.ljuns.practise.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.itscoder.ljuns.practise.R
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("Click", "onClick")
            }
        })

        button.setOnLongClickListener {
            Log.d("Click", "OnLongClick")
            false
        }
    }
}
