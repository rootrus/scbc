package com.google.android.gms.internal.firebase_ml;

final class zzlm<E> extends zzlg<E> {
    static final zzlg<Object> zzadg = new zzlm(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzadh;

    zzlm(Object[] objArr, int i) {
        this.zzadh = objArr;
        this.size = i;
    }

    /* access modifiers changed from: package-private */
    public final int zzil() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzio() {
        return false;
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzik() {
        return this.zzadh;
    }

    /* access modifiers changed from: package-private */
    public final int zzim() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzadh, 0, objArr, i, this.size);
        return i + this.size;
    }

    public final E get(int i) {
        zzks.zzb(i, this.size);
        return this.zzadh[i];
    }
}
