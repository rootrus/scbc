package com.kofax.mobile.sdk.p010af;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.impl.event.GPSEnabledEvent;
import com.kofax.mobile.sdk._internal.impl.event.LocationEvent;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import com.kofax.mobile.sdk.p014aj.C0855a;
import p040o.FragmentBuilder_BindEasycashReviewFragment;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk.af.f */
public class C0805f implements LocationListener {

    /* renamed from: UK */
    private static long f1957UK = 5000;

    /* renamed from: UL */
    private static float f1958UL = 10.0f;

    /* renamed from: UD */
    private boolean f1959UD;

    /* renamed from: UJ */
    private final C0855a f1960UJ;

    /* renamed from: UM */
    private double f1961UM;

    /* renamed from: UN */
    private double f1962UN;

    /* renamed from: UO */
    private boolean f1963UO = false;
    private final IBus _bus;

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @HmlPinActivity
    public C0805f(C0855a aVar, IBus iBus) {
        C0855a aVar2;
        if (iBus != null) {
            this._bus = iBus;
            iBus.register(this);
            if (aVar != null) {
                this.f1960UJ = aVar;
                if (aVar.mo11945qU()) {
                    this.f1959UD = this.f1960UJ.mo11943aG("gps");
                } else {
                    this.f1959UD = false;
                }
                if (this.f1959UD && (aVar2 = this.f1960UJ) != null) {
                    boolean aG = aVar2.mo11943aG("network");
                    Location lastKnownLocation = this.f1960UJ.getLastKnownLocation("gps");
                    if (aG && lastKnownLocation == null) {
                        lastKnownLocation = this.f1960UJ.getLastKnownLocation("network");
                    }
                    if (lastKnownLocation != null) {
                        this.f1961UM = lastKnownLocation.getLatitude();
                        this.f1962UN = lastKnownLocation.getLongitude();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("lm cannot be null");
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11964b(SurfaceChangedEvent surfaceChangedEvent) {
        if (surfaceChangedEvent.hasSurface) {
            mo11972rn();
        } else {
            mo11971rm();
        }
    }

    @FragmentBuilder_BindEasycashReviewFragment
    /* renamed from: rk */
    public LocationEvent mo11969rk() {
        return new LocationEvent(this.f1961UM, this.f1962UN);
    }

    @FragmentBuilder_BindEasycashReviewFragment
    /* renamed from: rl */
    public GPSEnabledEvent mo11970rl() {
        return new GPSEnabledEvent(this.f1959UD);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo11973v(boolean z) {
        if (!z || !this.f1960UJ.mo11945qU()) {
            this.f1959UD = false;
            mo11971rm();
        } else if (this.f1960UJ.mo11943aG("gps")) {
            this.f1959UD = true;
            mo11972rn();
        } else {
            this.f1959UD = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: rm */
    public void mo11971rm() {
        if (this.f1963UO) {
            this.f1960UJ.removeUpdates(this);
            this.f1963UO = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: rn */
    public void mo11972rn() {
        if (!this.f1963UO && this.f1959UD) {
            this.f1960UJ.requestLocationUpdates("gps", f1957UK, f1958UL, this);
            this.f1963UO = true;
        }
    }

    public void onLocationChanged(Location location) {
        this.f1961UM = location.getLatitude();
        this.f1962UN = location.getLongitude();
        this._bus.post(mo11969rk());
    }

    public void onProviderDisabled(String str) {
        this.f1959UD = false;
        mo11973v(false);
        this._bus.post(mo11970rl());
    }

    public void onProviderEnabled(String str) {
        this.f1959UD = true;
        mo11973v(true);
        this._bus.post(mo11970rl());
    }
}
