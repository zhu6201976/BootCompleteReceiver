package com.example.administrator.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * 手机重启案例
 * 配置广播接收者,接收手机重启广播,手机一旦重启,加载应用主界面
 * 禁用backpress按键,让后退按键失效
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // 重写Activity的onBackPressed按键,空实现,让后退按键失效
    @Override
    public void onBackPressed() {

    }
}
