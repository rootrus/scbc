package com.kofax.mobile.sdk.p015ak;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: com.kofax.mobile.sdk.ak.c */
public class C0859c {
    /* renamed from: a */
    public static Bitmap m2231a(Context context, String str) {
        Resources resources = context.getResources();
        return BitmapFactory.decodeResource(resources, resources.getIdentifier(str, "drawable", context.getPackageName()));
    }
}
