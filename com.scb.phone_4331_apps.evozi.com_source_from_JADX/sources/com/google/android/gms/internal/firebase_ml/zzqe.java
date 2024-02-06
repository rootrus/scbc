package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.vision.label.ImageLabel;
import com.google.android.gms.vision.label.ImageLabeler;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p067ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import java.util.ArrayList;
import java.util.List;

public final class zzqe implements zznm<List<FirebaseVisionImageLabel>, zzpz>, zznw {
    private static boolean zzata = true;
    private static volatile Boolean zzaza;
    private final Context zzad;
    private final zznu zzaqs;
    private final FirebaseVisionOnDeviceImageLabelerOptions zzazb;
    private ImageLabeler zzazc;

    public zzqe(FirebaseApp firebaseApp, FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        Preconditions.checkNotNull(firebaseApp, "Context can not be null");
        Preconditions.checkNotNull(firebaseVisionOnDeviceImageLabelerOptions, "FirebaseVisionOnDeviceImageLabelerOptions can not be null");
        this.zzad = firebaseApp.getApplicationContext();
        this.zzazb = firebaseVisionOnDeviceImageLabelerOptions;
        this.zzaqs = zznu.zza(firebaseApp, 1);
    }

    public final zznw zzlm() {
        return this;
    }

    /* access modifiers changed from: private */
    public final List<FirebaseVisionImageLabel> zza(zzpz zzpz) throws FirebaseMLException {
        ArrayList arrayList;
        boolean z;
        synchronized (this) {
            if (zzaza == null) {
                Context context = this.zzad;
                if (DynamiteModule.getLocalVersion(context, "com.google.android.gms.vision.dynamite.ica") <= 0) {
                    if (DynamiteModule.getLocalVersion(context, "com.google.android.gms.vision.dynamite.imagelabel") <= 0) {
                        z = false;
                        zzaza = Boolean.valueOf(!z);
                    }
                }
                z = true;
                zzaza = Boolean.valueOf(!z);
            }
            if (!zzaza.booleanValue()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.zzazc == null) {
                    zza(zzmk.UNKNOWN_ERROR, elapsedRealtime, zzpz);
                    throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
                } else if (this.zzazc.isOperational()) {
                    SparseArray<ImageLabel> detect = this.zzazc.detect(zzpz.zzaxe);
                    arrayList = new ArrayList();
                    if (detect != null) {
                        for (int i = 0; i < detect.size(); i++) {
                            arrayList.add(new FirebaseVisionImageLabel(detect.get(detect.keyAt(i))));
                        }
                    }
                    zza(zzmk.NO_ERROR, elapsedRealtime, zzpz);
                    zzata = false;
                } else {
                    zza(zzmk.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzpz);
                    throw new FirebaseMLException("Waiting for the label detection model to be downloaded. Please wait.", 14);
                }
            } else {
                throw new FirebaseMLException("No model is bundled. Please check your app setup to includefirebase-ml-vision-image-label-model dependency.", 14);
            }
        }
        return arrayList;
    }

    public final void zzlp() {
        synchronized (this) {
            if (this.zzazc == null) {
                this.zzazc = new ImageLabeler.Builder(this.zzad).setScoreThreshold(this.zzazb.getConfidenceThreshold()).build();
            }
        }
    }

    public final void release() {
        synchronized (this) {
            if (this.zzazc != null) {
                this.zzazc.release();
                this.zzazc = null;
            }
            zzata = true;
        }
    }

    private final void zza(zzmk zzmk, long j, zzpz zzpz) {
        this.zzaqs.zza((zznv) new zzqf(this, j, zzmk, zzpz), zzmn.ON_DEVICE_IMAGE_LABEL_DETECT);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmd.zzq.zza zza(long j, zzmk zzmk, zzpz zzpz) {
        return zzmd.zzq.zzjx().zzb(zzmd.zzx.zzkm().zze(zzmd.zzs.zzkb().zzn(SystemClock.elapsedRealtime() - j).zzc(zzmk).zzz(zzata).zzaa(true).zzab(true)).zzb(this.zzazb.zzno()).zzd(zzpv.zzc(zzpz)));
    }
}
