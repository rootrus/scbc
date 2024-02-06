package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import android.content.res.AssetManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.view.WindowManager;

/* renamed from: com.kofax.mobile.sdk.ah.a */
public class C0810a {
    /* renamed from: q */
    public WindowManager mo12018q(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    /* renamed from: r */
    public AssetManager mo12019r(Context context) {
        return context.getAssets();
    }

    /* renamed from: s */
    public SensorManager mo12020s(Context context) {
        return (SensorManager) context.getSystemService("sensor");
    }

    /* renamed from: t */
    public LocationManager mo12021t(Context context) {
        return (LocationManager) context.getSystemService("location");
    }

    /* renamed from: u */
    public ConnectivityManager mo12022u(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }
}
