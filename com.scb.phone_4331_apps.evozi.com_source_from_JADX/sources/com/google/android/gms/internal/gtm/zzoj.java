package com.google.android.gms.internal.gtm;

import java.util.Iterator;

final class zzoj implements Iterator<zzoa<?>> {
    private final /* synthetic */ Iterator zzaur;
    private final /* synthetic */ Iterator zzaus;

    zzoj(zzoh zzoh, Iterator it, Iterator it2) {
        this.zzaur = it;
        this.zzaus = it2;
    }

    public final boolean hasNext() {
        return this.zzaur.hasNext() || this.zzaus.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        if (this.zzaur.hasNext()) {
            return (zzoa) this.zzaur.next();
        }
        return (zzoa) this.zzaus.next();
    }
}
