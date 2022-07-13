package com.roy.android.hookdemo.javaproxy;

import android.util.Log;

/**
 * 真实主题类
 */
public class Liuwangshu implements IShop {

    @Override
    public void buy() {
        Log.i("TAG", "在帮lws购买 ");
    }
}
