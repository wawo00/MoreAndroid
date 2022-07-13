package com.roy.android.hookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.roy.android.hookdemo.uselancet.Tools;

public class UseLancetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_lancet);
        Log.i("TAG", "onCreate: 进入了UseLancetActivity");
    }

    public void crash(View view) {
        String str=Tools.getClipBoardStrWIthEvilCode(this);
        Log.i("TAG", "crash: "+str);
    }

    public void proxySystem(View view) {
        String str=Tools.getClipBoardStr(this);
        Log.i("TAG", "proxySystem: "+str);
    }
}