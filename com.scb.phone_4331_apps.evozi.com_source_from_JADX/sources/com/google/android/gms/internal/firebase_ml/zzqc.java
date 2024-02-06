package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p067ml.vision.label.FirebaseVisionImageLabel;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import java.util.ArrayList;
import java.util.List;

public final class zzqc extends zzpo<List<FirebaseVisionImageLabel>> {
    public zzqc(FirebaseApp firebaseApp, FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        super(firebaseApp, "LABEL_DETECTION", firebaseVisionCloudDetectorOptions);
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_IMAGE_LABEL_CREATE);
    }

    /* access modifiers changed from: protected */
    public final int zznh() {
        return 640;
    }

    /* access modifiers changed from: protected */
    public final int zzni() {
        return C0608h.f1447Az;
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(FirebaseVisionImage firebaseVisionImage) {
        zznu.zza(this.zzapo, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_IMAGE_LABEL_DETECT);
        return super.zza(firebaseVisionImage);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza(zzir zzir, float f) {
        if (zzir.zzhn() == null) {
            return new ArrayList();
        }
        List<zzjb> zzhn = zzir.zzhn();
        ArrayList arrayList = new ArrayList();
        for (zzjb zza : zzhn) {
            FirebaseVisionImageLabel zza2 = FirebaseVisionImageLabel.zza(zza);
            if (zza2 != null) {
                arrayList.add(zza2);
            }
        }
        return arrayList;
    }
}
