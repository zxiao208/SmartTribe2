package com.zx.smarttribe.smarttribe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/9 0009.
 */

public class XiaoquInfoActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvshouye,tvfanhui,tv1,tv2,tv3,tv4,tv5,tv6;
    LinearLayout linone,lintwo;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
                setContentView(R.layout.activity_xiaoquinfo);
                init();
    }
    private void init(){
        tvshouye= (TextView) findViewById(R.id.mytbar_shouye);
        tvshouye.setOnClickListener(this);
        tvfanhui= (TextView) findViewById(R.id.mytbar_fanhui);
        tvfanhui.setOnClickListener(this);
        linone = (LinearLayout) findViewById(R.id.xiaoqu_one);
        linone.setOnClickListener(this);
        lintwo = (LinearLayout) findViewById(R.id.xiaoqu_two);
        lintwo.setOnClickListener(this);
        tv1= (TextView) findViewById(R.id.xiaoqu_tv1);
        tv1.setOnClickListener(this);
        tv2= (TextView) findViewById(R.id.xiaoqu_tv2);
        tv2.setOnClickListener(this);
        tv3= (TextView) findViewById(R.id.xiaoqu_tv3);
        tv3.setOnClickListener(this);
        tv4= (TextView) findViewById(R.id.xiaoqu_tv4);
        tv4.setOnClickListener(this);
        tv5= (TextView) findViewById(R.id.xiaoqu_tv5);
        tv5.setOnClickListener(this);
        tv6= (TextView) findViewById(R.id.xiaoqu_tv6);
        tv6.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.mytbar_fanhui:
                finish();
                break;
            case R.id.mytbar_shouye:
                finish();
                break;
            case R.id.xiaoqu_one:
                Intent intent = new Intent();
                //设置Intent的class属性，跳转到SecondActivity
                intent.setClass(XiaoquInfoActivity.this, Info2Activity.class);
                startActivity(intent);
                break;
            case R.id.xiaoqu_two:
                Intent intent6 = new Intent();
                //设置Intent的class属性，跳转到SecondActivity
                intent6.setClass(XiaoquInfoActivity.this, Info1Activity.class);
                startActivity(intent6);
                break;
            case R.id.xiaoqu_tv1:
                Toast.makeText(getApplicationContext(),"您已经在第一页了！",Toast.LENGTH_LONG).show();
                break;
            case R.id.xiaoqu_tv2:
                Toast.makeText(getApplicationContext(),"您已经在第一页了！",Toast.LENGTH_LONG).show();
                break;
            case R.id.xiaoqu_tv5:
                Toast.makeText(getApplicationContext(),"这已经是最后一页了！",Toast.LENGTH_LONG).show();
                break;
            case R.id.xiaoqu_tv6:
                Toast.makeText(getApplicationContext(),"这已经是最后一页了！",Toast.LENGTH_LONG).show();
                break;

            default:
                break;
        }
    }
}
