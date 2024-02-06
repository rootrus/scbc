package com.kofax.mobile.sdk._internal.view;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: com.kofax.mobile.sdk._internal.view.p */
public class C0779p {
    /* renamed from: n */
    public static boolean m1851n(int i, int i2) {
        if ((i == 0 || i == 2) && i2 == 2) {
            return true;
        }
        return (i == 1 || i == 3) && i2 == 1;
    }

    /* renamed from: a */
    public static int m1848a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static int m1849b(Context context, float f) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static int m1850c(Context context, float f) {
        return (int) (f / context.getResources().getDisplayMetrics().density);
    }
}
