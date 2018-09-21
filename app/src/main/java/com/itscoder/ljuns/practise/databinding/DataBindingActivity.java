package com.itscoder.ljuns.practise.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.itscoder.ljuns.practise.R;
import com.itscoder.ljuns.practise.databinding.model.User;

/**
 * @author ljuns
 * Created at 2018/9/20.
 * I am just a developer.
 */
public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_data_binding);

        TestBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        User user = new User("ljuns", 20);
        binding.setUser1(user);
        binding.setImgUrl("http://img02file.tooopen.com/images/20160408/tooopen_sy_158723161481.jpg");
    }
}
