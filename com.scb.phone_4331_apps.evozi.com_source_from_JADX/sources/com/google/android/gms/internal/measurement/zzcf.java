package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzcf extends ContentObserver {
    zzcf(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzcg.zze.set(true);
    }
}
