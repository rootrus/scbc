package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.Api;

public abstract class zzti {
    private int zzbks;
    private int zzbkt;
    private boolean zzbku;

    static zzti zza(byte[] bArr, int i, int i2, boolean z) {
        zztk zztk = new zztk(bArr, 0, i2, false);
        try {
            zztk.zzco(i2);
            return zztk;
        } catch (zzuo e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzcp(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzp(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int zzco(int i) throws zzuo;

    public abstract int zzqd();

    private zzti() {
        this.zzbks = 100;
        this.zzbkt = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzbku = false;
    }
}
