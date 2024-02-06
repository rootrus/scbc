package com.pingan.p031ai;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.pingan.ai.c */
public class C1021c {
    /* renamed from: a */
    public static String m2615a() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS", Locale.CHINA).format(new Date(System.currentTimeMillis()));
    }
}
