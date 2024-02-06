package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.vision.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFace;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFaceDetectorOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzqa implements zznm<List<FirebaseVisionFace>, zzpz>, zznw {
    private static AtomicBoolean zzato = new AtomicBoolean(true);
    private static volatile Boolean zzaub;
    private final Context zzad;
    private final zznu zzaqs;
    private zzpu zzawc = new zzpu();
    private final FirebaseVisionFaceDetectorOptions zzaye;
    private FaceDetector zzayl;
    private FaceDetector zzaym;

    public zzqa(FirebaseApp firebaseApp, FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "FirebaseVisionFaceDetectorOptions can not be null");
        this.zzad = firebaseApp.getApplicationContext();
        this.zzaye = firebaseVisionFaceDetectorOptions;
        this.zzaqs = zznu.zza(firebaseApp, 1);
    }

    public final zznw zzlm() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzlp() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getContourMode()     // Catch:{ all -> 0x00e7 }
            r1 = 2
            if (r0 != r1) goto L_0x0096
            com.google.android.gms.vision.face.FaceDetector r0 = r3.zzaym     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x002d
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = new com.google.android.gms.vision.face.FaceDetector$Builder     // Catch:{ all -> 0x00e7 }
            android.content.Context r2 = r3.zzad     // Catch:{ all -> 0x00e7 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setLandmarkType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMode(r1)     // Catch:{ all -> 0x00e7 }
            r2 = 0
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setTrackingEnabled(r2)     // Catch:{ all -> 0x00e7 }
            r2 = 1
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setProminentFaceOnly(r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector r0 = r0.build()     // Catch:{ all -> 0x00e7 }
            r3.zzaym = r0     // Catch:{ all -> 0x00e7 }
        L_0x002d:
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getLandmarkMode()     // Catch:{ all -> 0x00e7 }
            if (r0 == r1) goto L_0x0045
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getClassificationMode()     // Catch:{ all -> 0x00e7 }
            if (r0 == r1) goto L_0x0045
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getPerformanceMode()     // Catch:{ all -> 0x00e7 }
            if (r0 != r1) goto L_0x00e5
        L_0x0045:
            com.google.android.gms.vision.face.FaceDetector r0 = r3.zzayl     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e5
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = new com.google.android.gms.vision.face.FaceDetector$Builder     // Catch:{ all -> 0x00e7 }
            android.content.Context r1 = r3.zzad     // Catch:{ all -> 0x00e7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getLandmarkMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzpv.zzbn(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setLandmarkType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getClassificationMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzpv.zzbp(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setClassificationType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getPerformanceMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzpv.zzbo(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMode(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            float r1 = r1.getMinFaceSize()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMinFaceSize(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            boolean r1 = r1.isTrackingEnabled()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setTrackingEnabled(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector r0 = r0.build()     // Catch:{ all -> 0x00e7 }
            r3.zzayl = r0     // Catch:{ all -> 0x00e7 }
            monitor-exit(r3)
            return
        L_0x0096:
            com.google.android.gms.vision.face.FaceDetector r0 = r3.zzayl     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e5
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = new com.google.android.gms.vision.face.FaceDetector$Builder     // Catch:{ all -> 0x00e7 }
            android.content.Context r1 = r3.zzad     // Catch:{ all -> 0x00e7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getLandmarkMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzpv.zzbn(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setLandmarkType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getClassificationMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzpv.zzbp(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setClassificationType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getPerformanceMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzpv.zzbo(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMode(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            float r1 = r1.getMinFaceSize()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMinFaceSize(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzaye     // Catch:{ all -> 0x00e7 }
            boolean r1 = r1.isTrackingEnabled()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setTrackingEnabled(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector r0 = r0.build()     // Catch:{ all -> 0x00e7 }
            r3.zzayl = r0     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r3)
            return
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqa.zzlp():void");
    }

    public final void release() {
        synchronized (this) {
            if (this.zzayl != null) {
                this.zzayl.release();
                this.zzayl = null;
            }
            if (this.zzaym != null) {
                this.zzaym.release();
                this.zzaym = null;
            }
            zzato.set(true);
        }
    }

    private final List<FirebaseVisionFace> zza(FaceDetector faceDetector, zzpz zzpz, long j) throws FirebaseMLException {
        ArrayList arrayList;
        synchronized (this) {
            if (this.zzaym != null) {
                if (zzaub == null) {
                    zzaub = Boolean.valueOf(DynamiteModule.getLocalVersion(this.zzad, ModuleDescriptor.MODULE_ID) > 0);
                }
                if (!zzaub.booleanValue()) {
                    throw new FirebaseMLException("No Face Contour model is bundled. Please check your app setup to include firebase-ml-vision-face-model dependency.", 14);
                }
            }
            if (faceDetector.isOperational()) {
                SparseArray<Face> detect = faceDetector.detect(zzpz.zzaxe);
                arrayList = new ArrayList();
                for (int i = 0; i < detect.size(); i++) {
                    arrayList.add(new FirebaseVisionFace(detect.get(detect.keyAt(i))));
                }
            } else {
                zza(zzmk.MODEL_NOT_DOWNLOADED, j, zzpz, 0, 0);
                throw new FirebaseMLException("Waiting for the face detection model to be downloaded. Please wait.", 14);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.firebase.p067ml.vision.face.FirebaseVisionFace> zza(com.google.android.gms.internal.firebase_ml.zzpz r22) throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            monitor-enter(r21)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0158 }
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzayl     // Catch:{ all -> 0x0158 }
            r9 = 13
            if (r1 != 0) goto L_0x0027
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzaym     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            com.google.android.gms.internal.firebase_ml.zzmk r2 = com.google.android.gms.internal.firebase_ml.zzmk.UNKNOWN_ERROR     // Catch:{ all -> 0x0158 }
            r6 = 0
            r7 = 0
            r1 = r21
            r5 = r22
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmk) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzpz) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x0158 }
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "Face detector wasn't initialized correctly. This is most likely caused by invalid face detector options."
            r0.<init>(r1, r9)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0027:
            com.google.android.gms.internal.firebase_ml.zzpu r1 = r8.zzawc     // Catch:{ all -> 0x0158 }
            r1.zzb(r0)     // Catch:{ all -> 0x0158 }
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzayl     // Catch:{ all -> 0x0158 }
            r2 = 0
            if (r1 == 0) goto L_0x0043
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzayl     // Catch:{ all -> 0x0158 }
            java.util.List r1 = r8.zza(r1, r0, r3)     // Catch:{ all -> 0x0158 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r5 = r8.zzaye     // Catch:{ all -> 0x0158 }
            boolean r5 = r5.isTrackingEnabled()     // Catch:{ all -> 0x0158 }
            if (r5 != 0) goto L_0x0044
            zzh(r1)     // Catch:{ all -> 0x0158 }
            goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            com.google.android.gms.vision.face.FaceDetector r5 = r8.zzaym     // Catch:{ all -> 0x0158 }
            if (r5 == 0) goto L_0x0051
            com.google.android.gms.vision.face.FaceDetector r2 = r8.zzaym     // Catch:{ all -> 0x0158 }
            java.util.List r2 = r8.zza(r2, r0, r3)     // Catch:{ all -> 0x0158 }
            zzh(r2)     // Catch:{ all -> 0x0158 }
        L_0x0051:
            if (r1 != 0) goto L_0x005e
            if (r2 == 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "No detector is enabled"
            r0.<init>(r1, r9)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x005e:
            if (r1 != 0) goto L_0x0062
            r5 = r2
            goto L_0x0065
        L_0x0062:
            if (r2 != 0) goto L_0x006a
            r5 = r1
        L_0x0065:
            r19 = r3
            r0 = r5
            goto L_0x0132
        L_0x006a:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0158 }
            r5.<init>()     // Catch:{ all -> 0x0158 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x0158 }
        L_0x0073:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0158 }
            if (r7 == 0) goto L_0x012b
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0158 }
            com.google.firebase.ml.vision.face.FirebaseVisionFace r7 = (com.google.firebase.p067ml.vision.face.FirebaseVisionFace) r7     // Catch:{ all -> 0x0158 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x0158 }
            r11 = 0
        L_0x0084:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x0158 }
            if (r12 == 0) goto L_0x011a
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x0158 }
            com.google.firebase.ml.vision.face.FirebaseVisionFace r12 = (com.google.firebase.p067ml.vision.face.FirebaseVisionFace) r12     // Catch:{ all -> 0x0158 }
            android.graphics.Rect r13 = r7.getBoundingBox()     // Catch:{ all -> 0x0158 }
            if (r13 == 0) goto L_0x00fc
            android.graphics.Rect r13 = r12.getBoundingBox()     // Catch:{ all -> 0x0158 }
            if (r13 != 0) goto L_0x009d
            goto L_0x00fc
        L_0x009d:
            android.graphics.Rect r13 = r7.getBoundingBox()     // Catch:{ all -> 0x0158 }
            android.graphics.Rect r15 = r12.getBoundingBox()     // Catch:{ all -> 0x0158 }
            boolean r16 = r13.intersect(r15)     // Catch:{ all -> 0x0158 }
            if (r16 == 0) goto L_0x00fc
            int r14 = r13.right     // Catch:{ all -> 0x0158 }
            int r9 = r15.right     // Catch:{ all -> 0x0158 }
            int r9 = java.lang.Math.min(r14, r9)     // Catch:{ all -> 0x0158 }
            int r14 = r13.left     // Catch:{ all -> 0x0158 }
            int r0 = r15.left     // Catch:{ all -> 0x0158 }
            int r0 = java.lang.Math.max(r14, r0)     // Catch:{ all -> 0x0158 }
            int r14 = r13.bottom     // Catch:{ all -> 0x0158 }
            r17 = r6
            int r6 = r15.bottom     // Catch:{ all -> 0x0158 }
            int r9 = r9 - r0
            int r0 = java.lang.Math.min(r14, r6)     // Catch:{ all -> 0x0158 }
            int r6 = r13.top     // Catch:{ all -> 0x0158 }
            int r14 = r15.top     // Catch:{ all -> 0x0158 }
            int r6 = java.lang.Math.max(r6, r14)     // Catch:{ all -> 0x0158 }
            int r0 = r0 - r6
            int r9 = r9 * r0
            r0 = r10
            double r9 = (double) r9     // Catch:{ all -> 0x0158 }
            int r6 = r13.right     // Catch:{ all -> 0x0158 }
            int r14 = r13.left     // Catch:{ all -> 0x0158 }
            int r6 = r6 - r14
            int r14 = r13.bottom     // Catch:{ all -> 0x0158 }
            int r13 = r13.top     // Catch:{ all -> 0x0158 }
            int r14 = r14 - r13
            int r6 = r6 * r14
            double r13 = (double) r6     // Catch:{ all -> 0x0158 }
            int r6 = r15.right     // Catch:{ all -> 0x0158 }
            r18 = r0
            int r0 = r15.left     // Catch:{ all -> 0x0158 }
            int r6 = r6 - r0
            int r0 = r15.bottom     // Catch:{ all -> 0x0158 }
            int r15 = r15.top     // Catch:{ all -> 0x0158 }
            int r0 = r0 - r15
            int r6 = r6 * r0
            r19 = r3
            double r3 = (double) r6     // Catch:{ all -> 0x0158 }
            double r13 = r13 + r3
            double r13 = r13 - r9
            double r9 = r9 / r13
            r3 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0102
            r0 = 1
            goto L_0x0103
        L_0x00fc:
            r19 = r3
            r17 = r6
            r18 = r10
        L_0x0102:
            r0 = 0
        L_0x0103:
            if (r0 == 0) goto L_0x010d
            android.util.SparseArray r0 = r7.zznm()     // Catch:{ all -> 0x0158 }
            r12.zza(r0)     // Catch:{ all -> 0x0158 }
            r11 = 1
        L_0x010d:
            r5.add(r12)     // Catch:{ all -> 0x0158 }
            r0 = r22
            r6 = r17
            r10 = r18
            r3 = r19
            goto L_0x0084
        L_0x011a:
            r19 = r3
            r17 = r6
            if (r11 != 0) goto L_0x0123
            r5.add(r7)     // Catch:{ all -> 0x0158 }
        L_0x0123:
            r0 = r22
            r6 = r17
            r3 = r19
            goto L_0x0073
        L_0x012b:
            r19 = r3
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0158 }
            r0.<init>(r5)     // Catch:{ all -> 0x0158 }
        L_0x0132:
            com.google.android.gms.internal.firebase_ml.zzmk r3 = com.google.android.gms.internal.firebase_ml.zzmk.NO_ERROR     // Catch:{ all -> 0x0158 }
            if (r2 != 0) goto L_0x0138
            r6 = 0
            goto L_0x013d
        L_0x0138:
            int r2 = r2.size()     // Catch:{ all -> 0x0158 }
            r6 = r2
        L_0x013d:
            if (r1 != 0) goto L_0x0141
            r7 = 0
            goto L_0x0146
        L_0x0141:
            int r1 = r1.size()     // Catch:{ all -> 0x0158 }
            r7 = r1
        L_0x0146:
            r1 = r21
            r2 = r3
            r3 = r19
            r5 = r22
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmk) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzpz) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x0158 }
            java.util.concurrent.atomic.AtomicBoolean r1 = zzato     // Catch:{ all -> 0x0158 }
            r2 = 0
            r1.set(r2)     // Catch:{ all -> 0x0158 }
            monitor-exit(r21)
            return r0
        L_0x0158:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqa.zza(com.google.android.gms.internal.firebase_ml.zzpz):java.util.List");
    }

    private static void zzh(List<FirebaseVisionFace> list) {
        for (FirebaseVisionFace zzbr : list) {
            zzbr.zzbr(-1);
        }
    }

    private final void zza(zzmk zzmk, long j, zzpz zzpz, int i, int i2) {
        synchronized (this) {
            this.zzaqs.zza((zznv) new zzqb(this, j, zzmk, i, i2, zzpz), zzmn.ON_DEVICE_FACE_DETECT);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmd.zzq.zza zza(long j, zzmk zzmk, int i, int i2, zzpz zzpz) {
        return zzmd.zzq.zzjx().zzb(zzmd.zzw.zzkk().zzd(zzmd.zzs.zzkb().zzn(SystemClock.elapsedRealtime() - j).zzc(zzmk).zzz(zzato.get()).zzaa(true).zzab(true)).zzb(this.zzaye.zznn()).zzbc(i).zzbd(i2).zzc(zzpv.zzc(zzpz)));
    }
}
