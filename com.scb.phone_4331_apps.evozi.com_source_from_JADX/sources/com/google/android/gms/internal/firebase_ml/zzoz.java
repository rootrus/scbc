package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;
import java.io.File;
import org.tensorflow.lite.TensorFlowLite;
import p040o.QuickAccountSelectAdapter$HeaderHolder;

public final class zzoz implements zzol {
    private static final GmsLogger zzaoz = new GmsLogger("CustomCompatChecker", "");

    public final boolean zza(File file, zzon zzon) {
        try {
            new QuickAccountSelectAdapter$HeaderHolder(file).close();
            return true;
        } catch (Exception e) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
            sb.append("The model is INCOMPATIBLE. It may contain unrecognized custom ops, or not FlatBuffer format: ");
            sb.append(valueOf);
            gmsLogger.mo4172d("CustomCompatChecker", sb.toString());
            zzon.zza(zzmk.INCOMPATIBLE_TFLITE_VERSION, TensorFlowLite.version(), false);
            return false;
        }
    }
}
