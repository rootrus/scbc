package com.google.android.gms.measurement.internal;

abstract class zzg extends zzd {
    private boolean zza;

    zzg(zzfy zzfy) {
        super(zzfy);
        this.zzy.zza(this);
    }

    /* access modifiers changed from: protected */
    public void zzaa() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzz();

    /* access modifiers changed from: package-private */
    public final boolean zzv() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzw() {
        if (!zzv()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!zzz()) {
            this.zzy.zzaf();
            this.zza = true;
        }
    }

    public final void zzy() {
        if (!this.zza) {
            zzaa();
            this.zzy.zzaf();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
