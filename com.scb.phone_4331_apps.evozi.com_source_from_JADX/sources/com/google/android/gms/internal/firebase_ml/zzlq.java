package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzlq<K> extends zzll<K> {
    private final transient zzlg<K> zzacx;
    private final transient zzlj<K, ?> zzadk;

    zzlq(zzlj<K, ?> zzlj, zzlg<K> zzlg) {
        this.zzadk = zzlj;
        this.zzacx = zzlg;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzio() {
        return true;
    }

    public final zzlt<K> zzij() {
        return (zzlt) zzin().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzin().zza(objArr, i);
    }

    public final zzlg<K> zzin() {
        return this.zzacx;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.zzadk.get(obj) != null;
    }

    public final int size() {
        return this.zzadk.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
