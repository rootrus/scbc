package com.google.firebase.p067ml.vision.face;

import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.firebase.p067ml.vision.common.FirebaseVisionPoint;

/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceLandmark */
public class FirebaseVisionFaceLandmark {
    private final int type;
    private final FirebaseVisionPoint zzayk;

    FirebaseVisionFaceLandmark(int i, FirebaseVisionPoint firebaseVisionPoint) {
        this.type = i;
        this.zzayk = firebaseVisionPoint;
    }

    public String toString() {
        return zzkj.zzaz("FirebaseVisionFaceLandmark").zzb("type", this.type).zzh("position", this.zzayk).toString();
    }
}
