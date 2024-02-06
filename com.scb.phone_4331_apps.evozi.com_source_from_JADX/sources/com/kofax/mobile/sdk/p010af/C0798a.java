package com.kofax.mobile.sdk.p010af;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.kofax.mobile.sdk.p014aj.C0855a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.af.a */
public final class C0798a implements C0855a {
    @HmlPinActivity

    /* renamed from: Ub */
    C0854b f1914Ub;
    @HmlPinActivity

    /* renamed from: Uc */
    LocationManager f1915Uc;
    private final Context _ctx;

    @HmlPinActivity
    C0798a(Context context) {
        this._ctx = context;
    }

    public final void requestLocationUpdates(String str, long j, float f, LocationListener locationListener) {
        this.f1915Uc.requestLocationUpdates(str, j, f, locationListener);
    }

    public final Location getLastKnownLocation(String str) {
        return this.f1915Uc.getLastKnownLocation(str);
    }

    public final void removeUpdates(LocationListener locationListener) {
        this.f1915Uc.removeUpdates(locationListener);
    }

    /* renamed from: qU */
    public final boolean mo11945qU() {
        return this.f1914Ub.mo11933a("android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: aG */
    public final boolean mo11943aG(String str) {
        return this.f1915Uc.isProviderEnabled(str);
    }
}
