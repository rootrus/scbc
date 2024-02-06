package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.util.ArrayList;

public final class zzoi {
    private static final GmsLogger zzaoz = new GmsLogger("ModelLoader", "");
    private final zzov zzaql;
    private final zzog zzaqm;

    public zzoi(zzov zzov, zzog zzog) {
        Preconditions.checkArgument((zzov == null && zzog == null) ? false : true, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        this.zzaql = zzov;
        this.zzaqm = zzog;
    }

    public final <T> void zza(zzoj<T> zzoj) throws FirebaseMLException {
        Exception exc;
        boolean z;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            Exception e = null;
            boolean z2 = false;
            try {
                z = zza(zzoj, arrayList);
                exc = null;
            } catch (Exception e2) {
                exc = e2;
                z = false;
            }
            if (!z) {
                try {
                    z2 = zzb(zzoj, arrayList);
                } catch (Exception e3) {
                    e = e3;
                }
                if (!z2) {
                    arrayList.add(zzmk.NO_VALID_MODEL);
                    if (exc != null) {
                        throw new FirebaseMLException("Remote model load failed: ", 14, exc);
                    } else if (e != null) {
                        throw new FirebaseMLException("Local model load failed: ", 14, e);
                    } else {
                        throw new FirebaseMLException("Cannot load custom model", 14);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> boolean zza(com.google.android.gms.internal.firebase_ml.zzoj<T> r4, java.util.List<com.google.android.gms.internal.firebase_ml.zzmk> r5) throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.firebase_ml.zzov r0 = r3.zzaql     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0040
            com.google.android.gms.internal.firebase_ml.zzov r0 = r3.zzaql     // Catch:{ FirebaseMLException -> 0x0030 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ FirebaseMLException -> 0x0030 }
            if (r0 == 0) goto L_0x0021
            r4.zzb(r0)     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.firebase_ml.zzov r4 = r3.zzaql     // Catch:{ all -> 0x0043 }
            r4.zzlu()     // Catch:{ all -> 0x0043 }
            com.google.android.gms.common.internal.GmsLogger r4 = zzaoz     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = "ModelLoader"
            java.lang.String r0 = "Remote model source is loaded successfully"
            r4.mo4172d(r5, r0)     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0021:
            com.google.android.gms.common.internal.GmsLogger r4 = zzaoz     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "ModelLoader"
            java.lang.String r1 = "Remote model source can NOT be loaded, try local model."
            r4.mo4172d(r0, r1)     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.firebase_ml.zzmk r4 = com.google.android.gms.internal.firebase_ml.zzmk.CLOUD_MODEL_LOADER_LOADS_NO_MODEL     // Catch:{ all -> 0x0043 }
            r5.add(r4)     // Catch:{ all -> 0x0043 }
            goto L_0x0040
        L_0x0030:
            r4 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = zzaoz     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "ModelLoader"
            java.lang.String r2 = "Remote model source can NOT be loaded, try local model."
            r0.mo4172d(r1, r2)     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.firebase_ml.zzmk r0 = com.google.android.gms.internal.firebase_ml.zzmk.CLOUD_MODEL_LOADER_ERROR     // Catch:{ all -> 0x0043 }
            r5.add(r0)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ all -> 0x0043 }
        L_0x0040:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoi.zza(com.google.android.gms.internal.firebase_ml.zzoj, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> boolean zzb(com.google.android.gms.internal.firebase_ml.zzoj<T> r2, java.util.List<com.google.android.gms.internal.firebase_ml.zzmk> r3) throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.firebase_ml.zzog r0 = r1.zzaqm     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.internal.firebase_ml.zzog r0 = r1.zzaqm     // Catch:{ all -> 0x002b }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0028
            r2.zzb(r0)     // Catch:{ RuntimeException -> 0x0021 }
            com.google.android.gms.internal.firebase_ml.zzog r2 = r1.zzaqm     // Catch:{ RuntimeException -> 0x0021 }
            r2.zzlu()     // Catch:{ RuntimeException -> 0x0021 }
            com.google.android.gms.common.internal.GmsLogger r2 = zzaoz     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "ModelLoader"
            java.lang.String r0 = "Local model source is loaded successfully"
            r2.mo4172d(r3, r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x0021:
            r2 = move-exception
            com.google.android.gms.internal.firebase_ml.zzmk r0 = com.google.android.gms.internal.firebase_ml.zzmk.LOCAL_MODEL_INVALID     // Catch:{ all -> 0x002b }
            r3.add(r0)     // Catch:{ all -> 0x002b }
            throw r2     // Catch:{ all -> 0x002b }
        L_0x0028:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoi.zzb(com.google.android.gms.internal.firebase_ml.zzoj, java.util.List):boolean");
    }
}
