package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.setOrientation;
import p040o.setWeightSum;

public final class zznu {
    private static final GmsLogger zzaoz = new GmsLogger("MlStatsLogger", "");
    private static List<String> zzapn;
    private static final Map<String, zznu> zzax = new HashMap();
    private final FirebaseApp zzapo;
    private final String zzapp;
    private final String zzapq;
    private final String zzapr;
    private final String zzaps;
    private final String zzapt;
    private final ClearcutLogger zzapu;
    private final Map<zzmn, Long> zzapv = new HashMap();
    private final int zzapw;

    private zznu(FirebaseApp firebaseApp, int i) {
        this.zzapo = firebaseApp;
        this.zzapw = i;
        String projectId = firebaseApp.getOptions().getProjectId();
        String str = "";
        this.zzapr = projectId == null ? str : projectId;
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        this.zzaps = gcmSenderId == null ? str : gcmSenderId;
        String apiKey = firebaseApp.getOptions().getApiKey();
        this.zzapt = apiKey != null ? apiKey : str;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzapu = ClearcutLogger.anonymousLogger(applicationContext, "FIREBASE_ML_SDK");
        this.zzapp = applicationContext.getPackageName();
        this.zzapq = zznk.zza(applicationContext);
    }

    public static zznu zza(FirebaseApp firebaseApp, int i) {
        zznu zznu;
        synchronized (zznu.class) {
            Preconditions.checkNotNull(firebaseApp);
            String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "_model_download" : "_natural_language" : "_model" : "_vision";
            String valueOf = String.valueOf(firebaseApp.getPersistenceKey());
            String concat = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            zznu = zzax.get(concat);
            if (zznu == null) {
                zznu = new zznu(firebaseApp, i);
                zzax.put(concat, zznu);
            }
        }
        return zznu;
    }

    public final void zza(zzmd.zzq.zza zza, zzmn zzmn) {
        synchronized (this) {
            if (!zzfd()) {
                zzaoz.mo4172d("MlStatsLogger", "Logging is disabled.");
                return;
            }
            String zzlh = zza.zzjw().zzlh();
            if ("NA".equals(zzlh) || "".equals(zzlh)) {
                zzlh = "NA";
            }
            zza.zzb(zzmn).zzb(zzmd.zzac.zzli().zzbq(this.zzapp).zzbr(this.zzapq).zzbs(this.zzapr).zzbv(this.zzaps).zzbw(this.zzapt).zzbu(zzlh).zzn(zzlo()).zzbt(zznl.zzll().getVersion("firebase-ml-common")));
            zzmd.zzq zzq = (zzmd.zzq) ((zzue) zza.zzrj());
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(zzq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Logging FirebaseMlSdkLogEvent ");
            sb.append(valueOf);
            gmsLogger.mo4172d("MlStatsLogger", sb.toString());
            this.zzapu.newEvent(zzq.toByteArray()).log();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC, Splitter:B:17:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.firebase_ml.zznv r8, com.google.android.gms.internal.firebase_ml.zzmn r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zzfd()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0049 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzmn, java.lang.Long> r2 = r7.zzapv     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x0032
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzmn, java.lang.Long> r2 = r7.zzapv     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0049 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0049 }
            long r2 = r2.longValue()     // Catch:{ all -> 0x0049 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0049 }
            r5 = 30
            long r4 = r4.toMillis(r5)     // Catch:{ all -> 0x0049 }
            long r2 = r0 - r2
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = 0
            goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            if (r2 != 0) goto L_0x0037
            monitor-exit(r7)
            return
        L_0x0037:
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzmn, java.lang.Long> r2 = r7.zzapv     // Catch:{ all -> 0x0049 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0049 }
            r2.put(r9, r0)     // Catch:{ all -> 0x0049 }
            com.google.android.gms.internal.firebase_ml.zzmd$zzq$zza r8 = r8.zzm()     // Catch:{ all -> 0x0049 }
            r7.zza((com.google.android.gms.internal.firebase_ml.zzmd.zzq.zza) r8, (com.google.android.gms.internal.firebase_ml.zzmn) r9)     // Catch:{ all -> 0x0049 }
            monitor-exit(r7)
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zznu.zza(com.google.android.gms.internal.firebase_ml.zznv, com.google.android.gms.internal.firebase_ml.zzmn):void");
    }

    private static List<String> zzlo() {
        synchronized (zznu.class) {
            if (zzapn != null) {
                List<String> list = zzapn;
                return list;
            }
            setOrientation MediaBrowserCompat$ItemReceiver = setWeightSum.MediaBrowserCompat$ItemReceiver(Resources.getSystem().getConfiguration());
            zzapn = new ArrayList(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver());
            for (int i = 0; i < MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(); i++) {
                zzapn.add(zznk.zza(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(i)));
            }
            List<String> list2 = zzapn;
            return list2;
        }
    }

    private final boolean zzfd() {
        int i = this.zzapw;
        if (i == 1) {
            return zzoa.zzc(this.zzapo);
        }
        if (i != 2) {
            return i == 3 || i == 4;
        }
        return zzoa.zzd(this.zzapo);
    }
}
