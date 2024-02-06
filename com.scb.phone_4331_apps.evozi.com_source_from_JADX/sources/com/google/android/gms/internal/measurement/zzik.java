package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzik implements Iterator<String> {
    private Iterator<String> zza = this.zzb.zza.iterator();
    private final /* synthetic */ zzii zzb;

    zzik(zzii zzii) {
        this.zzb = zzii;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return this.zza.next();
    }
}
