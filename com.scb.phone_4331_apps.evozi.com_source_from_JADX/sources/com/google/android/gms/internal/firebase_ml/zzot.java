package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.io.File;

final class zzot implements zzoh {
    private final FirebaseApp zzapo;
    private final String zzaqg;

    zzot(FirebaseApp firebaseApp, String str) {
        this.zzapo = firebaseApp;
        this.zzaqg = str;
    }

    public final void zzlt() {
    }

    public final File zza(File file) throws FirebaseMLException {
        File zzb = zzoq.zzb(this.zzapo, this.zzaqg, zzok.TRANSLATE);
        File file2 = new File(zzb, String.valueOf(zzoq.zzd(zzb) + 1));
        if (file.renameTo(file2)) {
            zzoq.zzaoz.mo4172d("RemoteModelFileManager", "Rename to serving model successfully");
            file2.setExecutable(false);
            file2.setWritable(false);
            return file2;
        }
        zzoq.zzaoz.mo4172d("RemoteModelFileManager", "Rename to serving model failed, remove the temp file.");
        if (file.delete()) {
            return null;
        }
        GmsLogger zzlr = zzoq.zzaoz;
        String valueOf = String.valueOf(file.getAbsolutePath());
        zzlr.mo4172d("RemoteModelFileManager", valueOf.length() != 0 ? "Failed to delete the temp file: ".concat(valueOf) : new String("Failed to delete the temp file: "));
        return null;
    }
}
