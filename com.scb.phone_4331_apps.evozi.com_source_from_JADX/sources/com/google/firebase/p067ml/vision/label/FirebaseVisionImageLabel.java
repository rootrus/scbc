package com.google.firebase.p067ml.vision.label;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzjb;
import com.google.android.gms.internal.firebase_ml.zzpm;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.vision.label.ImageLabel;

/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionImageLabel */
public class FirebaseVisionImageLabel {
    private final String text;
    private final float zzatw;
    private final String zzavo;

    public FirebaseVisionImageLabel(ImageLabel imageLabel) {
        this(imageLabel.getLabel(), imageLabel.getConfidence(), imageLabel.getMid());
    }

    public static FirebaseVisionImageLabel zza(zzjb zzjb) {
        if (zzjb == null) {
            return null;
        }
        return new FirebaseVisionImageLabel(zzjb.getDescription(), zzpm.zza(zzjb.zzhv()), zzjb.getMid());
    }

    private FirebaseVisionImageLabel(String str, float f, String str2) {
        this.text = str == null ? "" : str;
        this.zzavo = str2;
        if (Float.compare(f, BitmapDescriptorFactory.HUE_RED) < 0) {
            f = 0.0f;
        } else if (Float.compare(f, 1.0f) > 0) {
            f = 1.0f;
        }
        this.zzatw = f;
    }

    public String getEntityId() {
        return this.zzavo;
    }

    public String getText() {
        return this.text;
    }

    public float getConfidence() {
        return this.zzatw;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionImageLabel)) {
            return false;
        }
        FirebaseVisionImageLabel firebaseVisionImageLabel = (FirebaseVisionImageLabel) obj;
        return Objects.equal(this.zzavo, firebaseVisionImageLabel.getEntityId()) && Objects.equal(this.text, firebaseVisionImageLabel.getText()) && Float.compare(this.zzatw, firebaseVisionImageLabel.getConfidence()) == 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzavo, this.text, Float.valueOf(this.zzatw));
    }
}
