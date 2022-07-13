package com.roy.android.hookdemo.uselancet;

import me.ele.lancet.base.Origin;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public class ToolsLancet {

//    @TargetClass("com.roy.android.hookdemo.uselancet.Tools")
//    @Insert("evilCode")
//    public static void evilCode(){
//        try {
//            Origin.callVoid();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    /**
     * 替换为空方法
     */
    @TargetClass("com.roy.android.hookdemo.uselancet.Tools")
    @Insert("evilCode")
    public static void evilCode(){}
}
