package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfq;
import com.google.android.gms.measurement.internal.zzft;
import p040o.create;

public final class AppMeasurementReceiver extends create implements zzft {
    private zzfq zza;

    public final void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfq(this);
        }
        this.zza.zza(context, intent);
    }

    public final void doStartService(Context context, Intent intent) {
        startWakefulService(context, intent);
    }

    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }
}
