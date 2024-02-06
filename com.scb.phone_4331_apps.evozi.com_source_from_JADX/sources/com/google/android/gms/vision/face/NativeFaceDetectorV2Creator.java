package com.google.android.gms.vision.face;

import android.content.Context;
import com.google.android.gms.vision.EngineManager;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzh;
import java.io.File;

public class NativeFaceDetectorV2Creator extends ChimeraNativeBaseFaceDetectorCreator {
    private static final EngineManager zzby = EngineManager.zza("face", "libface_detector_v2_jni.so");

    /* access modifiers changed from: package-private */
    public final boolean zza(zze zze, String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final EngineManager zzo() {
        return zzby;
    }

    /* access modifiers changed from: protected */
    public final zzh zza(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze) {
        return new NativeFaceDetectorV2Impl(context, dynamiteClearcutLogger, file, zze, new FaceDetectorV2Jni());
    }
}
