package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzii extends AbstractList<String> implements zzgh, RandomAccess {
    /* access modifiers changed from: private */
    public final zzgh zza;

    public zzii(zzgh zzgh) {
        this.zza = zzgh;
    }

    public final zzgh zze() {
        return this;
    }

    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zza(zzeg zzeg) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzil(this, i);
    }

    public final Iterator<String> iterator() {
        return new zzik(this);
    }

    public final List<?> zzd() {
        return this.zza.zzd();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }
}
