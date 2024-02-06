package com.google.android.gms.internal.firebase_ml;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.p067ml.common.modeldownload.FirebaseRemoteModel;

public final class zzoo {
    private static final GmsLogger zzaoz = new GmsLogger("ModelDownloadManager", "");
    private final Context zzad;
    private final FirebaseApp zzapo;
    private final DownloadManager zzaqu;
    private final FirebaseRemoteModel zzaqv;
    private final zzon zzaqw;
    private final zzoq zzaqx;

    zzoo(FirebaseApp firebaseApp, zzoq zzoq, FirebaseRemoteModel firebaseRemoteModel, zzon zzon) {
        this.zzapo = firebaseApp;
        this.zzaqx = zzoq;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzad = applicationContext;
        this.zzaqv = firebaseRemoteModel;
        DownloadManager downloadManager = (DownloadManager) applicationContext.getSystemService("download");
        this.zzaqu = downloadManager;
        if (downloadManager == null) {
            zzaoz.mo4172d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzaqw = zzon;
    }

    /* access modifiers changed from: package-private */
    public final Long zzlv() throws FirebaseMLException {
        synchronized (this) {
            zzop zzmc = zzmc();
            if (zzmc == null) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(this.zzaqv.zzmj());
                gmsLogger.mo4172d("ModelDownloadManager", valueOf.length() != 0 ? "No model updates for model: ".concat(valueOf) : new String("No model updates for model: "));
                return null;
            }
            Long zza = zza(zzmc);
            return zza;
        }
    }

    /* access modifiers changed from: package-private */
    public final Long zzlw() {
        Long zza;
        synchronized (this) {
            zza = zzoa.zza(this.zzapo, this.zzaqv.zzmj());
        }
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final String zzlx() {
        String zzc;
        synchronized (this) {
            zzc = zzoa.zzc(this.zzapo, this.zzaqv.zzmj());
        }
        return zzc;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzly() throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.Long r0 = r6.zzlw()     // Catch:{ all -> 0x005e }
            android.app.DownloadManager r1 = r6.zzaqu     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r0 != 0) goto L_0x000c
            goto L_0x005c
        L_0x000c:
            com.google.android.gms.common.internal.GmsLogger r1 = zzaoz     // Catch:{ all -> 0x005e }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x005e }
            int r3 = r3.length()     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            int r3 = r3 + 44
            r4.<init>(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "Cancel or remove existing downloading task: "
            r4.append(r3)     // Catch:{ all -> 0x005e }
            r4.append(r2)     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "ModelDownloadManager"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x005e }
            r1.mo4172d(r2, r3)     // Catch:{ all -> 0x005e }
            android.app.DownloadManager r1 = r6.zzaqu     // Catch:{ all -> 0x005e }
            r2 = 1
            long[] r2 = new long[r2]     // Catch:{ all -> 0x005e }
            r3 = 0
            long r4 = r0.longValue()     // Catch:{ all -> 0x005e }
            r2[r3] = r4     // Catch:{ all -> 0x005e }
            int r0 = r1.remove(r2)     // Catch:{ all -> 0x005e }
            if (r0 > 0) goto L_0x004a
            java.lang.Integer r0 = r6.zzlz()     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x005a
        L_0x004a:
            com.google.android.gms.internal.firebase_ml.zzoq r0 = r6.zzaqx     // Catch:{ all -> 0x005e }
            r0.zzmg()     // Catch:{ all -> 0x005e }
            com.google.firebase.FirebaseApp r0 = r6.zzapo     // Catch:{ all -> 0x005e }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r1 = r6.zzaqv     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r1.zzmj()     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.firebase_ml.zzoa.zzh(r0, r1)     // Catch:{ all -> 0x005e }
        L_0x005a:
            monitor-exit(r6)
            return
        L_0x005c:
            monitor-exit(r6)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoo.zzly():void");
    }

