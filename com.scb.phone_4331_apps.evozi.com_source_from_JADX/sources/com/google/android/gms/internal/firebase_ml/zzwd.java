package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;

final class zzwd implements zzvm {
    private final int flags;
    private final String info;
    private final Object[] zzbqy;
    private final zzvo zzbrb;

    zzwd(zzvo zzvo, String str, Object[] objArr) {
        this.zzbrb = zzvo;
        this.info = str;
        this.zzbqy = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i++;
            } else {
                this.flags = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzsq() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzsr() {
        return this.zzbqy;
    }

    public final zzvo zzsj() {
        return this.zzbrb;
    }

    public final int zzsh() {
        return (this.flags & 1) == 1 ? zzue.zzf.zzbow : zzue.zzf.zzbox;
    }

    public final boolean zzsi() {
        return (this.flags & 2) == 2;
    }
}
