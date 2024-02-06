package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.vision.text.FirebaseVisionText;

public final class zzqj implements zznm<FirebaseVisionText, zzpz>, zznw {
    static boolean zzata = true;
    private final Context zzad;
    private final zznu zzaqs;
    private zzpu zzawc = new zzpu();
    private TextRecognizer zzazt;

    public zzqj(FirebaseApp firebaseApp) {
        Preconditions.checkNotNull(firebaseApp, "Firebase App can not be null");
        this.zzad = firebaseApp.getApplicationContext();
        this.zzaqs = zznu.zza(firebaseApp, 1);
    }

    public final zznw zzlm() {
        return this;
    }

    public final void zzlp() {
        synchronized (this) {
            if (this.zzazt == null) {
                this.zzazt = new TextRecognizer.Builder(this.zzad).build();
            }
        }
    }

    public final void release() {
        synchronized (this) {
            if (this.zzazt != null) {
                this.zzazt.release();
                this.zzazt = null;
            }
            zzata = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final FirebaseVisionText zza(zzpz zzpz) throws FirebaseMLException {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.zzazt == null) {
                zza(zzmk.UNKNOWN_ERROR, elapsedRealtime, zzpz);
                throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
            } else if (this.zzazt.isOperational()) {
                this.zzawc.zzb(zzpz);
                SparseArray<TextBlock> detect = this.zzazt.detect(zzpz.zzaxe);
                zza(zzmk.NO_ERROR, elapsedRealtime, zzpz);
                zzata = false;
                if (detect == null) {
                    return null;
                }
                FirebaseVisionText firebaseVisionText = new FirebaseVisionText(detect);
                return firebaseVisionText;
            } else {
                zza(zzmk.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzpz);
                throw new FirebaseMLException("Waiting for the text recognition model to be downloaded. Please wait.", 14);
            }
        }
    }

    private final void zza(zzmk zzmk, long j, zzpz zzpz) {
        this.zzaqs.zza((zznv) new zzqk(j, zzmk, zzpz), zzmn.ON_DEVICE_TEXT_DETECT);
    }
}
