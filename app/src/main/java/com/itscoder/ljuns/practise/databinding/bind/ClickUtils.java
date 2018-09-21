package com.itscoder.ljuns.practise.databinding.bind;

import android.view.View;
import android.widget.Toast;

/**
 * @author ljuns
 * Created at 2018/9/21.
 * I am just a developer.
 */
public class ClickUtils {

    public void onClick(View view) {
        Toast.makeText(view.getContext(), "view onClick", Toast.LENGTH_SHORT).show();
    }
}
