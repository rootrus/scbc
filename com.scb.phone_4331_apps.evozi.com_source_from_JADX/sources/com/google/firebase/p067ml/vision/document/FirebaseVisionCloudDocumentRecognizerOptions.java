package com.google.firebase.p067ml.vision.document;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions */
public class FirebaseVisionCloudDocumentRecognizerOptions {
    private final boolean zzawj;
    private final List<String> zzaxr;

    public List<String> getHintedLanguages() {
        return this.zzaxr;
    }

    private FirebaseVisionCloudDocumentRecognizerOptions(List<String> list, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.zzaxr = list;
        this.zzawj = z;
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions$Builder */
    public static class Builder {
        private boolean zzawj = false;
        private List<String> zzaxr = new ArrayList();

        public FirebaseVisionCloudDocumentRecognizerOptions build() {
            return new FirebaseVisionCloudDocumentRecognizerOptions(this.zzaxr, this.zzawj);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDocumentRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions = (FirebaseVisionCloudDocumentRecognizerOptions) obj;
        return this.zzaxr.equals(firebaseVisionCloudDocumentRecognizerOptions.getHintedLanguages()) && this.zzawj == firebaseVisionCloudDocumentRecognizerOptions.zzawj;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaxr, Boolean.valueOf(this.zzawj));
    }
}
