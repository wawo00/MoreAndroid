package com.roy.android.hookdemo.uselancet;

import android.content.ClipData;

import me.ele.lancet.base.Origin;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class ProxyLog {
    @TargetClass("android.util.Log")
    @Proxy("i")
    public static int anyName(String tag, String msg){
        tag = tag + "lancet";
        return (int) Origin.call();
    }

    @TargetClass("android.content.ClipboardManager")
    @Proxy("getPrimaryClip")
    public ClipData getPrimaryClip(){
        return new ClipData("木有授权",new String[]{"text/plain"},new ClipData.Item("123"));
    }

}
