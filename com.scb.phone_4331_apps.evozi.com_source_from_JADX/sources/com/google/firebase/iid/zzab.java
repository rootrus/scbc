package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.internal.firebase_messaging.zzf;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;

public final class zzab {
    private static zzab zza;
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    private zzac zzd = new zzac(this);
    private int zze = 1;

    public static zzab zza(Context context) {
        zzab zzab;
        synchronized (zzab.class) {
            if (zza == null) {
                zza = new zzab(context, zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), zzf.zzb));
            }
            zzab = zza;
        }
        return zzab;
    }

    private zzab(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return zza(new zzak(zza(), 2, bundle));
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return zza(new zzap(zza(), 1, bundle));
    }

    private final <T> Task<T> zza(zzan<T> zzan) {
        Task<T> task;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(zzan);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.zzd.zza((zzan<?>) zzan)) {
                zzac zzac = new zzac(this);
                this.zzd = zzac;
                zzac.zza((zzan<?>) zzan);
            }
            task = zzan.zzb.getTask();
        }
        return task;
    }

    private final int zza() {
        int i;
        synchronized (this) {
            i = this.zze;
            this.zze = i + 1;
        }
        return i;
    }
}
