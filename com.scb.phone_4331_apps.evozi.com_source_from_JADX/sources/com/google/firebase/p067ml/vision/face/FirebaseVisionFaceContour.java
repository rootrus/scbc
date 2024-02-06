package com.google.firebase.p067ml.vision.face;

import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.firebase.p067ml.vision.common.FirebaseVisionPoint;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceContour */
public class FirebaseVisionFaceContour {
    private final int type;
    private final List<FirebaseVisionPoint> zzayd;

    public FirebaseVisionFaceContour(int i, List<FirebaseVisionPoint> list) {
        this.type = i;
        this.zzayd = list;
    }

    public String toString() {
        return zzkj.zzaz("FirebaseVisionFaceContour").zzb("type", this.type).zzh("points", this.zzayd.toArray()).toString();
    }
}
