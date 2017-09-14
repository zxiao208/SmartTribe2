package com.zx.smarttribe.smarttribe;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout lintianqi,linzhongxin,lindiancan,linhujiaozhongxin,linsos,linwuye,linyiliao,linjiaju,linxiaoqu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        Log.i("zhaoxiao","nihao");
        init();
    }


    public void init(){
        lintianqi= (LinearLayout) findViewById(R.id.main_tianqi);
        lintianqi.setOnClickListener(this);
        linzhongxin= (LinearLayout) findViewById(R.id.main_jiankangzhongxin);
        linzhongxin.setOnClickListener(this);
        lindiancan = (LinearLayout) findViewById(R.id.main_diancan);
        lindiancan.setOnClickListener(this);
        linhujiaozhongxin = (LinearLayout) findViewById(R.id.main_hujiaozhongxin);
        linhujiaozhongxin.setOnClickListener(this);
        linsos = (LinearLayout) findViewById(R.id.main_sos);
        linsos.setOnClickListener(this);
        linwuye = (LinearLayout) findViewById(R.id.main_wuye);
        linwuye.setOnClickListener(this);
        linyiliao= (LinearLayout) findViewById(R.id.main_yiliao);
        linyiliao.setOnClickListener(this);
        linjiaju= (LinearLayout) findViewById(R.id.main_zhihuijiaju);
        linjiaju.setOnClickListener(this);
        linxiaoqu= (LinearLayout) findViewById(R.id.main_xiaoqu);
        linxiaoqu.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
      switch(view.getId()){
          case R.id.main_tianqi:
              Intent intent = new Intent();
              //设置Intent的class属性，跳转到SecondActivity
              intent.setClass(MainActivity.this, TianqiActivity.class);
              startActivity(intent);
              break;
          case R.id.main_jiankangzhongxin:
              Intent intent2 = new Intent();
              //设置Intent的class属性，跳转到SecondActivity
              intent2.setClass(MainActivity.this, ZhongxinActivity.class);
              startActivity(intent2);
              break;
          case R.id.main_diancan:
              Intent intent3 = new Intent();
              //设置Intent的class属性，跳转到SecondActivity
              intent3.setClass(MainActivity.this, ZhongxinActivity.class);
              startActivity(intent3);
              break;
          case R.id.main_sos:
              Intent intent4 = new Intent();
              //设置Intent的class属性，跳转到SecondActivity
              intent4.setClass(MainActivity.this, ZhongxinActivity.class);
              startActivity(intent4);
              break;
          case R.id.main_wuye:
              Intent intent5 = new Intent();
              //设置Intent的class属性，跳转到SecondActivity
              intent5.setClass(MainActivity.this, ZhongxinActivity.class);
              startActivity(intent5);
              break;
          case R.id.main_xiaoqu:
              Intent intent8 = new Intent();
              //设置Intent的class属性，跳转到SecondActivity
              intent8.setClass(MainActivity.this, XiaoquInfoActivity.class);
              startActivity(intent8);
              break;
          case R.id.main_hujiaozhongxin:
              Intent intent6 = new Intent();
              //设置Intent的class属性，跳转到SecondActivity
              intent6.setClass(MainActivity.this, ZhongxinActivity.class);
              startActivity(intent6);
              break;
          case R.id.main_yiliao:
              Intent intent7 = new Intent();
              //打开心云和爱牵挂
              intent7.setClass(MainActivity.this, YiliaoInfoActivity.class);
              startActivity(intent7);


              break;
          case R.id.main_zhihuijiaju:

//              Intent intent7 = new Intent();
//              //设置Intent的class属性，跳转到SecondActivity
//              intent7.setClass(MainActivity.this, ZhongxinActivity.class);
//              startActivity(intent7);
              Intent mIntent2 = new Intent("android.intent.action.MAIN");
              ComponentName comp2 = new ComponentName("com.ilifesmart.mslict", "com.ilifesmart.mslict.mslict");
              mIntent2.setComponent(comp2);
              mIntent2.addCategory("android.intent.category.LAUNCHER");
              startActivity(mIntent2);//启动
              break;
          default:
              break;
        }
    }
}
