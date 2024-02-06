package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.common.modeldownload.FirebaseLocalModel;
import com.google.firebase.p067ml.common.modeldownload.FirebaseRemoteModel;
import com.google.firebase.p067ml.custom.FirebaseModelOutputs;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.tensorflow.lite.TensorFlowLite;
import p040o.QuickAccountSelectAdapter$HeaderHolder;

public final class zzpe implements zznm<FirebaseModelOutputs, zzpa>, zznw {
    private static final GmsLogger zzaoz = new GmsLogger("ModelInterpreterTask", "");
    public static final String zzasz = TensorFlowLite.version();
    private static boolean zzata = true;
    private final FirebaseLocalModel zzaqk;
    private final zzov zzaql;
    private final zzog zzaqm;
    private final zznu zzaqs;
    private final FirebaseRemoteModel zzaqt;
    private final boolean zzast;
    private AtomicLong zzatb = new AtomicLong(0);
    private zzpj zzatc = null;

    public zzpe(FirebaseApp firebaseApp, FirebaseLocalModel firebaseLocalModel, FirebaseRemoteModel firebaseRemoteModel, boolean z) {
        this.zzaqk = firebaseLocalModel;
        this.zzaqt = firebaseRemoteModel;
        this.zzast = z;
        this.zzaqs = zznu.zza(firebaseApp, 2);
        if (firebaseRemoteModel != null) {
            this.zzaql = zzov.zza(firebaseApp, firebaseRemoteModel, new zzoz(), new zzpb(firebaseApp.getApplicationContext()), zzok.CUSTOM);
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(firebaseRemoteModel);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Cloud model source is set: ");
            sb.append(valueOf);
            gmsLogger.mo4172d("ModelInterpreterTask", sb.toString());
        } else {
            this.zzaql = null;
        }
        if (firebaseLocalModel != null) {
            this.zzaqm = new zzog(firebaseApp.getApplicationContext(), firebaseLocalModel);
            GmsLogger gmsLogger2 = zzaoz;
            String valueOf2 = String.valueOf(firebaseLocalModel);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
            sb2.append("Local model source is set: ");
            sb2.append(valueOf2);
            gmsLogger2.mo4172d("ModelInterpreterTask", sb2.toString());
            return;
        }
        this.zzaqm = null;
    }

