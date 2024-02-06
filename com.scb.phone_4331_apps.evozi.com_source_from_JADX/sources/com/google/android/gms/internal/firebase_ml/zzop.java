package com.google.android.gms.internal.firebase_ml;

import android.net.Uri;

public final class zzop {
    /* access modifiers changed from: private */
    public final String zzaqg;
    /* access modifiers changed from: private */
    public final Uri zzaqy;
    /* access modifiers changed from: private */
    public final String zzaqz;
    private final zzok zzara;

    public zzop(String str, Uri uri, String str2, zzok zzok) {
        this.zzaqg = str;
        this.zzaqy = uri;
        this.zzaqz = str2;
        this.zzara = zzok;
    }

    public final String getModelName() {
        return this.zzaqg;
    }

    public final String zzmd() {
        return this.zzaqz;
    }

    public final zzok zzme() {
        return this.zzara;
    }
}
