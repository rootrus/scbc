package com.kofax.mobile.sdk.p022j;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.kofax.mobile.sdk._internal.C0495c;

/* renamed from: com.kofax.mobile.sdk.j.f */
public class C0936f implements C0495c {

    /* renamed from: zM */
    private static final double f2248zM = 0.2d;

    /* renamed from: zN */
    private LruCache<String, Bitmap> f2249zN = new LruCache<String, Bitmap>(m2419jb()) {
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    };

    /* renamed from: jb */
    private int m2419jb() {
        return (int) (((double) (Runtime.getRuntime().maxMemory() / 1024)) * f2248zM);
    }

    /* renamed from: a */
    public boolean mo11136a(String str, Bitmap bitmap) {
        if (getBitmap(str) != null) {
            return false;
        }
        this.f2249zN.put(str, bitmap);
        return true;
    }

    public Bitmap getBitmap(String str) {
        return this.f2249zN.get(str);
    }

    /* renamed from: w */
    public Bitmap mo11138w(String str) {
        return this.f2249zN.remove(str);
    }
}
