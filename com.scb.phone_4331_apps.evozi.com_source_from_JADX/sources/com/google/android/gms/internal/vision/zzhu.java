package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

final class zzhu implements zzhd {
    private final int flags;
    private final String info;
    private final Object[] zzze;
    private final zzhf zzzh;

    zzhu(zzhf zzhf, String str, Object[] objArr) {
        this.zzzh = zzhf;
        this.info = str;
        this.zzze = objArr;
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
    public final String zzgn() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzgo() {
        return this.zzze;
    }

    public final zzhf zzgg() {
        return this.zzzh;
    }

    public final int zzge() {
        return (this.flags & 1) == 1 ? zzfy.zzg.zzxf : zzfy.zzg.zzxg;
    }

    public final boolean zzgf() {
        return (this.flags & 2) == 2;
    }
}
