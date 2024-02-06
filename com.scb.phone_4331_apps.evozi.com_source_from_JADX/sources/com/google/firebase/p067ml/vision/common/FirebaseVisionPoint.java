package com.google.firebase.p067ml.vision.common;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzkj;

/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionPoint */
public final class FirebaseVisionPoint {
    private final Float zzaxj;
    private final Float zzaxk;
    private final Float zzaxl = null;

    public FirebaseVisionPoint(Float f, Float f2, Float f3) {
        this.zzaxj = f;
        this.zzaxk = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionPoint)) {
            return false;
        }
        FirebaseVisionPoint firebaseVisionPoint = (FirebaseVisionPoint) obj;
        return Objects.equal(this.zzaxj, firebaseVisionPoint.zzaxj) && Objects.equal(this.zzaxk, firebaseVisionPoint.zzaxk) && Objects.equal((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzaxj, this.zzaxk, null);
    }

    public final String toString() {
        return zzkj.zzaz("FirebaseVisionPoint").zzh("x", this.zzaxj).zzh("y", this.zzaxk).zzh("z", (Object) null).toString();
    }
}
