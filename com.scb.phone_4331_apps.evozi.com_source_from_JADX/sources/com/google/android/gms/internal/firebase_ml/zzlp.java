package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.Map;

final class zzlp extends zzlg<Map.Entry<K, V>> {
    private final /* synthetic */ zzlo zzadm;

    zzlp(zzlo zzlo) {
        this.zzadm = zzlo;
    }

    public final boolean zzio() {
        return true;
    }

    public final int size() {
        return this.zzadm.size;
    }

    public final /* synthetic */ Object get(int i) {
        zzks.zzb(i, this.zzadm.size);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zzadm.zzadd[i2], this.zzadm.zzadd[i2 + 1]);
    }
}
