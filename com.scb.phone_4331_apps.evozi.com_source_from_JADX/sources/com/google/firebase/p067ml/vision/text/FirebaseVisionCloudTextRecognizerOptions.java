package com.google.firebase.p067ml.vision.text;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions */
public class FirebaseVisionCloudTextRecognizerOptions {
    private final boolean zzawj;
    private final List<String> zzaxr;
    private final int zzazl;

    public List<String> getHintedLanguages() {
        return this.zzaxr;
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzawj;
    }

    public int getModelType() {
        return this.zzazl;
    }

    private FirebaseVisionCloudTextRecognizerOptions(List<String> list, int i, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.zzaxr = list;
        this.zzazl = i;
        this.zzawj = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudTextRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions = (FirebaseVisionCloudTextRecognizerOptions) obj;
        return this.zzaxr.equals(firebaseVisionCloudTextRecognizerOptions.getHintedLanguages()) && this.zzazl == firebaseVisionCloudTextRecognizerOptions.zzazl && this.zzawj == firebaseVisionCloudTextRecognizerOptions.zzawj;
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions$Builder */
    public static class Builder {
        private boolean zzawj = false;
        private List<String> zzaxr = new ArrayList();
        private int zzazl = 1;

        public FirebaseVisionCloudTextRecognizerOptions build() {
            return new FirebaseVisionCloudTextRecognizerOptions(this.zzaxr, this.zzazl, this.zzawj);
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaxr, Integer.valueOf(this.zzazl), Boolean.valueOf(this.zzawj));
    }
}
