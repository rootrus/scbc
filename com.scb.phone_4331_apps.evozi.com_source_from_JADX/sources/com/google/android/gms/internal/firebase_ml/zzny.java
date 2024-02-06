package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.GmsLogger;

final class zzny implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zznx zzaqd;

    zzny(zznx zznx) {
        this.zzaqd = zznx;
    }

    public final void onBackgroundStateChanged(boolean z) {
        GmsLogger zzlr = zznx.zzape;
        StringBuilder sb = new StringBuilder(34);
        sb.append("Background state changed to: ");
        sb.append(z);
        zzlr.mo4181v("ModelResourceManager", sb.toString());
        this.zzaqd.zzapy.set(z ? 2000 : 300000);
        this.zzaqd.zzlq();
    }
}
