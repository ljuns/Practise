package com.itscoder.ljuns.practise.databinding.bind;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.itscoder.ljuns.practise.BaseApplication;
import com.itscoder.ljuns.practise.R;
import java.util.TimerTask;

/**
 * @author ljuns
 * Created at 2018/9/21.
 * I am just a developer.
 */
public class ClickUtils {

    /**
     * 这种方式只需该方法的参数类型（View）和监听方法的参数一致（Button 的 onClick() 参数类型是 View）
     * @param view
     */
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "View onClick", Toast.LENGTH_SHORT).show();
    }

    /**
     * 这种方式只需该方法的返回值（void）和监听方法的返回值相同（Button 的 onClick() 返回值是 void）
     * @param task 参数可以多个
     */
    public void onTaskClick(TimerTask task) {
        Toast.makeText(BaseApplication.getApp(), "Task onClick", Toast.LENGTH_SHORT).show();
    }

    public void onTaskClick(View view, TimerTask task) {
        Toast.makeText(view.getContext(), "Task onClick", Toast.LENGTH_SHORT).show();
    }

    public String getText(Context context) {
        return context.getResources().getString(R.string.app_name);
    }
}
