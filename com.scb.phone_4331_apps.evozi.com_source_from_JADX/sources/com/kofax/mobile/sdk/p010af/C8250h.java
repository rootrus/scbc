package com.kofax.mobile.sdk.p010af;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;

/* renamed from: com.kofax.mobile.sdk.af.h */
class C8250h implements LocationListener {

    /* renamed from: UK */
    private static long f4393UK = 5000;

    /* renamed from: UL */
    private static float f4394UL = 10.0f;

    /* renamed from: UD */
    boolean f4395UD;

    /* renamed from: UM */
    double f4396UM;

    /* renamed from: UN */
    double f4397UN;

    /* renamed from: UO */
    private boolean f4398UO = false;

    /* renamed from: UQ */
    LocationManager f4399UQ;

    /* renamed from: V */
    private Context f4400V = null;

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public double getLatitude() {
        return this.f4396UM;
    }

    public double getLongitude() {
        return this.f4397UN;
    }

    C8250h(Context context, LocationManager locationManager) {
        Location lastKnownLocation;
        this.f4400V = context;
        this.f4399UQ = locationManager;
        if (m4562qU()) {
            this.f4395UD = Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "gps");
        } else {
            this.f4395UD = false;
        }
        if (this.f4395UD) {
            this.f4399UQ.requestLocationUpdates("gps", f4393UK, f4394UL, this);
            LocationManager locationManager2 = this.f4399UQ;
            if (!(locationManager2 == null || (lastKnownLocation = locationManager2.getLastKnownLocation("gps")) == null)) {
                this.f4396UM = lastKnownLocation.getLatitude();
                this.f4397UN = lastKnownLocation.getLongitude();
            }
            this.f4398UO = true;
        }
    }

    /* renamed from: rp */
    public boolean mo54715rp() {
        return this.f4395UD;
    }

    /* renamed from: v */
    public void mo54718v(boolean z) {
        if (!z || !m4562qU()) {
            this.f4395UD = false;
            mo54716rq();
        } else if (Settings.Secure.isLocationProviderEnabled(this.f4400V.getContentResolver(), "gps")) {
            this.f4395UD = true;
            mo54717rr();
        } else {
            this.f4395UD = false;
        }
    }

    /* renamed from: rq */
    public void mo54716rq() {
        if (this.f4398UO) {
            this.f4399UQ.removeUpdates(this);
            this.f4398UO = false;
        }
    }

    /* renamed from: rr */
    public void mo54717rr() {
        if (!this.f4398UO) {
            this.f4399UQ.requestLocationUpdates("gps", f4393UK, f4394UL, this);
            this.f4398UO = true;
        }
    }

    public void onLocationChanged(Location location) {
        this.f4396UM = location.getLatitude();
        this.f4397UN = location.getLongitude();
    }

    public void onProviderDisabled(String str) {
        this.f4395UD = false;
        mo54716rq();
    }

    public void onProviderEnabled(String str) {
        this.f4395UD = true;
        mo54717rr();
    }

    /* renamed from: qU */
    private boolean m4562qU() {
        return this.f4400V.getPackageManager().checkPermission("android.permission.ACCESS_FINE_LOCATION", this.f4400V.getPackageName()) == 0;
    }
}
