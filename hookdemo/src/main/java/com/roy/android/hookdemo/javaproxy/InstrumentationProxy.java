package com.roy.android.hookdemo.javaproxy;


import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import java.lang.reflect.Method;

/**
 * 用于hoook startactivity
 */
public class InstrumentationProxy extends Instrumentation {
    private String TAG = "hook";
    Instrumentation mInstrumentation;

    public InstrumentationProxy(Instrumentation instrumentation) {
        mInstrumentation = instrumentation;
    }

    public ActivityResult execStartActivity(Context who,IBinder contextThread,IBinder token,Activity target,Intent intent,int requestCode,Bundle options) {
        Log.i(TAG, "hook成功 ");
        try {
            Method execStartAct=Instrumentation.class.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, int.class, Bundle.class);
            return (ActivityResult) execStartAct.invoke(mInstrumentation,who,contextThread,token,target,intent,requestCode,options);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
