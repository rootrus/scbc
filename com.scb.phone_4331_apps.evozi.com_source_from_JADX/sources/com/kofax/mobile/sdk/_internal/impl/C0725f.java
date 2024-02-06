package com.kofax.mobile.sdk._internal.impl;

import android.graphics.Bitmap;
import com.kofax.mobile.sdk._internal.C0494a;
import com.kofax.mobile.sdk._internal.C0518d;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.f */
public class C0725f implements C0518d {

    /* renamed from: vS */
    private final C0494a f1679vS;

    @HmlPinActivity
    public C0725f(C0494a aVar) {
        this.f1679vS = aVar;
    }

    /* renamed from: g */
    public byte[] mo11323g(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return this.f1679vS.mo11135a(iArr, width, height);
    }
}
