
package com.roy.android.hookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.roy.android.hookdemo.javaproxy.DynamicPurchasing;
import com.roy.android.hookdemo.javaproxy.IShop;
import com.roy.android.hookdemo.javaproxy.InstrumentationProxy;
import com.roy.android.hookdemo.javaproxy.Liuwangshu;
import com.roy.android.hookdemo.javaproxy.StaticPurchasing;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

/**
 * 用于测试java的动态代理
 */

public class HookActviity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_dynamic_actviity);
    }

    public void staticProxy(View view) {
        IShop lws = new Liuwangshu();
        StaticPurchasing purchasing = new StaticPurchasing(lws);
        purchasing.buy();
    }

    public void dynamicProxy(View view) {
        IShop lws = new Liuwangshu();
        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(lws);
        ClassLoader clsloader = lws.getClass().getClassLoader();
        IShop purchasing = (IShop) Proxy.newProxyInstance(clsloader, new Class[]{IShop.class}, dynamicPurchasing);
        purchasing.buy();
    }

    public void hook(View view) {
            replaceActivityInstrumentation(this);
            startActivity(new Intent(this,SecondActivity.class));
    }

    private void replaceActivityInstrumentation(Activity activity){
        try {

            Field field=Activity.class.getDeclaredField("mInstrumentation");
            field.setAccessible(true);
            Instrumentation instrumentation= (Instrumentation) field.get(activity); //的到hook点
             InstrumentationProxy instrumentationProxy = new InstrumentationProxy(instrumentation); // 得到hook
            field.set(activity,instrumentationProxy); // 注入activity
        }catch (Throwable e){
            e.printStackTrace();
        }

    }
}