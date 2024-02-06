package com.google.firebase.p067ml.vision.label;

import com.google.android.gms.common.internal.Objects;

/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionCloudImageLabelerOptions */
public class FirebaseVisionCloudImageLabelerOptions {
    private final float zzavp;
    private final boolean zzawj;

    private FirebaseVisionCloudImageLabelerOptions(float f, boolean z) {
        this.zzavp = f;
        this.zzawj = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudImageLabelerOptions)) {
            return false;
        }
        FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions = (FirebaseVisionCloudImageLabelerOptions) obj;
        return Float.compare(this.zzavp, firebaseVisionCloudImageLabelerOptions.zzavp) == 0 && this.zzawj == firebaseVisionCloudImageLabelerOptions.zzawj;
    }

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionCloudImageLabelerOptions$Builder */
    public static class Builder {
        private float zzavp = 0.5f;
        private boolean zzawj = false;

        public FirebaseVisionCloudImageLabelerOptions build() {
            return new FirebaseVisionCloudImageLabelerOptions(this.zzavp, this.zzawj);
        }
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzavp), Boolean.valueOf(this.zzawj));
    }
}
