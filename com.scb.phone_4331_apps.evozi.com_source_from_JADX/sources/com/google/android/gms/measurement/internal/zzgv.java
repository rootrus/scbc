package com.google.android.gms.measurement.internal;

abstract class zzgv extends zzgs {
    private boolean zza;

    zzgv(zzfy zzfy) {
        super(zzfy);
        this.zzy.zza(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f_ */
    public void mo7452f_() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zze();

    /* access modifiers changed from: package-private */
    public final boolean zzz() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzaa() {
        if (!zzz()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzab() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!zze()) {
            this.zzy.zzaf();
            this.zza = true;
        }
    }

    public final void zzac() {
        if (!this.zza) {
            mo7452f_();
            this.zzy.zzaf();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