    public final zznw zzlm() {
        return this;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x022e A[Catch:{ Exception -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0230 A[Catch:{ Exception -> 0x01af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.p067ml.custom.FirebaseModelOutputs zza(com.google.android.gms.internal.firebase_ml.zzpa r19) throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r18 = this;
            r7 = r18
            r5 = r19
            monitor-enter(r18)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0255 }
            com.google.firebase.ml.custom.FirebaseModelInputs r0 = r5.zzasv     // Catch:{ all -> 0x0255 }
            com.google.firebase.ml.custom.FirebaseModelInputOutputOptions r1 = r5.zzasw     // Catch:{ all -> 0x0255 }
            java.util.Map r8 = r1.zzmn()     // Catch:{ all -> 0x0255 }
            com.google.android.gms.internal.firebase_ml.zzpj r2 = r7.zzatc     // Catch:{ all -> 0x0255 }
            if (r2 == 0) goto L_0x0239
            android.util.SparseArray r1 = r1.zzml()     // Catch:{ all -> 0x0255 }
            int r2 = r1.size()     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Object[] r10 = r0.zzmo()     // Catch:{ FirebaseMLException -> 0x0225 }
            int r11 = r10.length     // Catch:{ FirebaseMLException -> 0x0225 }
            r13 = 3
            if (r2 != r11) goto L_0x01ff
            r11 = 0
        L_0x0026:
            if (r11 >= r2) goto L_0x016f
            int r14 = r1.keyAt(r11)     // Catch:{ FirebaseMLException -> 0x0225 }
            r15 = r10[r14]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Object r16 = r1.get(r14)     // Catch:{ FirebaseMLException -> 0x0225 }
            r12 = r16
            com.google.android.gms.internal.firebase_ml.zzpc r12 = (com.google.android.gms.internal.firebase_ml.zzpc) r12     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.String r6 = "Data can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r15, r6)     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.String r6 = "DataSpec can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12, r6)     // Catch:{ FirebaseMLException -> 0x0225 }
            boolean r6 = r15 instanceof java.nio.ByteBuffer     // Catch:{ FirebaseMLException -> 0x0225 }
            if (r6 == 0) goto L_0x007f
            java.nio.ByteBuffer r15 = (java.nio.ByteBuffer) r15     // Catch:{ FirebaseMLException -> 0x0225 }
            int r6 = r15.limit()     // Catch:{ FirebaseMLException -> 0x0225 }
            int r9 = r12.zzmt()     // Catch:{ FirebaseMLException -> 0x0225 }
            if (r6 != r9) goto L_0x0052
            goto L_0x00f2
        L_0x0052:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ FirebaseMLException -> 0x0225 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ FirebaseMLException -> 0x0225 }
            r8 = 0
            r2[r8] = r6     // Catch:{ FirebaseMLException -> 0x0222 }
            int r6 = r12.zzmt()     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ FirebaseMLException -> 0x0225 }
            r8 = 1
            r2[r8] = r6     // Catch:{ FirebaseMLException -> 0x0225 }
            int r6 = r15.limit()     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ FirebaseMLException -> 0x0225 }
            r8 = 2
            r2[r8] = r6     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.String r6 = "Input %d should have %d bytes, but found %d bytes."
            java.lang.String r1 = java.lang.String.format(r1, r6, r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            r0.<init>(r1, r13)     // Catch:{ FirebaseMLException -> 0x0225 }
            throw r0     // Catch:{ FirebaseMLException -> 0x0225 }
        L_0x007f:
            java.lang.Class r6 = r15.getClass()     // Catch:{ FirebaseMLException -> 0x0225 }
            boolean r6 = r6.isArray()     // Catch:{ FirebaseMLException -> 0x0225 }
            if (r6 == 0) goto L_0x0152
            int r6 = com.google.firebase.p067ml.custom.FirebaseModelDataType.zzm(r15)     // Catch:{ FirebaseMLException -> 0x0225 }
            int r9 = r12.getType()     // Catch:{ FirebaseMLException -> 0x0225 }
            if (r6 != r9) goto L_0x0127
            java.util.List r6 = com.google.android.gms.internal.firebase_ml.zzpd.zzn(r15)     // Catch:{ FirebaseMLException -> 0x0225 }
            int r9 = r6.size()     // Catch:{ FirebaseMLException -> 0x0225 }
            int[] r15 = r12.zzms()     // Catch:{ FirebaseMLException -> 0x0225 }
            int r15 = r15.length     // Catch:{ FirebaseMLException -> 0x0225 }
            if (r9 != r15) goto L_0x00f7
            r9 = 0
        L_0x00a3:
            int r15 = r6.size()     // Catch:{ FirebaseMLException -> 0x0225 }
            if (r9 >= r15) goto L_0x00f2
            java.lang.Object r15 = r6.get(r9)     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ FirebaseMLException -> 0x0225 }
            int r15 = r15.intValue()     // Catch:{ FirebaseMLException -> 0x0225 }
            int[] r17 = r12.zzms()     // Catch:{ FirebaseMLException -> 0x0225 }
            r13 = r17[r9]     // Catch:{ FirebaseMLException -> 0x0225 }
            if (r15 != r13) goto L_0x00bf
            int r9 = r9 + 1
            r13 = 3
            goto L_0x00a3
        L_0x00bf:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ FirebaseMLException -> 0x0225 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ FirebaseMLException -> 0x0225 }
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)     // Catch:{ FirebaseMLException -> 0x0225 }
            r10 = 0
            r2[r10] = r8     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ FirebaseMLException -> 0x0225 }
            r10 = 1
            r2[r10] = r8     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Object r6 = r6.get(r9)     // Catch:{ FirebaseMLException -> 0x0225 }
            r8 = 2
            r2[r8] = r6     // Catch:{ FirebaseMLException -> 0x0225 }
            int[] r6 = r12.zzms()     // Catch:{ FirebaseMLException -> 0x0225 }
            r6 = r6[r9]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ FirebaseMLException -> 0x0225 }
            r8 = 3
            r2[r8] = r6     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.String r6 = "The size of %d-th dimension of input %d is %d, but %d is expected."
            java.lang.String r1 = java.lang.String.format(r1, r6, r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            r0.<init>(r1, r8)     // Catch:{ FirebaseMLException -> 0x0225 }
            throw r0     // Catch:{ FirebaseMLException -> 0x0225 }
        L_0x00f2:
            int r11 = r11 + 1
            r13 = 3
            goto L_0x0026
        L_0x00f7:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ FirebaseMLException -> 0x0225 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ FirebaseMLException -> 0x0225 }
            r2 = 3
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ FirebaseMLException -> 0x0225 }
            r9 = 0
            r8[r9] = r2     // Catch:{ FirebaseMLException -> 0x0225 }
            int r2 = r6.size()     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            r6 = 1
            r8[r6] = r2     // Catch:{ FirebaseMLException -> 0x0225 }
            int[] r2 = r12.zzms()     // Catch:{ FirebaseMLException -> 0x0225 }
            int r2 = r2.length     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            r6 = 2
            r8[r6] = r2     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.String r2 = "Dimension of input %d is %d, but %d is expected."
            java.lang.String r1 = java.lang.String.format(r1, r2, r8)     // Catch:{ FirebaseMLException -> 0x0225 }
            r2 = 3
            r0.<init>(r1, r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            throw r0     // Catch:{ FirebaseMLException -> 0x0225 }
        L_0x0127:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ FirebaseMLException -> 0x0225 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ FirebaseMLException -> 0x0225 }
            r2 = 3
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ FirebaseMLException -> 0x0225 }
            r9 = 0
            r8[r9] = r2     // Catch:{ FirebaseMLException -> 0x0225 }
            int r2 = r12.getType()     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            r9 = 1
            r8[r9] = r2     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ FirebaseMLException -> 0x0225 }
            r6 = 2
            r8[r6] = r2     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.String r2 = "Input %d should be %d type, but found %d type."
            java.lang.String r1 = java.lang.String.format(r1, r2, r8)     // Catch:{ FirebaseMLException -> 0x0225 }
            r2 = 3
            r0.<init>(r1, r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            throw r0     // Catch:{ FirebaseMLException -> 0x0225 }
        L_0x0152:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ FirebaseMLException -> 0x0225 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ FirebaseMLException -> 0x0225 }
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ FirebaseMLException -> 0x0225 }
            r8 = 0
            r6[r8] = r2     // Catch:{ FirebaseMLException -> 0x0222 }
            java.lang.String r2 = "Input %d must be either an array or a ByteBuffer."
            java.lang.String r1 = java.lang.String.format(r1, r2, r6)     // Catch:{ FirebaseMLException -> 0x0225 }
            r2 = 3
            r0.<init>(r1, r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            throw r0     // Catch:{ FirebaseMLException -> 0x0225 }
        L_0x016b:
            r8 = 0
        L_0x016c:
            r9 = 1
            goto L_0x0228
        L_0x016f:
            int r2 = r1.size()     // Catch:{ all -> 0x0255 }
            r6 = 0
        L_0x0174:
            if (r6 >= r2) goto L_0x018c
            int r9 = r1.keyAt(r6)     // Catch:{ all -> 0x0255 }
            com.google.android.gms.internal.firebase_ml.zzpj r10 = r7.zzatc     // Catch:{ all -> 0x0255 }
            java.lang.Object r11 = r1.get(r9)     // Catch:{ all -> 0x0255 }
            com.google.android.gms.internal.firebase_ml.zzpc r11 = (com.google.android.gms.internal.firebase_ml.zzpc) r11     // Catch:{ all -> 0x0255 }
            int[] r11 = r11.zzms()     // Catch:{ all -> 0x0255 }
            r10.resizeInput(r9, r11)     // Catch:{ all -> 0x0255 }
            int r6 = r6 + 1
            goto L_0x0174
        L_0x018c:
            com.google.android.gms.internal.firebase_ml.zzpj r1 = r7.zzatc     // Catch:{ Exception -> 0x01af }
            java.lang.Object[] r0 = r0.zzmo()     // Catch:{ Exception -> 0x01af }
            r1.runForMultipleInputsOutputs(r0, r8)     // Catch:{ Exception -> 0x01af }
            com.google.android.gms.internal.firebase_ml.zzmk r2 = com.google.android.gms.internal.firebase_ml.zzmk.NO_ERROR     // Catch:{ all -> 0x0255 }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r0 = r7.zzaqt     // Catch:{ all -> 0x0255 }
            if (r0 == 0) goto L_0x019d
            r6 = 1
            goto L_0x019e
        L_0x019d:
            r6 = 0
        L_0x019e:
            r1 = r18
            r5 = r19
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmk) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzpa) r5, (boolean) r6)     // Catch:{ all -> 0x0255 }
            r1 = 0
            zzata = r1     // Catch:{ all -> 0x0255 }
            com.google.firebase.ml.custom.FirebaseModelOutputs r0 = new com.google.firebase.ml.custom.FirebaseModelOutputs     // Catch:{ all -> 0x0255 }
            r0.<init>(r8)     // Catch:{ all -> 0x0255 }
            monitor-exit(r18)
            return r0
        L_0x01af:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "Input error:"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0255 }
            if (r1 == 0) goto L_0x01c0
            com.google.android.gms.internal.firebase_ml.zzmk r1 = com.google.android.gms.internal.firebase_ml.zzmk.INCOMPATIBLE_INPUT     // Catch:{ all -> 0x0255 }
        L_0x01be:
            r2 = r1
            goto L_0x01f0
        L_0x01c0:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "Output error:"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0255 }
            if (r1 == 0) goto L_0x01cf
            com.google.android.gms.internal.firebase_ml.zzmk r1 = com.google.android.gms.internal.firebase_ml.zzmk.INCOMPATIBLE_OUTPUT     // Catch:{ all -> 0x0255 }
            goto L_0x01be
        L_0x01cf:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "Internal error:"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0255 }
            if (r1 == 0) goto L_0x01de
            com.google.android.gms.internal.firebase_ml.zzmk r1 = com.google.android.gms.internal.firebase_ml.zzmk.TFLITE_INTERNAL_ERROR     // Catch:{ all -> 0x0255 }
            goto L_0x01be
        L_0x01de:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "DataType error:"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0255 }
            if (r1 == 0) goto L_0x01ed
            com.google.android.gms.internal.firebase_ml.zzmk r1 = com.google.android.gms.internal.firebase_ml.zzmk.DATA_TYPE_ERROR     // Catch:{ all -> 0x0255 }
            goto L_0x01be
        L_0x01ed:
            com.google.android.gms.internal.firebase_ml.zzmk r1 = com.google.android.gms.internal.firebase_ml.zzmk.TFLITE_UNKNOWN_ERROR     // Catch:{ all -> 0x0255 }
            goto L_0x01be
        L_0x01f0:
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r1 = r7.zzaqt     // Catch:{ all -> 0x0255 }
            if (r1 == 0) goto L_0x01f6
            r6 = 1
            goto L_0x01f7
        L_0x01f6:
            r6 = 0
        L_0x01f7:
            r1 = r18
            r5 = r19
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmk) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzpa) r5, (boolean) r6)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x01ff:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ FirebaseMLException -> 0x0225 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ FirebaseMLException -> 0x0225 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ FirebaseMLException -> 0x0225 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ FirebaseMLException -> 0x0225 }
            r8 = 0
            r6[r8] = r2     // Catch:{ FirebaseMLException -> 0x0222 }
            int r2 = r10.length     // Catch:{ FirebaseMLException -> 0x0222 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ FirebaseMLException -> 0x0222 }
            r9 = 1
            r6[r9] = r2     // Catch:{ FirebaseMLException -> 0x0220 }
            java.lang.String r2 = "Expected %d inputs but got %d"
            java.lang.String r1 = java.lang.String.format(r1, r2, r6)     // Catch:{ FirebaseMLException -> 0x0220 }
            r2 = 3
            r0.<init>(r1, r2)     // Catch:{ FirebaseMLException -> 0x0220 }
            throw r0     // Catch:{ FirebaseMLException -> 0x0220 }
        L_0x0220:
            r0 = move-exception
            goto L_0x0228
        L_0x0222:
            r0 = move-exception
            goto L_0x016c
        L_0x0225:
            r0 = move-exception
            goto L_0x016b
        L_0x0228:
            com.google.android.gms.internal.firebase_ml.zzmk r2 = com.google.android.gms.internal.firebase_ml.zzmk.INCOMPATIBLE_INPUT     // Catch:{ all -> 0x0255 }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r1 = r7.zzaqt     // Catch:{ all -> 0x0255 }
            if (r1 == 0) goto L_0x0230
            r6 = r9
            goto L_0x0231
        L_0x0230:
            r6 = r8
        L_0x0231:
            r1 = r18
            r5 = r19
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmk) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzpa) r5, (boolean) r6)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0239:
            r8 = 0
            r9 = 1
            com.google.android.gms.internal.firebase_ml.zzmk r2 = com.google.android.gms.internal.firebase_ml.zzmk.UNKNOWN_ERROR     // Catch:{ all -> 0x0255 }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r0 = r7.zzaqt     // Catch:{ all -> 0x0255 }
            if (r0 == 0) goto L_0x0243
            r6 = r9
            goto L_0x0244
        L_0x0243:
            r6 = r8
        L_0x0244:
            r1 = r18
            r5 = r19
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmk) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzpa) r5, (boolean) r6)     // Catch:{ all -> 0x0255 }
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0255 }
            java.lang.String r1 = "Model has not be loaded yet. Please run load() first"
            r2 = 9
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzpe.zza(com.google.android.gms.internal.firebase_ml.zzpa):com.google.firebase.ml.custom.FirebaseModelOutputs");
    }

    public final void zzlp() throws FirebaseMLException {
        synchronized (this) {
            zza(zzpf.zzatd);
        }
    }

    private final void zza(zzpi zzpi) throws FirebaseMLException {
        Exception exc;
        boolean z;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            Exception e = null;
            boolean z2 = false;
            try {
                z = zza(elapsedRealtime, zzpi, arrayList);
                exc = null;
            } catch (Exception e2) {
                exc = e2;
                z = false;
            }
            if (z) {
                zze(arrayList);
                return;
            }
            try {
                z2 = zzb(elapsedRealtime, zzpi, arrayList);
            } catch (Exception e3) {
                e = e3;
            }
            if (z2) {
                zze(arrayList);
                return;
            }
            arrayList.add(zzmk.NO_VALID_MODEL);
            zze(arrayList);
            if (exc != null) {
                throw new FirebaseMLException("Cloud model load failed: ", 14, exc);
            } else if (e != null) {
                throw new FirebaseMLException("Local model load failed: ", 14, e);
            } else {
                throw new FirebaseMLException("Cannot load custom model", 14);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(long r3, com.google.android.gms.internal.firebase_ml.zzpi r5, java.util.List<com.google.android.gms.internal.firebase_ml.zzmk> r6) throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.firebase_ml.zzov r0 = r2.zzaql     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004d
            com.google.android.gms.internal.firebase_ml.zzov r0 = r2.zzaql     // Catch:{ FirebaseMLException -> 0x003d }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ FirebaseMLException -> 0x003d }
            if (r0 == 0) goto L_0x002e
            com.google.android.gms.internal.firebase_ml.zzpj r5 = r5.zzd(r0)     // Catch:{ all -> 0x0050 }
            r2.zzatc = r5     // Catch:{ all -> 0x0050 }
            boolean r6 = r2.zzast     // Catch:{ all -> 0x0050 }
            r5.setUseNNAPI(r6)     // Catch:{ all -> 0x0050 }
            java.util.concurrent.atomic.AtomicLong r5 = r2.zzatb     // Catch:{ all -> 0x0050 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0050 }
            long r0 = r0 - r3
            r5.set(r0)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.common.internal.GmsLogger r3 = zzaoz     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = "ModelInterpreterTask"
            java.lang.String r5 = "Cloud model source is loaded successfully"
            r3.mo4172d(r4, r5)     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)
            r3 = 1
            return r3
        L_0x002e:
            com.google.android.gms.common.internal.GmsLogger r3 = zzaoz     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = "ModelInterpreterTask"
            java.lang.String r5 = "Cloud model source can NOT be loaded, try local model."
            r3.mo4172d(r4, r5)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.internal.firebase_ml.zzmk r3 = com.google.android.gms.internal.firebase_ml.zzmk.CLOUD_MODEL_LOADER_LOADS_NO_MODEL     // Catch:{ all -> 0x0050 }
            r6.add(r3)     // Catch:{ all -> 0x0050 }
            goto L_0x004d
        L_0x003d:
            r3 = move-exception
            com.google.android.gms.common.internal.GmsLogger r4 = zzaoz     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "ModelInterpreterTask"
            java.lang.String r0 = "Cloud model source can NOT be loaded, try local model."
            r4.mo4172d(r5, r0)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.internal.firebase_ml.zzmk r4 = com.google.android.gms.internal.firebase_ml.zzmk.CLOUD_MODEL_LOADER_ERROR     // Catch:{ all -> 0x0050 }
            r6.add(r4)     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x004d:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x0050:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzpe.zza(long, com.google.android.gms.internal.firebase_ml.zzpi, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb(long r3, com.google.android.gms.internal.firebase_ml.zzpi r5, java.util.List<com.google.android.gms.internal.firebase_ml.zzmk> r6) throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.firebase_ml.zzog r0 = r2.zzaqm     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0035
            com.google.android.gms.internal.firebase_ml.zzog r0 = r2.zzaqm     // Catch:{ all -> 0x0038 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0035
            com.google.android.gms.internal.firebase_ml.zzpj r5 = r5.zzd(r0)     // Catch:{ RuntimeException -> 0x002e }
            r2.zzatc = r5     // Catch:{ RuntimeException -> 0x002e }
            boolean r6 = r2.zzast     // Catch:{ all -> 0x0038 }
            r5.setUseNNAPI(r6)     // Catch:{ all -> 0x0038 }
            java.util.concurrent.atomic.AtomicLong r5 = r2.zzatb     // Catch:{ all -> 0x0038 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0038 }
            long r0 = r0 - r3
            r5.set(r0)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.common.internal.GmsLogger r3 = zzaoz     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "ModelInterpreterTask"
            java.lang.String r5 = "Local model source is loaded successfully"
            r3.mo4172d(r4, r5)     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            r3 = 1
            return r3
        L_0x002e:
            r3 = move-exception
            com.google.android.gms.internal.firebase_ml.zzmk r4 = com.google.android.gms.internal.firebase_ml.zzmk.LOCAL_MODEL_INVALID     // Catch:{ all -> 0x0038 }
            r6.add(r4)     // Catch:{ all -> 0x0038 }
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x0035:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x0038:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzpe.zzb(long, com.google.android.gms.internal.firebase_ml.zzpi, java.util.List):boolean");
    }

    public final void release() {
        synchronized (this) {
            if (this.zzatc != null) {
                this.zzatc.close();
                this.zzatc = null;
            }
            zzata = true;
        }
    }

    public final int getInputIndex(String str) throws FirebaseMLException {
        int inputIndex;
        synchronized (this) {
            if (this.zzatc != null) {
                inputIndex = this.zzatc.getInputIndex(str);
            } else {
                throw new FirebaseMLException("Trying to get input index while model has not been initialized yet, or has been released.", 14);
            }
        }
        return inputIndex;
    }

    public final int getOutputIndex(String str) throws FirebaseMLException {
        int outputIndex;
        synchronized (this) {
            if (this.zzatc != null) {
                outputIndex = this.zzatc.getOutputIndex(str);
            } else {
                throw new FirebaseMLException("Trying to get output index while model has not been initialized yet, or has been released.", 14);
            }
        }
        return outputIndex;
    }

    private final void zza(zzmk zzmk, long j, zzpa zzpa, boolean z) {
        this.zzaqs.zza((zznv) new zzpg(this, j, zzpa, zzmk, z), zzmn.CUSTOM_MODEL_RUN);
    }

    private final void zze(List<zzmk> list) {
        this.zzaqs.zza((zznv) new zzph(this, list), zzmn.CUSTOM_MODEL_LOAD);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmd.zzq.zza zzf(List list) {
        if (list.isEmpty()) {
            list.add(zzmk.NO_ERROR);
        }
        zzmd.zzn.zza zzl = zzmd.zzn.zzjo().zzl(this.zzatb.get()).zzh(list).zzl(this.zzast);
        FirebaseRemoteModel firebaseRemoteModel = this.zzaqt;
        if (firebaseRemoteModel != null) {
            zzl.zzf(firebaseRemoteModel.zzmh());
        }
        FirebaseLocalModel firebaseLocalModel = this.zzaqk;
        if (firebaseLocalModel != null) {
            zzl.zzg(firebaseLocalModel.zzmh());
        }
        return zzmd.zzq.zzjx().zzb(zzmd.zzac.zzli().zzbu(zzasz)).zzb(zzl);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmd.zzq.zza zza(long j, zzpa zzpa, zzmk zzmk, boolean z) {
        zzmd.zzo zzo;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (zzpa != null) {
            SparseArray<zzpc> zzml = zzpa.zzasw.zzml();
            for (int i = 0; i < zzml.size(); i++) {
                arrayList.add(zzml.valueAt(i).zzmu());
            }
            SparseArray<zzpc> zzmm = zzpa.zzasw.zzmm();
            for (int i2 = 0; i2 < zzmm.size(); i2++) {
                arrayList2.add(zzmm.valueAt(i2).zzmu());
            }
        }
        zzmd.zzm.zza zzb = zzmd.zzm.zzjk().zzb(zzmd.zzs.zzkb().zzn(elapsedRealtime - j).zzc(zzmk).zzz(zzata).zzaa(true).zzab(true).zzac(this.zzast));
        if (z) {
            zzo = this.zzaqt.zzmh();
        } else {
            zzo = this.zzaqk.zzmh();
        }
        return zzmd.zzq.zzjx().zzb(zzmd.zzac.zzli().zzbu(zzasz)).zzb(zzb.zzc(zzo).zzc((Iterable<? extends zzmd.zzm.zzb>) arrayList).zzd(arrayList2).zzk(this.zzatb.get()));
    }

    static final /* synthetic */ zzpj zzc(MappedByteBuffer mappedByteBuffer) {
        return new zzpj(new QuickAccountSelectAdapter$HeaderHolder(mappedByteBuffer));
    }
}
