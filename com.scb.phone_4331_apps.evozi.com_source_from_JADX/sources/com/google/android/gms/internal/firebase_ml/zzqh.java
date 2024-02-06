package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p067ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.p067ml.vision.text.FirebaseVisionText;
import java.util.HashMap;
import java.util.Map;

public final class zzqh extends zzpo<FirebaseVisionText> {
    private static final Map<zznt<FirebaseVisionCloudTextRecognizerOptions>, zzqh> zzax = new HashMap();
    private final FirebaseVisionCloudTextRecognizerOptions zzazs;

    public static zzqh zza(FirebaseApp firebaseApp, FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        zzqh zzqh;
        synchronized (zzqh.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudTextRecognizerOptions, "Options must not be null");
            zznt zzj = zznt.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudTextRecognizerOptions);
            zzqh = zzax.get(zzj);
            if (zzqh == null) {
                zzqh = new zzqh(firebaseApp, firebaseVisionCloudTextRecognizerOptions);
                zzax.put(zzj, zzqh);
            }
        }
        return zzqh;
    }

    /* access modifiers changed from: protected */
    public final int zznh() {
        return 1024;
    }

    /* access modifiers changed from: protected */
    public final int zzni() {
        return 768;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzqh(FirebaseApp firebaseApp, FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        super(firebaseApp, firebaseVisionCloudTextRecognizerOptions.getModelType() == 1 ? "TEXT_DETECTION" : "DOCUMENT_TEXT_DETECTION", new zzjf(), firebaseVisionCloudTextRecognizerOptions.isEnforceCertFingerprintMatch());
        this.zzazs = firebaseVisionCloudTextRecognizerOptions;
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx(), firebaseVisionCloudTextRecognizerOptions.getModelType() == 2 ? zzmn.CLOUD_DOCUMENT_TEXT_CREATE : zzmn.CLOUD_TEXT_CREATE);
    }

    public final Task<FirebaseVisionText> processImage(FirebaseVisionImage firebaseVisionImage) {
        zzmn zzmn = zzmn.CLOUD_TEXT_DETECT;
        if (this.zzazs.getModelType() == 2) {
            zzmn = zzmn.CLOUD_DOCUMENT_TEXT_DETECT;
        }
        zznu.zza(this.zzapo, 1).zza(zzmd.zzq.zzjx(), zzmn);
        return super.zza(firebaseVisionImage);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza(zzir zzir, float f) {
        return zzql.zzb(zzir.zzhm(), 1.0f / f);
    }
}
