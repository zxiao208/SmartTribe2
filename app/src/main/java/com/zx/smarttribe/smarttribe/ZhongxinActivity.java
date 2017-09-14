package com.zx.smarttribe.smarttribe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class ZhongxinActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvshouye,tvfanhui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_zhongxin);
        init();
    }

    private void init(){
        tvshouye= (TextView) findViewById(R.id.mytbar_shouye);
        tvshouye.setOnClickListener(this);
        tvfanhui= (TextView) findViewById(R.id.mytbar_fanhui);
        tvfanhui.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.mytbar_shouye:
                finish();
                break;
            case R.id.mytbar_fanhui:
                finish();
                break;
            default:
                break;
        }
    }
}
