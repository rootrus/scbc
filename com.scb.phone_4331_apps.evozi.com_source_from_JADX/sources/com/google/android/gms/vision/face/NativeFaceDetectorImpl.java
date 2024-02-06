package com.google.android.gms.vision.face;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzl;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzh;
import java.io.File;
import java.nio.ByteBuffer;

public class NativeFaceDetectorImpl extends zzh {
    private final Context mContext;
    private final ByteBuffer zzcq;
    private final DynamiteClearcutLogger zzcr;

    NativeFaceDetectorImpl(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze) {
        this.zzcq = initDetectorJni(NativeFaceSettings.zzc(zze), new File(file, "models").toString());
        this.mContext = context;
        this.zzcr = dynamiteClearcutLogger;
    }

    private static native FaceParcel[] detectFacesJni(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    private static native FaceParcel[] detectFacesJni(ByteBuffer byteBuffer, byte[] bArr, int i, int i2, int i3);

    private static native void finalizeDetectorJni(ByteBuffer byteBuffer);

    private static native ByteBuffer initDetectorJni(NativeFaceSettings nativeFaceSettings, String str);

    private static native boolean trackSingleFaceJni(ByteBuffer byteBuffer, int i);

    static native boolean validateModelFilesJni(NativeFaceSettings nativeFaceSettings, String str);

    public final void zzn() throws RemoteException {
        finalizeDetectorJni(this.zzcq);
    }

    public final FaceParcel[] zzc(IObjectWrapper iObjectWrapper, zzn zzn) throws RemoteException {
        FaceParcel[] faceParcelArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper);
            if (byteBuffer.isDirect()) {
                faceParcelArr = detectFacesJni(this.zzcq, byteBuffer, zzn.width, zzn.height, zzn.rotation);
            } else if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
                byte[] bArr = new byte[(zzn.width * zzn.height)];
                byteBuffer.get(bArr);
                faceParcelArr = detectFacesJni(this.zzcq, bArr, zzn.width, zzn.height, zzn.rotation);
            } else {
                faceParcelArr = detectFacesJni(this.zzcq, byteBuffer.array(), zzn.width, zzn.height, zzn.rotation);
            }
            DynamiteClearcutLogger dynamiteClearcutLogger = this.zzcr;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zzn.f3239id <= 2 || faceParcelArr.length != 0) {
                dynamiteClearcutLogger.zza(3, zzl.zza(zzn, faceParcelArr, (String) null, elapsedRealtime2 - elapsedRealtime));
            }
            return faceParcelArr;
        } catch (Exception e) {
            Log.e("NativeFaceDetectorImpl", "Native face detection failed", e);
            return new FaceParcel[0];
        }
    }

    public final boolean zzd(int i) throws RemoteException {
        return trackSingleFaceJni(this.zzcq, i);
    }
}
