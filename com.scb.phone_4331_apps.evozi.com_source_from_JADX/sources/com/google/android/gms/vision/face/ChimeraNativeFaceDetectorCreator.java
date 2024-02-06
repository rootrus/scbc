package com.google.android.gms.vision.face;

import android.content.Context;
import com.google.android.gms.vision.EngineManager;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzh;
import java.io.File;

public class ChimeraNativeFaceDetectorCreator extends ChimeraNativeBaseFaceDetectorCreator {
    private static final EngineManager zzby = EngineManager.zza("face", "libmobile_vision_face.so");

    /* access modifiers changed from: protected */
    public final EngineManager zzo() {
        return zzby;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zze zze, String str) {
        return NativeFaceDetectorImpl.validateModelFilesJni(NativeFaceSettings.zzc(zze), str);
    }

    /* access modifiers changed from: protected */
    public final zzh zza(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze) {
        return new NativeFaceDetectorImpl(context, dynamiteClearcutLogger, file, zze);
    }
}
