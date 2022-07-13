package com.roy.android.hookdemo.uselancet;

import android.content.ClipData;

import me.ele.lancet.base.Origin;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

/**
 * 代理系统的服务，来实现用户授权之后才能使用剪贴板
 */
public class ToolsLancetAuth {
//     boolean isAuth = false;
//    //注意这里使用的是@proxy
//    @TargetClass("android.content.ClipboardManager")
//    @Proxy("getPrimaryClip")
//    public ClipData getPrimaryClip(){
//        if (isAuth){
//            return (ClipData) Origin.call();
//        }
//        return new ClipData("木有授权",new String[]{"text/plain"},new ClipData.Item("123"));
//    }

    /**
     * 替换为空方法
     */
//    @TargetClass("com.roy.android.hookdemo.uselancet.Tools")
//    @Insert("evilCode")
//    public static void evilCode(){}
}
