package com.itscoder.ljuns.practise.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.itscoder.ljuns.practise.R;
import com.itscoder.ljuns.practise.databinding.bind.ClickUtils;
import com.itscoder.ljuns.practise.databinding.model.ObservableUser;
import com.itscoder.ljuns.practise.databinding.model.User;

/**
 * @author ljuns
 * Created at 2018/9/20.
 * I am just a developer.
 */
public class DataBindingActivity extends AppCompatActivity {

    private static final String TAG = "DataBindingActivity";
    public static final String MNAME = "dataBinding";

    private User mUser;
    private ObservableUser mObservableUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_data_binding);

        TestBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        mUser = new User("ljuns", 20);
        binding.setUser1(mUser);
        binding.setImgUrl("http://img02file.tooopen.com/images/20160408/tooopen_sy_158723161481.jpg");

        mObservableUser = new ObservableUser("itsCoder", 3);
        binding.setUser2(mObservableUser);

        // 类似 HashMap，view 中取值时类似于数组：map["first"]
        ObservableArrayMap<String, String> map = new ObservableArrayMap<>();
        map.put("first", "ljuns");
        map.put("second", "itsCoder");
        binding.setMap(map);

        // 类似 ArrayList，view 中取值时类似于数组：list[1]
        ObservableArrayList<String> list = new ObservableArrayList<>();
        list.add("ljuns");
        list.add("itsCoder");
        binding.setList(list);

        //点击事件
        binding.setActivity(this);
        binding.setClick(new ClickUtils());
    }

    /**
     * 点击事件
     * @param view 参数必须为 View
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                Toast.makeText(this, "Button onClick", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView:
                Toast.makeText(this, "ImageView onClick", Toast.LENGTH_SHORT).show();
                mUser.setName("itsCoder");
                mObservableUser.mName.set("ljuns");
                break;
                default:
                    break;
        }
    }
}
