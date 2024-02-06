package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzcj extends ContentObserver {
    private final /* synthetic */ zzch zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcj(zzch zzch, Handler handler) {
        super((Handler) null);
        this.zza = zzch;
    }

    public final void onChange(boolean z) {
        this.zza.zzb();
    }
}
