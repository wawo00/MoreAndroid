package com.roy.android.hookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testProxy(View view) {
        startActivity(new Intent(this, HookActviity.class));
    }

    public void testLancet(View view) {
        startActivity(new Intent(this,UseLancetActivity.class));
    }
}