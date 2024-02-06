package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzhv extends zzib {
    private final /* synthetic */ zzhq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzhv(zzhq zzhq) {
        super(zzhq, (zzht) null);
        this.zza = zzhq;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzhs(this.zza, (zzht) null);
    }

    /* synthetic */ zzhv(zzhq zzhq, zzht zzht) {
        this(zzhq);
    }
}
