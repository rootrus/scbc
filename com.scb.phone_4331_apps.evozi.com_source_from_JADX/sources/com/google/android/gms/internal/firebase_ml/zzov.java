package com.google.android.gms.internal.firebase_ml;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.common.modeldownload.FirebaseRemoteModel;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class zzov {
    private static final GmsLogger zzaoz = new GmsLogger("RemoteModelLoader", "");
    private static Map<String, zzov> zzarj = new HashMap();
    private final zzon zzaqw;
    private final zzok zzara;
    private final zzoo zzark;
    private final zzoq zzarl;
    private final zzow zzarm;
    private boolean zzarn = true;

    private zzov(FirebaseApp firebaseApp, FirebaseRemoteModel firebaseRemoteModel, zzol zzol, zzow zzow, zzok zzok) {
        this.zzarl = new zzoq(firebaseApp, firebaseRemoteModel.zzmj(), zzol, zzok);
        zzon zzon = new zzon(firebaseApp, firebaseRemoteModel);
        this.zzaqw = zzon;
        this.zzark = new zzoo(firebaseApp, this.zzarl, firebaseRemoteModel, zzon);
        this.zzarm = zzow;
        this.zzara = zzok;
    }

    public static zzov zza(FirebaseApp firebaseApp, FirebaseRemoteModel firebaseRemoteModel, zzol zzol, zzow zzow, zzok zzok) {
        zzov zzov;
        synchronized (zzov.class) {
            String zzmj = firebaseRemoteModel.zzmj();
            if (!zzarj.containsKey(zzmj)) {
                zzarj.put(zzmj, new zzov(firebaseApp, firebaseRemoteModel, zzol, zzow, zzok));
            }
            zzov = zzarj.get(zzmj);
        }
        return zzov;
    }

    public final MappedByteBuffer load() throws FirebaseMLException {
        MappedByteBuffer zzad;
        synchronized (this) {
            zzaoz.mo4172d("RemoteModelLoader", "Try to load newly downloaded model file.");
            zzad = zzad(this.zzarn);
            if (zzad == null) {
                zzaoz.mo4172d("RemoteModelLoader", "Loading existing model file.");
                String zzmf = this.zzarl.zzmf();
                if (zzmf == null) {
                    zzaoz.mo4172d("RemoteModelLoader", "No existing model file");
                    zzad = null;
                } else {
                    zzad = zzbz(zzmf);
                }
            }
            if (this.zzarn) {
                this.zzarn = false;
                zzaoz.mo4172d("RemoteModelLoader", "Initial loading, check for model updates.");
                this.zzark.zzlv();
            }
        }
        return zzad;
    }

    private final MappedByteBuffer zzad(boolean z) throws FirebaseMLException {
        Long zzlw = this.zzark.zzlw();
        String zzlx = this.zzark.zzlx();
        if (zzlw == null || zzlx == null) {
            zzaoz.mo4172d("RemoteModelLoader", "No new model is downloading.");
            this.zzark.zzly();
            return null;
        }
        Integer zzlz = this.zzark.zzlz();
        if (zzlz == null) {
            this.zzark.zzly();
            return null;
        }
        GmsLogger gmsLogger = zzaoz;
        String valueOf = String.valueOf(zzlz);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Download Status code: ");
        sb.append(valueOf);
        gmsLogger.mo4172d("RemoteModelLoader", sb.toString());
        if (zzlz.intValue() == 8) {
            zzaoz.mo4172d("RemoteModelLoader", "Model downloaded successfully");
            this.zzaqw.zza(zzmk.NO_ERROR, true);
            ParcelFileDescriptor zzma = this.zzark.zzma();
            if (zzma == null) {
                this.zzark.zzly();
                return null;
            }
            zzaoz.mo4172d("RemoteModelLoader", "moving downloaded model from external storage to private folder.");
            try {
                File zza = this.zzarl.zza(zzma, zzlx, this.zzaqw);
                if (zza == null) {
                    return null;
                }
                GmsLogger gmsLogger2 = zzaoz;
                String valueOf2 = String.valueOf(zza.getParent());
                gmsLogger2.mo4172d("RemoteModelLoader", valueOf2.length() != 0 ? "Moved the downloaded model to private folder successfully: ".concat(valueOf2) : new String("Moved the downloaded model to private folder successfully: "));
                this.zzark.zzby(zzlx);
                if (z && this.zzarl.zzb(zza)) {
                    zzaoz.mo4172d("RemoteModelLoader", "All old models are deleted.");
                    zza = this.zzarl.zzc(zza);
                }
                return zzbz(zza.getAbsolutePath());
            } finally {
                this.zzark.zzly();
            }
        } else {
            if (zzlz.intValue() == 16) {
                this.zzaqw.zza(zzmk.DOWNLOAD_FAILED, true);
                this.zzark.zzly();
            }
            return null;
        }
    }

    public final void zzlu() throws FirebaseMLException {
        this.zzarm.zzlu();
    }

    private final MappedByteBuffer zzbz(String str) throws FirebaseMLException {
        return this.zzarm.zzca(str);
    }
}
