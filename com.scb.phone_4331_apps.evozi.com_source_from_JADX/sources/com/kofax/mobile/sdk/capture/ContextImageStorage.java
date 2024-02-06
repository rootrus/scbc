package com.kofax.mobile.sdk.capture;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import p040o.HmlSetNTBPinActivity;

@HmlSetNTBPinActivity
public class ContextImageStorage implements IImageStorage {

    /* renamed from: YI */
    private static Map<String, Bitmap> f4495YI = new HashMap();

    public void setImage(Bitmap bitmap, String str) {
        f4495YI.put(str, bitmap);
    }

    public Bitmap getImage(String str) {
        return f4495YI.get(str);
    }

    public Bitmap removeImage(String str) {
        return f4495YI.remove(str);
    }
}
