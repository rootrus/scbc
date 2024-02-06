package com.google.android.gms.vision.face;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzdn;
import com.google.android.gms.internal.vision.zzdr;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.vision.EngineManager;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.LogUtils;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzg;
import com.google.android.gms.vision.face.internal.client.zzh;
import com.google.android.gms.vision.face.internal.client.zzk;
import java.io.File;

public abstract class ChimeraNativeBaseFaceDetectorCreator extends zzk {
    /* access modifiers changed from: protected */
    public abstract zzh zza(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze);

    /* access modifiers changed from: package-private */
    public abstract boolean zza(zze zze, String str);

    /* access modifiers changed from: package-private */
    public abstract EngineManager zzo();

    public zzg newFaceDetector(IObjectWrapper iObjectWrapper, zze zze) throws RemoteException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        DynamiteClearcutLogger dynamiteClearcutLogger = new DynamiteClearcutLogger(context);
        zzh zzh = null;
        try {
            zzo().zza(context);
            zzo();
            File zzc = EngineManager.zzc(context);
            boolean zza = zza(zze, new File(zzc, "models").toString());
            if (!zza) {
                Log.w("FaceDetectorCreatorImpl", "Missing model files were required by the face detector library");
            }
            if (!zza) {
                zzo().zzb(context);
            } else {
                zzh = zza(context, dynamiteClearcutLogger, zzc, zze);
            }
            if (zzh != null) {
                zza(dynamiteClearcutLogger, context, zze, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            return zzh;
        } catch (RemoteException e) {
            String message = e.getMessage();
            throw e;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (0 != 0) {
                zza(dynamiteClearcutLogger, context, zze, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            throw th2;
        }
    }

    private static void zza(DynamiteClearcutLogger dynamiteClearcutLogger, Context context, zze zze, String str, long j) {
        zzdu zzdu = new zzdu();
        zzdr zzdr = new zzdr();
        zzdu.zzqd = zzdr;
        zzdr.name = "face";
        zzdr.zzpq = Long.valueOf(j);
        zzdr.zzps = new zzdn();
        if (zze.mode == 1) {
            zzdr.zzps.zzow = 1;
        } else if (zze.mode == 0) {
            zzdr.zzps.zzow = 2;
        } else if (zze.mode == 2) {
            zzdr.zzps.zzow = 3;
        }
        if (zze.landmarkType == 1) {
            zzdr.zzps.zzox = 2;
        } else if (zze.landmarkType == 0) {
            zzdr.zzps.zzox = 1;
        } else if (zze.landmarkType == 2) {
            zzdr.zzps.zzox = 3;
        }
        if (zze.zzcn == 1) {
            zzdr.zzps.zzoy = 2;
        } else if (zze.zzcn == 0) {
            zzdr.zzps.zzoy = 1;
        }
        zzdr.zzps.zzoz = Boolean.valueOf(zze.zzcm);
        zzdr.zzps.zzpa = Boolean.valueOf(zze.trackingEnabled);
        zzdr.zzps.zzpb = Float.valueOf(zze.proportionalMinFaceSize);
        if (str != null) {
            zzdr.zzon = str;
        }
        zzdr.zzpr = LogUtils.zzd(context);
        dynamiteClearcutLogger.zza(2, zzdu);
    }
}
