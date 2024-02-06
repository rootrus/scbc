package com.kofax.mobile.sdk.p014aj;

import android.location.Location;
import android.location.LocationListener;

/* renamed from: com.kofax.mobile.sdk.aj.a */
public interface C0855a {
    /* renamed from: aG */
    boolean mo11943aG(String str);

    Location getLastKnownLocation(String str);

    /* renamed from: qU */
    boolean mo11945qU();

    void removeUpdates(LocationListener locationListener);

    void requestLocationUpdates(String str, long j, float f, LocationListener locationListener);
}
