package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.Api;

final class zztk extends zzti {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbkv;
    private int zzbkw;
    private int zzbkx;
    private int zzbky;

    private zztk(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbky = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbkx = i;
        this.zzbkv = z;
    }

    public final int zzco(int i) throws zzuo {
        if (i >= 0) {
            int zzqd = i + zzqd();
            int i2 = this.zzbky;
            if (zzqd <= i2) {
                this.zzbky = zzqd;
                int i3 = this.limit + this.zzbkw;
                this.limit = i3;
                int i4 = i3 - this.zzbkx;
                if (i4 > zzqd) {
                    int i5 = i4 - zzqd;
                    this.zzbkw = i5;
                    this.limit = i3 - i5;
                } else {
                    this.zzbkw = 0;
                }
                return i2;
            }
            throw zzuo.zzrm();
        }
        throw zzuo.zzrn();
    }

    public final int zzqd() {
        return this.pos - this.zzbkx;
    }
}
