package com.wenwen.music.view.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.wenwen.lib_commin_ui.base.BaseActivity;
import com.wenwen.lib_network.okhttp.listener.DisposeDataListener;
import com.wenwen.music.R;
import com.wenwen.music.api.RequestCenter;
import com.wenwen.music.user.LoginEvent;
import com.wenwen.music.user.User;
import com.wenwen.music.utils.UserManager;

import org.greenrobot.eventbus.EventBus;

public class LoginActivity extends BaseActivity {
    public static void start(Context context){
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout);
        findViewById(R.id.login_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestCenter.login(new DisposeDataListener() {
                    @Override
                    public void onSuccess(Object responseObj) {
                        //处理正常逻辑
                        User user = (User) responseObj;
                        UserManager.getInstance().setUser(user);
                        EventBus.getDefault().post(new LoginEvent());
                        finish();
                    }

                    @Override
                    public void onFailure(Object reasonObj) {
                            //登陆失败逻辑
                        Toast.makeText(LoginActivity.this,"获取登陆数据失败" ,Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
