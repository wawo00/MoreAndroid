package com.roy.android.hookdemo.uselancet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public class Tools {
    public static void evilCode() {
        int a = 1 / 0;
    }

    public static String getClipBoardStrWIthEvilCode(Context context) {
        evilCode();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt == null) {
            return "";
        }
        CharSequence text = itemAt.getText();
        if (text == null) {
            return "";
        }
        return text.toString();
    }
    public static String getClipBoardStr(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt == null) {
            return "";
        }
        CharSequence text = itemAt.getText();
        if (text == null) {
            return "";
        }
        return text.toString();
    }


}
