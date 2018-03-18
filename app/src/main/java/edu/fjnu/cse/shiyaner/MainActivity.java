package edu.fjnu.cse.shiyaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;

    /**
     * Activity创建时被调用
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.e("onCreate is invoke!!!");
        bt= (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
    }


    /**
     * Activity从后台重新回到前台时被调用
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.e("onRestart is invoke!!!");
    }

    /**
     *Activity创建或者从后台重新回到前台时被调用
     */
    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.e("onStart is invoke!!!");
    }


    /**
     *Activity创建或者从被覆盖、后台重新回到前台时被调用
     */
    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.e("onResume is invoke!!!");
    }

    /**
     *  Activity被覆盖到下面或者锁屏时被调用
     */
    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.e("onPause is invoke!!!");
    }

    /**
     *退出当前Activity或者跳转到新Activity时被调用
     */
    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.e("onStop is invoke!!!");
    }

    /**
     *退出当前Activity时被调用,调用之后Activity就结束了
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.e("onDestroy is invoke!!!");
    }
}