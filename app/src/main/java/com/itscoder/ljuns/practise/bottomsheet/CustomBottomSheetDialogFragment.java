package com.itscoder.ljuns.practise.bottomsheet;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.itscoder.ljuns.practise.R;

/**
 * @author ljuns
 * Created at 2018/9/14.
 * I am just a developer.
 */
public class CustomBottomSheetDialogFragment extends BottomSheetDialogFragment {

    public static CustomBottomSheetDialogFragment newInstance() {
        CustomBottomSheetDialogFragment fragment = new CustomBottomSheetDialogFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_custom_bottom_sheet_dialog, container, false);
    }
}
