package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.Callable;

public final class zznq {
    private static final GmsLogger zzape = new GmsLogger("MLTaskManager", "");
    private static zznq zzapf;
    /* access modifiers changed from: private */
    public final zznx zzapg;

    private zznq(FirebaseApp firebaseApp) {
        this.zzapg = zznx.zzb(firebaseApp);
    }

    public static zznq zza(FirebaseApp firebaseApp) {
        zznq zznq;
        synchronized (zznq.class) {
            if (zzapf == null) {
                zzapf = new zznq(firebaseApp);
            }
            zznq = zzapf;
        }
        return zznq;
    }

    public final <T, S extends zznp> void zza(zznm<T, S> zznm) {
        zznw zzlm = zznm.zzlm();
        if (zzlm != null) {
            this.zzapg.zza(zzlm);
        }
    }

    public final <T, S extends zznp> void zzb(zznm<T, S> zznm) {
        zznw zzlm = zznm.zzlm();
        if (zzlm != null) {
            this.zzapg.zzd(zzlm);
        }
    }

    public final <TResult> Task<TResult> zza(zznw zznw, Callable<TResult> callable) {
        Task<TResult> zza;
        synchronized (this) {
            Preconditions.checkNotNull(callable, "Operation can not be null");
            Preconditions.checkNotNull(zznw, "Model resource can not be null");
            zzape.mo4172d("MLTaskManager", "Execute task");
            zza = zznn.zzln().zza(new zznr(this, zznw, callable));
        }
        return zza;
    }

    public final <T, S extends zznp> Task<T> zza(zznm<T, S> zznm, S s) {
        Task<T> zza;
        synchronized (this) {
            Preconditions.checkNotNull(zznm, "Operation can not be null");
            Preconditions.checkNotNull(s, "Input can not be null");
            zzape.mo4172d("MLTaskManager", "Execute task");
            zza = zznn.zzln().zza(new zzns(this, zznm.zzlm(), zznm, s));
        }
        return zza;
    }
}
