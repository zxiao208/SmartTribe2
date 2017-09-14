package com.zx.smarttribe.smarttribe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class Info2Activity extends AppCompatActivity implements View.OnClickListener{
    TextView strshouye,strfanhui;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.str2);
        init();
    }
    private void init(){
        strshouye = (TextView) findViewById(R.id.mytbar_shouye);
        strshouye.setOnClickListener(this);
        strfanhui = (TextView) findViewById(R.id.mytbar_fanhui);
        strfanhui.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.mytbar_fanhui:
                finish();
                break;
            case R.id.mytbar_shouye:
                Intent intent = new Intent();
                //设置Intent的class属性，跳转到SecondActivity
                intent.setClass(Info2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }
    }
}
