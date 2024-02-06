package com.google.android.gms.internal.firebase_ml;

final class zzte {
    private final byte[] buffer;
    private final zztl zzbkr;

    private zzte(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzbkr = zztl.zzg(bArr);
    }

    public final zzsw zzqb() {
        this.zzbkr.zzqf();
        return new zztg(this.buffer);
    }

    public final zztl zzqc() {
        return this.zzbkr;
    }

    /* synthetic */ zzte(int i, zzsx zzsx) {
        this(i);
    }
}
