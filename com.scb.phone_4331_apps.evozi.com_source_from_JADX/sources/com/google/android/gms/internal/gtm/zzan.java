package com.google.android.gms.internal.gtm;

public abstract class zzan extends zzam {
    private boolean zzwd;

    public zzan(zzap zzap) {
        super(zzap);
    }

    /* access modifiers changed from: protected */
    public abstract void zzaw();

    public final boolean isInitialized() {
        return this.zzwd;
    }

    public final void zzdb() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzag() {
        zzaw();
        this.zzwd = true;
    }
}
