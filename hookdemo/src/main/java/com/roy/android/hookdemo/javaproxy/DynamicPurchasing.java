package com.roy.android.hookdemo.javaproxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class DynamicPurchasing implements InvocationHandler {
    private Object obj;

    public DynamicPurchasing(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args); //  在帮lws购买
        if (method.getName().equals("buy")){
            Log.i("TAG", "liuwangshu在买买买: "); // liuwangshu在买买买
        }
        return result;
    }
}
