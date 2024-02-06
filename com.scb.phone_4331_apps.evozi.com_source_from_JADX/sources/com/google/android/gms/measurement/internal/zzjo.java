package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.measurement.internal.zzjs;

public final class zzjo<T extends Context & zzjs> {
    private final T zza;

    public zzjo(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    public final void zza() {
        zzfy zza2 = zzfy.zza(this.zza, (zzae) null, (Long) null);
        zzeu zzr = zza2.zzr();
        zza2.zzu();
        zzr.zzx().zza("Local AppMeasurementService is starting up");
    }

    public final void zzb() {
        zzfy zza2 = zzfy.zza(this.zza, (zzae) null, (Long) null);
        zzeu zzr = zza2.zzr();
        zza2.zzu();
        zzr.zzx().zza("Local AppMeasurementService is shutting down");
    }

    public final int zza(Intent intent, int i, int i2) {
        zzfy zza2 = zzfy.zza(this.zza, (zzae) null, (Long) null);
        zzeu zzr = zza2.zzr();
        if (intent == null) {
            zzr.zzi().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zza2.zzu();
        zzr.zzx().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza((Runnable) new zzjr(this, i2, zzr, intent));
        }
        return 2;
    }

    private final void zza(Runnable runnable) {
        zzkj zza2 = zzkj.zza((Context) this.zza);
        zza2.zzq().zza((Runnable) new zzjt(this, zza2, runnable));
    }

    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgd(zzkj.zza((Context) this.zza));
        }
        zzc().zzi().zza("onBind received unknown action", action);
        return null;
    }

    public final boolean zzb(Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzx().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final boolean zza(JobParameters jobParameters) {
        zzfy zza2 = zzfy.zza(this.zza, (zzae) null, (Long) null);
        zzeu zzr = zza2.zzr();
        String string = jobParameters.getExtras().getString("action");
        zza2.zzu();
        zzr.zzx().zza("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zza((Runnable) new zzjq(this, zzr, jobParameters));
        return true;
    }

    public final void zzc(Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onRebind called with null intent");
            return;
        }
        zzc().zzx().zza("onRebind called. action", intent.getAction());
    }

    private final zzeu zzc() {
        return zzfy.zza(this.zza, (zzae) null, (Long) null).zzr();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzeu zzeu, JobParameters jobParameters) {
        zzeu.zzx().zza("AppMeasurementJobService processed last upload request.");
        ((zzjs) this.zza).zza(jobParameters, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, zzeu zzeu, Intent intent) {
        if (((zzjs) this.zza).zza(i)) {
            zzeu.zzx().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzx().zza("Completed wakeful intent.");
            ((zzjs) this.zza).zza(intent);
        }
    }
}
