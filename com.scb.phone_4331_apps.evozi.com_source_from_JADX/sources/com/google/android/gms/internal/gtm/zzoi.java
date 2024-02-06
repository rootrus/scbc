package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzoi implements Iterator<zzoa<?>> {
    private int currentIndex = 0;
    private final /* synthetic */ zzoh zzauq;

    zzoi(zzoh zzoh) {
        this.zzauq = zzoh;
    }

    public final boolean hasNext() {
        for (int i = this.currentIndex; i < this.zzauq.zzaup.size(); i++) {
            if (this.zzauq.zzaup.get(i) != null) {
                return true;
            }
        }
        return false;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        if (this.currentIndex < this.zzauq.zzaup.size()) {
            for (int i = this.currentIndex; i < this.zzauq.zzaup.size(); i++) {
                if (this.zzauq.zzaup.get(i) != null) {
                    this.currentIndex = i;
                    this.currentIndex = i + 1;
                    return new zzoe(Double.valueOf((double) i));
                }
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
