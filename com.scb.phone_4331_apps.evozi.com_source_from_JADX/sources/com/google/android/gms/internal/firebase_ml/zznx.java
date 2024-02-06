package com.google.android.gms.internal.firebase_ml;

import android.app.Application;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class zznx {
    /* access modifiers changed from: private */
    public static final GmsLogger zzape = new GmsLogger("ModelResourceManager", "");
    private static zznx zzaqc;
    private final zznn zzapx = zznn.zzln();
    /* access modifiers changed from: private */
    public final AtomicLong zzapy = new AtomicLong(300000);
    private final Set<zznw> zzapz = new HashSet();
    /* access modifiers changed from: private */
    public final Set<zznw> zzaqa = new HashSet();
    private final ConcurrentHashMap<zznw, zznz> zzaqb = new ConcurrentHashMap<>();

    public static zznx zzb(FirebaseApp firebaseApp) {
        zznx zznx;
        synchronized (zznx.class) {
            if (zzaqc == null) {
                zzaqc = new zznx(firebaseApp);
            }
            zznx = zzaqc;
        }
        return zznx;
    }

    private zznx(FirebaseApp firebaseApp) {
        if (firebaseApp.getApplicationContext() instanceof Application) {
            BackgroundDetector.initialize((Application) firebaseApp.getApplicationContext());
        } else {
            zzape.mo4174e("ModelResourceManager", "No valid Application available and auto-manage cannot work");
        }
        BackgroundDetector.getInstance().addListener(new zzny(this));
        if (BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
            this.zzapy.set(2000);
        }
    }

    public final void zza(zznw zznw) {
        synchronized (this) {
            Preconditions.checkNotNull(zznw, "Model source can not be null");
            zzape.mo4172d("ModelResourceManager", "Add auto-managed model resource");
            if (this.zzapz.contains(zznw)) {
                zzape.mo4177i("ModelResourceManager", "The model resource is already registered.");
                return;
            }
            this.zzapz.add(zznw);
            zzb(zznw);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(com.google.android.gms.internal.firebase_ml.zznw r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0005
            monitor-exit(r3)
            return
        L_0x0005:
            com.google.android.gms.internal.firebase_ml.zznn r0 = r3.zzapx     // Catch:{ all -> 0x001e }
            com.google.android.gms.internal.firebase_ml.zznz r1 = new com.google.android.gms.internal.firebase_ml.zznz     // Catch:{ all -> 0x001e }
            java.lang.String r2 = "OPERATION_LOAD"
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x001e }
            r0.zza(r1)     // Catch:{ all -> 0x001e }
            java.util.Set<com.google.android.gms.internal.firebase_ml.zznw> r0 = r3.zzapz     // Catch:{ all -> 0x001e }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001c
            r3.zzc((com.google.android.gms.internal.firebase_ml.zznw) r4)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r3)
            return
        L_0x001e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zznx.zzb(com.google.android.gms.internal.firebase_ml.zznw):void");
    }

    /* access modifiers changed from: private */
    public final void zzlq() {
        synchronized (this) {
            for (zznw zzc : this.zzapz) {
                zzc(zzc);
            }
        }
    }

    private final void zzc(zznw zznw) {
        synchronized (this) {
            zznz zze = zze(zznw);
            this.zzapx.zzb(zze);
            long j = this.zzapy.get();
            GmsLogger gmsLogger = zzape;
            StringBuilder sb = new StringBuilder(62);
            sb.append("Rescheduling modelResource release after: ");
            sb.append(j);
            gmsLogger.mo4181v("ModelResourceManager", sb.toString());
            this.zzapx.zza(zze, j);
        }
    }

    public final void zzd(zznw zznw) {
        synchronized (this) {
            if (zznw != null) {
                zznz zze = zze(zznw);
                this.zzapx.zzb(zze);
                this.zzapx.zza(zze, 0);
            }
        }
    }

    private final zznz zze(zznw zznw) {
        this.zzaqb.putIfAbsent(zznw, new zznz(this, zznw, "OPERATION_RELEASE"));
        return this.zzaqb.get(zznw);
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zznw zznw) throws FirebaseMLException {
        if (!this.zzaqa.contains(zznw)) {
            try {
                zznw.zzlp();
                this.zzaqa.add(zznw);
            } catch (RuntimeException e) {
                throw new FirebaseMLException("The load task failed", 13, e);
            }
        }
    }
}
