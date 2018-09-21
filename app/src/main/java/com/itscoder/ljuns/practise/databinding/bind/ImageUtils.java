package com.itscoder.ljuns.practise.databinding.bind;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

/**
 * @author ljuns
 * Created at 2018/9/21.
 * I am just a developer.
 */
public class ImageUtils {

    private static final String TAG = "ImageUtils";

    /**
     * 必须是 static
     * @param view
     * @param url
     */
    @BindingAdapter({ "imgSrc" })
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }

}
