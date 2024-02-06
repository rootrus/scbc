package com.google.firebase.p067ml.vision.label;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;

/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions */
public class FirebaseVisionOnDeviceImageLabelerOptions {
    private final float zzavp;

    public float getConfidenceThreshold() {
        return this.zzavp;
    }

    private FirebaseVisionOnDeviceImageLabelerOptions(float f) {
        this.zzavp = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FirebaseVisionOnDeviceImageLabelerOptions) && this.zzavp == ((FirebaseVisionOnDeviceImageLabelerOptions) obj).zzavp;
    }

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions$Builder */
    public static class Builder {
        private float zzavp = 0.5f;

        public FirebaseVisionOnDeviceImageLabelerOptions build() {
            return new FirebaseVisionOnDeviceImageLabelerOptions(this.zzavp);
        }
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzavp));
    }

    public final zzmd.zzy zzno() {
        return (zzmd.zzy) ((zzue) zzmd.zzy.zzko().zzq(this.zzavp).zzrj());
    }
}
