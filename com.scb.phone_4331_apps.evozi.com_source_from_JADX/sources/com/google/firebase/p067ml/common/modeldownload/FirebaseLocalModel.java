package com.google.firebase.p067ml.common.modeldownload;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseLocalModel */
public class FirebaseLocalModel {
    private final String zzaqg;
    private final String zzart;
    private final String zzaru;

    public String getFilePath() {
        return this.zzart;
    }

    public String getAssetFilePath() {
        return this.zzaru;
    }

    private FirebaseLocalModel(String str, String str2, String str3) {
        this.zzaqg = str;
        this.zzart = str2;
        this.zzaru = str3;
    }

    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseLocalModel$Builder */
    public static class Builder {
        private final String zzaqg;
        private String zzart = null;
        private String zzarv = null;

        public Builder(String str) {
            Preconditions.checkNotEmpty(str, "Model name can not be empty");
            this.zzaqg = str;
        }

        public Builder setFilePath(String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            Preconditions.checkArgument(this.zzarv == null, "A local model source is either from local file or for asset, you can not set both.");
            this.zzart = str;
            return this;
        }

        public FirebaseLocalModel build() {
            Preconditions.checkArgument((this.zzart != null && this.zzarv == null) || (this.zzart == null && this.zzarv != null), "Please set either filePath or assetFilePath.");
            return new FirebaseLocalModel(this.zzaqg, this.zzart, this.zzarv);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseLocalModel)) {
            return false;
        }
        FirebaseLocalModel firebaseLocalModel = (FirebaseLocalModel) obj;
        return Objects.equal(this.zzaqg, firebaseLocalModel.zzaqg) && Objects.equal(this.zzart, firebaseLocalModel.zzart) && Objects.equal(this.zzaru, firebaseLocalModel.zzaru);
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaqg, this.zzart, this.zzaru);
    }

    public final zzmd.zzo zzmh() {
        zzmd.zzu.zzb zzb;
        zzmd.zzo.zza zzjq = zzmd.zzo.zzjq();
        zzmd.zzu.zza zzkg = zzmd.zzu.zzkg();
        String str = this.zzart;
        if (str == null) {
            str = this.zzaru;
        }
        zzmd.zzu.zza zzbf = zzkg.zzbf(str);
        if (this.zzart != null) {
            zzb = zzmd.zzu.zzb.LOCAL;
        } else if (this.zzaru != null) {
            zzb = zzmd.zzu.zzb.APP_ASSET;
        } else {
            zzb = zzmd.zzu.zzb.SOURCE_UNKNOWN;
        }
        return (zzmd.zzo) ((zzue) zzjq.zzb(zzbf.zzb(zzb)).zzrj());
    }
}
