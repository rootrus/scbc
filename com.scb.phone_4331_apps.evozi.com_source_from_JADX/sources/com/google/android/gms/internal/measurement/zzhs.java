package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzhs implements Iterator<Map.Entry<K, V>> {
    private int zza;
    private Iterator<Map.Entry<K, V>> zzb;
    private final /* synthetic */ zzhq zzc;

    private zzhs(zzhq zzhq) {
        this.zzc = zzhq;
        this.zza = this.zzc.zzb.size();
    }

    public final boolean hasNext() {
        int i = this.zza;
        return (i > 0 && i <= this.zzc.zzb.size()) || zza().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        List zzb2 = this.zzc.zzb;
        int i = this.zza - 1;
        this.zza = i;
        return (Map.Entry) zzb2.get(i);
    }

    /* synthetic */ zzhs(zzhq zzhq, zzht zzht) {
        this(zzhq);
    }
}
