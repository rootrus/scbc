package com.google.firebase.p067ml.common.modeldownload;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions */
public class FirebaseModelDownloadConditions {
    private final boolean zzarw;
    private final boolean zzarx;
    private final boolean zzary;

    public boolean isChargingRequired() {
        return this.zzarw;
    }

    public boolean isWifiRequired() {
        return this.zzarx;
    }

    public boolean isDeviceIdleRequired() {
        return this.zzary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseModelDownloadConditions)) {
            return false;
        }
        FirebaseModelDownloadConditions firebaseModelDownloadConditions = (FirebaseModelDownloadConditions) obj;
        return this.zzarw == firebaseModelDownloadConditions.zzarw && this.zzary == firebaseModelDownloadConditions.zzary && this.zzarx == firebaseModelDownloadConditions.zzarx;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zzarw), Boolean.valueOf(this.zzarx), Boolean.valueOf(this.zzary));
    }

    public final zzmd.zzo.zzb zzmi() {
        return (zzmd.zzo.zzb) ((zzue) zzmd.zzo.zzb.zzjs().zzr(this.zzarw).zzt(this.zzary).zzs(this.zzarx).zzrj());
    }
}
