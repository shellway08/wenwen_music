package com.wenwen.music.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wenwen.music.R;
import com.wenwen.music.model.CHANNEL;

public class HomeActivity extends FragmentActivity implements View.OnClickListener {
    private static final CHANNEL[] channels = new CHANNEL[]{CHANNEL.MY,CHANNEL.DISCORY,CHANNEL.FRIEND};
    private DrawerLayout mDrawerLayout;
    private TextView mToggleView;
    private TextView mSearchView;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = findViewById(R.id.drawer_layout);
       // mDrawerLayout.closeDrawers();

        mToggleView = findViewById(R.id.toggle_view);
        mToggleView.setOnClickListener(this);
        mSearchView = findViewById(R.id.search_view);
        mViewPager = findViewById(R.id.view_pager);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toggle_view:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
        }
    }
}