package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p067ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p067ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import java.io.Closeable;
import java.util.List;

public final class zzqd extends zzpw<List<FirebaseVisionImageLabel>> implements Closeable {
    public zzqd(FirebaseApp firebaseApp, FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        super(firebaseApp, new zzqe(firebaseApp, firebaseVisionOnDeviceImageLabelerOptions));
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx(), zzmn.ON_DEVICE_IMAGE_LABEL_CREATE);
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(FirebaseVisionImage firebaseVisionImage) {
        return zza(firebaseVisionImage, true, false);
    }
}
