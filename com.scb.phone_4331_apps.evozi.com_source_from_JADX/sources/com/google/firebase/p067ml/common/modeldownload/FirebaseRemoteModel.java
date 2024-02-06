package com.google.firebase.p067ml.common.modeldownload;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel */
public class FirebaseRemoteModel {
    private static final Map<zza, String> zzasd = new HashMap();
    private static final Map<zza, String> zzase;
    private final String zzaqg;
    private String zzaqz;
    private final zza zzasc;
    private final boolean zzasf;
    private final FirebaseModelDownloadConditions zzasg;
    private final FirebaseModelDownloadConditions zzash;

    public final String zzmj() {
        String str = this.zzaqg;
        if (str != null) {
            return str;
        }
        return zzase.get(this.zzasc);
    }

    public final boolean zzmk() {
        return this.zzasc != null;
    }

    public String getModelName() {
        return this.zzaqg;
    }

    public boolean isModelUpdatesEnabled() {
        return this.zzasf;
    }

    public FirebaseModelDownloadConditions getInitialDownloadConditions() {
        return this.zzasg;
    }

    public FirebaseModelDownloadConditions getUpdatesDownloadConditions() {
        return this.zzash;
    }

    public final boolean zzcd(String str) {
        zza zza = this.zzasc;
        if (zza == null) {
            return false;
        }
        return str.equals(zzasd.get(zza));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseRemoteModel)) {
            return false;
        }
        FirebaseRemoteModel firebaseRemoteModel = (FirebaseRemoteModel) obj;
        return Objects.equal(this.zzaqg, firebaseRemoteModel.zzaqg) && Objects.equal(this.zzasc, firebaseRemoteModel.zzasc) && this.zzasf == firebaseRemoteModel.zzasf && this.zzasg.equals(firebaseRemoteModel.zzasg) && this.zzash.equals(firebaseRemoteModel.zzash);
    }

    public int hashCode() {
        return Objects.hashCode(this.zzaqg, this.zzasc, Boolean.valueOf(this.zzasf), Integer.valueOf(Objects.hashCode(this.zzasg)), Integer.valueOf(Objects.hashCode(this.zzash)));
    }

    public final void zzce(String str) {
        this.zzaqz = str;
    }

    public final zzmd.zzo zzmh() {
        zzmd.zzo.zza zzd = zzmd.zzo.zzjq().zzc(this.zzasg.zzmi()).zzd(this.zzash.zzmi());
        zzmd.zzu.zza zzb = zzmd.zzu.zzkg().zzbe(zzmj()).zzb(zzmd.zzu.zzb.CLOUD);
        String str = this.zzaqz;
        if (str == null) {
            str = "";
        }
        return (zzmd.zzo) ((zzue) zzd.zzb(zzb.zzbg(str)).zzn(this.zzasf).zzrj());
    }

    static {
        HashMap hashMap = new HashMap();
        zzase = hashMap;
        hashMap.put(zza.FACE_DETECTION, "face_detector_model_m41");
        zzase.put(zza.SMART_REPLY, "smart_reply_model_m41");
        zzase.put(zza.TRANSLATE, "translate_model_m41");
        zzasd.put(zza.FACE_DETECTION, "modelHash");
        zzasd.put(zza.SMART_REPLY, "smart_reply_model_hash");
        zzasd.put(zza.TRANSLATE, "modelHash");
    }
}
