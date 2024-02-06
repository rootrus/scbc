package pingan.p063ai.paverify.vertify;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: pingan.ai.paverify.vertify.PFaceDetector */
public class PFaceDetector {

    /* renamed from: pingan.ai.paverify.vertify.PFaceDetector$AceFaceInfo */
    public static class AceFaceInfo implements Serializable {

        /* renamed from: ID */
        public int f3222ID;
        public String bmpBase64;
        public int bottom;
        public float eye_dist;
        public int faceNum;
        public String imageFormat;
        public float[] landmarkposition;
        public float landmarkscore;
        public int left;
        public float rankingScore;
        public int right;
        public float score;
        public int top;

        public void setEmpty() {
            this.faceNum = 0;
            this.left = 0;
            this.top = 0;
            this.right = 0;
            this.bottom = 0;
            this.score = BitmapDescriptorFactory.HUE_RED;
            this.eye_dist = BitmapDescriptorFactory.HUE_RED;
            this.f3222ID = 0;
            this.landmarkscore = BitmapDescriptorFactory.HUE_RED;
            this.bmpBase64 = null;
            this.imageFormat = null;
            this.rankingScore = BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* renamed from: pingan.ai.paverify.vertify.PFaceDetector$FaceConfig */
    public static class FaceConfig {
        public double detectFaceMaxScale = 0.3d;
        public double detectFaceMinScale = 0.1d;
        public double liveThreshold100 = 0.17527d;
        public double liveThreshold1000 = 0.77133d;
        public double liveThreshold10000 = 0.93352d;
        public double lmkScoreThreshold = 0.48d;
        public int occ_size = 0;
        public boolean trackingMode = true;
        public boolean usePyramid = false;
    }

    /* renamed from: pingan.ai.paverify.vertify.PFaceDetector$PFace */
    public static class PFace implements Serializable {
        public float confidence;
        public float faceH;
        public int faceID;
        public float faceW;
        public float faceX;
        public float faceY;
        public byte[] frame;
        public int frameHeight;
        public int frameRotate;
        public int frameWidth;
        public float timeUse;
    }

    /* renamed from: pingan.ai.paverify.vertify.PFaceDetector$PaFace */
    public static class PaFace implements Serializable {
        public AceFaceInfo[] aceFaceInfos;
        public int faceNum;
        public int ret;
    }

    /* renamed from: a */
    public static void m3590a() {
        nativeRanking(false);
    }

    public static native synchronized float[] nativeActionEyes();

    public static native synchronized float[] nativeActionEyesTrends();

    public static native synchronized float[] nativeActionMouthTrends();

    public static native synchronized float nativeAntiSplicing();

    public static native synchronized void nativeClassInit();

    public static native synchronized float nativeCompareFeature(float[] fArr, float[] fArr2);

    public static native synchronized void nativeDestroy();

    public static native synchronized int nativeDetectFaces(byte[] bArr, int i, int i2, int i3, AceFaceInfo[] aceFaceInfoArr);

    public static native synchronized int nativeDetectFacesByBitmap(Bitmap bitmap, AceFaceInfo[] aceFaceInfoArr);

    public static native synchronized String nativeGateOfHeaven();

    public static native synchronized float nativeGetBlur();

    public static native synchronized float[] nativeGetFeature();

    public static native synchronized float nativeGetIllumination();

    public static native synchronized float[] nativeGetPose();

    public static native synchronized float[] nativeGetPoseTrends();

    public static native synchronized String nativeGetVersion();

    public static native synchronized float nativeImageOptLive(byte[] bArr, int i, int i2, int i3, float[] fArr);

    public static native synchronized boolean nativeInitialize(String str, int i);

    public static native synchronized float nativeLive();

    public static native synchronized float[] nativeLiveLightNew(List<byte[]> list, List<float[]> list2, byte[] bArr, boolean z);

    public static native synchronized float[] nativeOcc();

    public static native synchronized float nativeRanking(boolean z);

    public static native synchronized int nativeSelectOptimalRankingMat(String str, AceFaceInfo aceFaceInfo, int i);

    public static native synchronized void setConfig(FaceConfig faceConfig);
}
