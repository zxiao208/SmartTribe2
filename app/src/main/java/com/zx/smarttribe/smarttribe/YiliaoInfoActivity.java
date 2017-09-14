package com.zx.smarttribe.smarttribe;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/9/14 0014.
 */

public class YiliaoInfoActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_xinyun,btn_aiqiangua;
    TextView tv_shouye,tv_fanhui;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiliaoinfo);
        init();
    }

    private void init(){
        btn_xinyun = (Button) findViewById(R.id.yiliaoinfo_btn_xinyun);
        btn_aiqiangua = (Button) findViewById(R.id.yiliaoinfo_btn_aiqiangua);
        btn_xinyun.setOnClickListener(this);
        btn_aiqiangua.setOnClickListener(this);

        tv_shouye = (TextView) findViewById(R.id.mytbar_shouye);
        tv_fanhui = (TextView) findViewById(R.id.mytbar_fanhui);

        tv_shouye.setOnClickListener(this);
        tv_fanhui.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.yiliaoinfo_btn_xinyun:
                Intent mIntent1 = new Intent("android.intent.action.MAIN");
                ComponentName comp1 = new ComponentName("com.medzone.mcloud", "com.medzone.cloud.login.SplashScreenActivity");
                mIntent1.setComponent(comp1);
                mIntent1.addCategory("android.intent.category.LAUNCHER");
                startActivity(mIntent1);//启动
                break;
            case R.id.yiliaoinfo_btn_aiqiangua:
                Intent mIntent2 = new Intent("android.intent.action.MAIN");
                ComponentName comp2 = new ComponentName("com.baiyi.watch.aqgs2", "com.baiyi.watch.ui.SplashActivity");
                mIntent2.setComponent(comp2);
                mIntent2.addCategory("android.intent.category.LAUNCHER");
                startActivity(mIntent2);//启动

                break;
            case R.id.mytbar_fanhui:
                finish();
                break;
            case R.id.mytbar_shouye:
                finish();
                break;
        }
    }
}
