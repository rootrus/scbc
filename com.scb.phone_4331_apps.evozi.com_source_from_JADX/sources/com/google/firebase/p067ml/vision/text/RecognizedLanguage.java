package com.google.firebase.p067ml.vision.text;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zziz;

/* renamed from: com.google.firebase.ml.vision.text.RecognizedLanguage */
public class RecognizedLanguage {
    private final String languageCode;

    public String getLanguageCode() {
        return this.languageCode;
    }

    private RecognizedLanguage(String str) {
        this.languageCode = str;
    }

    public static RecognizedLanguage zza(zziz zziz) {
        if (zziz == null || zziz.getLanguageCode() == null || zziz.getLanguageCode().isEmpty()) {
            return null;
        }
        return new RecognizedLanguage(zziz.getLanguageCode());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecognizedLanguage)) {
            return false;
        }
        RecognizedLanguage recognizedLanguage = (RecognizedLanguage) obj;
        String str = this.languageCode;
        if (str == null) {
            return recognizedLanguage.languageCode == null;
        }
        return str.equals(recognizedLanguage.languageCode);
    }

    public int hashCode() {
        return Objects.hashCode(this.languageCode);
    }
}
