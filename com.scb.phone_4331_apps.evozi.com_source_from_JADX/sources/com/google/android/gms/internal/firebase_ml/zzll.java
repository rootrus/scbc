package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzll<E> extends zzlf<E> implements Set<E> {
    @NullableDecl
    private transient zzlg<E> zzadf;

    zzll() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return zzls.zza(this, obj);
    }

    public int hashCode() {
        return zzls.zzb(this);
    }

    public zzlg<E> zzin() {
        zzlg<E> zzlg = this.zzadf;
        if (zzlg != null) {
            return zzlg;
        }
        zzlg<E> zziu = zziu();
        this.zzadf = zziu;
        return zziu;
    }

    /* access modifiers changed from: package-private */
    public zzlg<E> zziu() {
        return zzlg.zza(toArray());
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
