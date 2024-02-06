package com.google.android.gms.internal.firebase_ml;

abstract class zzkx extends zzjz<String> {
    private int limit;
    private int offset = 0;
    private final zzkc zzabj;
    private final boolean zzabk;
    final CharSequence zzabo;

    protected zzkx(zzku zzku, CharSequence charSequence) {
        this.zzabj = zzku.zzabj;
        this.zzabk = false;
        this.limit = zzku.limit;
        this.zzabo = charSequence;
    }

    /* access modifiers changed from: package-private */
    public abstract int zzaj(int i);

    /* access modifiers changed from: package-private */
    public abstract int zzak(int i);

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzid() {
        int i;
        int i2 = this.offset;
        while (true) {
            int i3 = this.offset;
            if (i3 != -1) {
                int zzaj = zzaj(i3);
                if (zzaj == -1) {
                    zzaj = this.zzabo.length();
                    this.offset = -1;
                } else {
                    this.offset = zzak(zzaj);
                }
                int i4 = this.offset;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.offset = i5;
                    if (i5 > this.zzabo.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i2 < zzaj && this.zzabj.zzb(this.zzabo.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.zzabj.zzb(this.zzabo.charAt(i - 1))) {
                        zzaj = i - 1;
                    }
                    if (!this.zzabk || i2 != i) {
                        int i6 = this.limit;
                    } else {
                        i2 = this.offset;
                    }
                }
            } else {
                zzie();
                return null;
            }
        }
        int i62 = this.limit;
        if (i62 == 1) {
            i = this.zzabo.length();
            this.offset = -1;
            while (i > i2 && this.zzabj.zzb(this.zzabo.charAt(i - 1))) {
                i--;
            }
        } else {
            this.limit = i62 - 1;
        }
        return this.zzabo.subSequence(i2, i).toString();
    }
}
