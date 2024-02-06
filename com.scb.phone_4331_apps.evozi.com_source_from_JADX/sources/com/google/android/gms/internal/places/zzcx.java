package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;

final class zzcx implements zzci {
    private final int flags;
    private final String info;
    private final Object[] zzkt;
    private final zzck zzkw;

    zzcx(zzck zzck, String str, Object[] objArr) {
        this.zzkw = zzck;
        this.info = str;
        this.zzkt = objArr;
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
    public final String zzcr() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzcs() {
        return this.zzkt;
    }

    public final zzck zzcl() {
        return this.zzkw;
    }

    public final int zzcj() {
        return (this.flags & 1) == 1 ? zzbc.zze.zzit : zzbc.zze.zziu;
    }

    public final boolean zzck() {
        return (this.flags & 2) == 2;
    }
}
