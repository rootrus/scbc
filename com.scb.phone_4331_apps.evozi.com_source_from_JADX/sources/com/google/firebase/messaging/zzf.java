package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzbc;
import com.google.firebase.iid.zzbd;
import java.util.concurrent.ExecutorService;

public abstract class zzf extends Service {
    private final ExecutorService zza = zza.zza().zza(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), com.google.android.gms.internal.firebase_messaging.zzf.zzb);
    private Binder zzb;
    private final Object zzc = new Object();
    private int zzd;
    private int zze = 0;

    /* access modifiers changed from: protected */
    public Intent zza(Intent intent) {
        return intent;
    }

    public boolean zzb(Intent intent) {
        return false;
    }

    public abstract void zzc(Intent intent);

    public final IBinder onBind(Intent intent) {
        Binder binder;
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.zzb == null) {
                this.zzb = new zzbc(new zze(this));
            }
            binder = this.zzb;
        }
        return binder;
    }

    /* access modifiers changed from: private */
    /* renamed from: zze */
    public final Task<Void> zzd(Intent intent) {
        if (zzb(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.execute(new zzh(this, intent, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.zzc) {
            this.zzd = i2;
            this.zze++;
        }
        Intent zza2 = zza(intent);
        if (zza2 == null) {
            zzf(intent);
            return 2;
        }
        Task<Void> zze2 = zzd(zza2);
        if (zze2.isComplete()) {
            zzf(intent);
            return 2;
        }
        zze2.addOnCompleteListener(zzg.zza, (OnCompleteListener<Void>) new zzj(this, intent));
        return 3;
    }

    public void onDestroy() {
        this.zza.shutdown();
        super.onDestroy();
    }

    private final void zzf(Intent intent) {
        if (intent != null) {
            zzbd.zza(intent);
        }
        synchronized (this.zzc) {
            int i = this.zze - 1;
            this.zze = i;
            if (i == 0) {
                stopSelfResult(this.zzd);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Intent intent, Task task) {
        zzf(intent);
    }
}
