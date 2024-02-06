package com.google.firebase.p067ml.vision.text;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqh;
import com.google.android.gms.internal.firebase_ml.zzqi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer */
public class FirebaseVisionTextRecognizer implements Closeable {
    private static final Map<zzqi, FirebaseVisionTextRecognizer> zzayw = new HashMap();
    private static final Map<zzqh, FirebaseVisionTextRecognizer> zzayx = new HashMap();
    private final zzqi zzazp;
    private final zzqh zzazq;
    private final int zzazr;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.p067ml.vision.text.FirebaseVisionTextRecognizer zza(com.google.firebase.FirebaseApp r3, com.google.firebase.p067ml.vision.text.FirebaseVisionCloudTextRecognizerOptions r4, boolean r5) {
        /*
            java.lang.Class<com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r0 = com.google.firebase.p067ml.vision.text.FirebaseVisionTextRecognizer.class
            monitor-enter(r0)
            java.lang.String r1 = "FirebaseApp must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r3.getPersistenceKey()     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "Firebase app name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch:{ all -> 0x0051 }
            if (r5 != 0) goto L_0x0018
            java.lang.String r1 = "Options must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r1)     // Catch:{ all -> 0x0051 }
        L_0x0018:
            r1 = 0
            if (r5 == 0) goto L_0x0036
            com.google.android.gms.internal.firebase_ml.zzqi r3 = com.google.android.gms.internal.firebase_ml.zzqi.zzj(r3)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzqi, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r4 = zzayw     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0051 }
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = (com.google.firebase.p067ml.vision.text.FirebaseVisionTextRecognizer) r4     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x0034
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = new com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer     // Catch:{ all -> 0x0051 }
            r5 = 1
            r4.<init>(r3, r1, r5)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzqi, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r5 = zzayw     // Catch:{ all -> 0x0051 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0051 }
        L_0x0034:
            monitor-exit(r0)
            return r4
        L_0x0036:
            com.google.android.gms.internal.firebase_ml.zzqh r3 = com.google.android.gms.internal.firebase_ml.zzqh.zza((com.google.firebase.FirebaseApp) r3, (com.google.firebase.p067ml.vision.text.FirebaseVisionCloudTextRecognizerOptions) r4)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzqh, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r4 = zzayx     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0051 }
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = (com.google.firebase.p067ml.vision.text.FirebaseVisionTextRecognizer) r4     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x004f
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = new com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer     // Catch:{ all -> 0x0051 }
            r5 = 2
            r4.<init>(r1, r3, r5)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzqh, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r5 = zzayx     // Catch:{ all -> 0x0051 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p067ml.vision.text.FirebaseVisionTextRecognizer.zza(com.google.firebase.FirebaseApp, com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions, boolean):com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer");
    }

    private FirebaseVisionTextRecognizer(zzqi zzqi, zzqh zzqh, int i) {
        this.zzazr = i;
        this.zzazp = zzqi;
        this.zzazq = zzqh;
    }

    public Task<FirebaseVisionText> processImage(FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkArgument((this.zzazp == null && this.zzazq == null) ? false : true, "Either on-device or cloud text recognizer should be enabled.");
        zzqi zzqi = this.zzazp;
        if (zzqi != null) {
            return zzqi.processImage(firebaseVisionImage);
        }
        return this.zzazq.processImage(firebaseVisionImage);
    }

    public void close() throws IOException {
        zzqi zzqi = this.zzazp;
        if (zzqi != null) {
            zzqi.close();
        }
        zzqh zzqh = this.zzazq;
        if (zzqh != null) {
            zzqh.close();
        }
    }
}