    private final Long zza(DownloadManager.Request request, zzop zzop) {
        synchronized (this) {
            if (this.zzaqu == null) {
                return null;
            }
            long enqueue = this.zzaqu.enqueue(request);
            GmsLogger gmsLogger = zzaoz;
            StringBuilder sb = new StringBuilder(53);
            sb.append("Schedule a new downloading task: ");
            sb.append(enqueue);
            gmsLogger.mo4172d("ModelDownloadManager", sb.toString());
            zzoa.zza(this.zzapo, enqueue, zzop);
            return Long.valueOf(enqueue);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer zzlz() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.Long r0 = r9.zzlw()     // Catch:{ all -> 0x006c }
            android.app.DownloadManager r1 = r9.zzaqu     // Catch:{ all -> 0x006c }
            r2 = 0
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x000d
            goto L_0x006a
        L_0x000d:
            android.app.DownloadManager r1 = r9.zzaqu     // Catch:{ all -> 0x006c }
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query     // Catch:{ all -> 0x006c }
            r3.<init>()     // Catch:{ all -> 0x006c }
            r4 = 1
            long[] r5 = new long[r4]     // Catch:{ all -> 0x006c }
            r6 = 0
            long r7 = r0.longValue()     // Catch:{ all -> 0x006c }
            r5[r6] = r7     // Catch:{ all -> 0x006c }
            android.app.DownloadManager$Query r0 = r3.setFilterById(r5)     // Catch:{ all -> 0x006c }
            android.database.Cursor r0 = r1.query(r0)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x003d
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ all -> 0x006c }
            int r0 = r0.getInt(r1)     // Catch:{ all -> 0x006c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006c }
            goto L_0x003e
        L_0x003d:
            r0 = r2
        L_0x003e:
            if (r0 != 0) goto L_0x0042
            monitor-exit(r9)
            return r2
        L_0x0042:
            int r1 = r0.intValue()     // Catch:{ all -> 0x006c }
            r3 = 2
            if (r1 == r3) goto L_0x0067
            int r1 = r0.intValue()     // Catch:{ all -> 0x006c }
            r3 = 4
            if (r1 == r3) goto L_0x0067
            int r1 = r0.intValue()     // Catch:{ all -> 0x006c }
            if (r1 == r4) goto L_0x0067
            int r1 = r0.intValue()     // Catch:{ all -> 0x006c }
            r3 = 8
            if (r1 == r3) goto L_0x0067
            int r1 = r0.intValue()     // Catch:{ all -> 0x006c }
            r3 = 16
            if (r1 == r3) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r2 = r0
        L_0x0068:
            monitor-exit(r9)
            return r2
        L_0x006a:
            monitor-exit(r9)
            return r2
        L_0x006c:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoo.zzlz():java.lang.Integer");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        zzaoz.mo4174e("ModelDownloadManager", "Downloaded file is not found");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.ParcelFileDescriptor zzma() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Long r0 = r5.zzlw()     // Catch:{ all -> 0x0025 }
            android.app.DownloadManager r1 = r5.zzaqu     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            if (r0 != 0) goto L_0x000d
            goto L_0x0023
        L_0x000d:
            android.app.DownloadManager r1 = r5.zzaqu     // Catch:{ FileNotFoundException -> 0x0018 }
            long r3 = r0.longValue()     // Catch:{ FileNotFoundException -> 0x0018 }
            android.os.ParcelFileDescriptor r2 = r1.openDownloadedFile(r3)     // Catch:{ FileNotFoundException -> 0x0018 }
            goto L_0x0021
        L_0x0018:
            com.google.android.gms.common.internal.GmsLogger r0 = zzaoz     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "ModelDownloadManager"
            java.lang.String r3 = "Downloaded file is not found"
            r0.mo4174e(r1, r3)     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r5)
            return r2
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoo.zzma():android.os.ParcelFileDescriptor");
    }

    /* access modifiers changed from: package-private */
    public final void zzby(String str) throws FirebaseMLException {
        synchronized (this) {
            zzoa.zza(this.zzapo, this.zzaqv.zzmj(), str);
            zzly();
        }
    }

    private final boolean zzmb() throws FirebaseMLException {
        boolean z;
        synchronized (this) {
            z = this.zzaqx.zzmf() != null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.firebase_ml.zzop zzmc() throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r0 = r8.zzaqv     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r0.zzmj()     // Catch:{ all -> 0x006f }
            com.google.firebase.FirebaseApp r1 = r8.zzapo     // Catch:{ all -> 0x006f }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r2 = r8.zzaqv     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.firebase_ml.zzon r3 = r8.zzaqw     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.firebase_ml.zzop r1 = com.google.android.gms.internal.firebase_ml.zzou.zzb(r1, r2, r3)     // Catch:{ all -> 0x006f }
            r2 = 0
            if (r1 != 0) goto L_0x0016
            monitor-exit(r8)
            return r2
        L_0x0016:
            com.google.firebase.FirebaseApp r3 = r8.zzapo     // Catch:{ all -> 0x006f }
            java.lang.String r4 = r1.zzaqz     // Catch:{ all -> 0x006f }
            java.lang.String r5 = com.google.android.gms.internal.firebase_ml.zzoa.zze(r3, r0)     // Catch:{ all -> 0x006f }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x006f }
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003c
            android.content.Context r4 = r3.getApplicationContext()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = com.google.android.gms.internal.firebase_ml.zznk.zza((android.content.Context) r4)     // Catch:{ all -> 0x006f }
            java.lang.String r3 = com.google.android.gms.internal.firebase_ml.zzoa.zze(r3)     // Catch:{ all -> 0x006f }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x003c
            r3 = r6
            goto L_0x003d
        L_0x003c:
            r3 = r5
        L_0x003d:
            if (r3 == 0) goto L_0x0049
            com.google.android.gms.common.internal.GmsLogger r3 = zzaoz     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "ModelDownloadManager"
            java.lang.String r7 = "The new model is incompatible and the app is not upgraded, do not download"
            r3.mo4172d(r4, r7)     // Catch:{ all -> 0x006f }
            goto L_0x004a
        L_0x0049:
            r5 = r6
        L_0x004a:
            boolean r3 = r8.zzmb()     // Catch:{ all -> 0x006f }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0056
            com.google.firebase.FirebaseApp r4 = r8.zzapo     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.firebase_ml.zzoa.zzi(r4, r0)     // Catch:{ all -> 0x006f }
        L_0x0056:
            com.google.firebase.FirebaseApp r4 = r8.zzapo     // Catch:{ all -> 0x006f }
            java.lang.String r7 = r1.zzaqz     // Catch:{ all -> 0x006f }
            java.lang.String r0 = com.google.android.gms.internal.firebase_ml.zzoa.zzd(r4, r0)     // Catch:{ all -> 0x006f }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x006f }
            if (r5 == 0) goto L_0x006d
            if (r3 != 0) goto L_0x006b
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x006d
        L_0x006b:
            monitor-exit(r8)
            return r1
        L_0x006d:
            monitor-exit(r8)
            return r2
        L_0x006f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoo.zzmc():com.google.android.gms.internal.firebase_ml.zzop");
    }

    private final Long zza(zzop zzop) throws FirebaseMLException {
        synchronized (this) {
            String zzc = zzoa.zzc(this.zzapo, zzop.zzaqg);
            if (zzc == null || !zzc.equals(zzop.zzaqz)) {
                zzaoz.mo4172d("ModelDownloadManager", "Need to download a new model.");
                zzly();
                DownloadManager.Request request = new DownloadManager.Request(zzop.zzaqy);
                request.setDestinationUri((Uri) null);
                FirebaseModelDownloadConditions initialDownloadConditions = this.zzaqv.getInitialDownloadConditions();
                if (this.zzaqv.isModelUpdatesEnabled() || this.zzaqx.zzmf() == null) {
                    if (this.zzaqv.isModelUpdatesEnabled() && this.zzaqx.zzmf() != null) {
                        zzaoz.mo4172d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                        initialDownloadConditions = this.zzaqv.getUpdatesDownloadConditions();
                    }
                    zzaoz.mo4172d("ModelDownloadManager", "Use initial download conditions.");
                    if (Build.VERSION.SDK_INT >= 24) {
                        request.setRequiresCharging(initialDownloadConditions.isChargingRequired());
                        request.setRequiresDeviceIdle(initialDownloadConditions.isDeviceIdleRequired());
                    }
                    if (initialDownloadConditions.isWifiRequired()) {
                        request.setAllowedNetworkTypes(2);
                    }
                    Long zza = zza(request, zzop);
                    return zza;
                }
                zzaoz.mo4172d("ModelDownloadManager", "Model update is disabled and have a previous downloaded model, skip downloading");
                return null;
            }
            zzaoz.mo4172d("ModelDownloadManager", "New model is already in downloading, do nothing.");
            return null;
        }
    }
}
