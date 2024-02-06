package com.google.firebase.p067ml.vision.cloud;

import com.google.android.gms.common.internal.Objects;

/* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions */
public class FirebaseVisionCloudDetectorOptions {
    public static final FirebaseVisionCloudDetectorOptions DEFAULT = new Builder().build();
    private final int zzawh;
    private final int zzawi;
    private final boolean zzawj;

    private FirebaseVisionCloudDetectorOptions(int i, int i2, boolean z) {
        this.zzawh = i;
        this.zzawi = i2;
        this.zzawj = z;
    }

    public int getMaxResults() {
        return this.zzawh;
    }

    public int getModelType() {
        return this.zzawi;
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzawj;
    }

    /* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions$Builder */
    public static class Builder {
        private int zzawh = 10;
        private int zzawi = 1;
        private boolean zzawj = false;

        public FirebaseVisionCloudDetectorOptions build() {
            return new FirebaseVisionCloudDetectorOptions(this.zzawh, this.zzawi, this.zzawj);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDetectorOptions)) {
            return false;
        }
        FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = (FirebaseVisionCloudDetectorOptions) obj;
        return this.zzawh == firebaseVisionCloudDetectorOptions.zzawh && this.zzawi == firebaseVisionCloudDetectorOptions.zzawi && this.zzawj == firebaseVisionCloudDetectorOptions.zzawj;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzawh), Integer.valueOf(this.zzawi), Boolean.valueOf(this.zzawj));
    }
}
