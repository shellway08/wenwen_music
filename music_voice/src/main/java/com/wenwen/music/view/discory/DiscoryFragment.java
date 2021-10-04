package com.wenwen.music.view.discory;


import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.wenwen.music.view.BaseFragment;

public class DiscoryFragment extends BaseFragment {

    @Override
    protected View initView() {
        TextView textView = new TextView(mContext);
        textView.setText("发现页面");
        textView.setTextSize(20);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    public static Fragment newInstance(){
        return new DiscoryFragment();
    }
}
