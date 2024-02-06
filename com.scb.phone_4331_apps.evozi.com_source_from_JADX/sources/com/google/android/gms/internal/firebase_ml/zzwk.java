package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

final class zzwk extends zzwq {
    private final /* synthetic */ zzwh zzbsf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzwk(zzwh zzwh) {
        super(zzwh, (zzwi) null);
        this.zzbsf = zzwh;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzwj(this.zzbsf, (zzwi) null);
    }

    /* synthetic */ zzwk(zzwh zzwh, zzwi zzwi) {
        this(zzwh);
    }
}
