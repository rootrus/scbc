package p040o;

import android.os.Handler;
import p039io.beid.beidk.processor.FaceProcessor;

/* renamed from: o.ActivateChequeLandingActivity */
public final class ActivateChequeLandingActivity extends ActivateChequeReviewActivity implements onEmailUsClick$MediaBrowserCompat$MediaItem, Runnable {
    private Integer IconCompatParcelizer;
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private Handler MediaBrowserCompat$MediaItem;
    private Runnable MediaBrowserCompat$SearchResultReceiver;
    private ChequeStatusActivity MediaMetadataCompat;
    private Integer RatingCompat;
    private Integer read;
    private Integer write;

    public ActivateChequeLandingActivity() {
        this(1, 5000);
    }

    public ActivateChequeLandingActivity(Integer num, Integer num2) {
        this.write = FaceProcessor.LivenessActivity.CLOSE_RIGHT_EYE;
        this.read = num;
        this.MediaBrowserCompat$CustomActionResultReceiver = num2;
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.IconCompatParcelizer = 0;
        this.RatingCompat = -1;
    }

    public final Integer IconCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return "close_right_eye";
    }

    public final void read(ChequeStatusActivity chequeStatusActivity) {
        this.MediaMetadataCompat = chequeStatusActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = this;
        Handler handler = new Handler();
        this.MediaBrowserCompat$MediaItem = handler;
        handler.postDelayed(this.MediaBrowserCompat$SearchResultReceiver, (long) this.MediaBrowserCompat$CustomActionResultReceiver.intValue());
        this.MediaBrowserCompat$ItemReceiver = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.ChequeAnnouncementActivity r10) {
        /*
            r9 = this;
            java.lang.Integer r0 = r9.RatingCompat
            int r0 = r0.intValue()
            r1 = 1
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.RatingCompat = r0
            java.lang.Integer r0 = r9.MediaBrowserCompat$ItemReceiver
            int r0 = r0.intValue()
            r2 = -1
            if (r0 != r2) goto L_0x0018
            return
        L_0x0018:
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0023
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x0029
        L_0x0023:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x0029:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x003a
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
            goto L_0x0040
        L_0x003a:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
        L_0x0040:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.Integer r0 = r9.MediaBrowserCompat$ItemReceiver
            int r0 = r0.intValue()
            r3 = 3
            r4 = 4605831338911806259(0x3feb333333333333, double:0.85)
            if (r0 == 0) goto L_0x0091
            r6 = 2
            if (r0 == r1) goto L_0x005d
            if (r0 != r6) goto L_0x00c1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            goto L_0x00bf
        L_0x005d:
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0068
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x006e
        L_0x0068:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x006e:
            double r7 = (double) r0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            com.google.firebase.ml.vision.face.FirebaseVisionFace r10 = r10.IconCompatParcelizer
            if (r0 == 0) goto L_0x007e
            float r10 = r10.getLeftEyeOpenProbability()
            goto L_0x0082
        L_0x007e:
            float r10 = r10.getRightEyeOpenProbability()
        L_0x0082:
            double r4 = (double) r10
            r7 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            goto L_0x00bf
        L_0x0091:
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x009c
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x00a2
        L_0x009c:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x00a2:
            double r6 = (double) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            com.google.firebase.ml.vision.face.FirebaseVisionFace r10 = r10.IconCompatParcelizer
            if (r0 == 0) goto L_0x00b2
            float r10 = r10.getLeftEyeOpenProbability()
            goto L_0x00b6
        L_0x00b2:
            float r10 = r10.getRightEyeOpenProbability()
        L_0x00b6:
            double r6 = (double) r10
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x00c1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
        L_0x00bf:
            r9.MediaBrowserCompat$ItemReceiver = r10
        L_0x00c1:
            java.lang.Integer r10 = r9.MediaBrowserCompat$ItemReceiver
            int r10 = r10.intValue()
            if (r10 != r3) goto L_0x00dd
            r10 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.MediaBrowserCompat$ItemReceiver = r10
            java.lang.Integer r10 = r9.IconCompatParcelizer
            int r10 = r10.intValue()
            int r10 = r10 + r1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.IconCompatParcelizer = r10
        L_0x00dd:
            java.lang.Integer r10 = r9.IconCompatParcelizer
            int r10 = r10.intValue()
            java.lang.Integer r0 = r9.read
            int r0 = r0.intValue()
            if (r10 < r0) goto L_0x0102
            android.os.Handler r10 = r9.MediaBrowserCompat$MediaItem
            java.lang.Runnable r0 = r9.MediaBrowserCompat$SearchResultReceiver
            r10.removeCallbacks(r0)
            o.ChequeStatusActivity r10 = r9.MediaMetadataCompat
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r10.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r9.MediaBrowserCompat$ItemReceiver = r10
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ActivateChequeLandingActivity.read(o.ChequeAnnouncementActivity):void");
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver = -1;
        this.MediaMetadataCompat.read(new Throwable("timeout"));
    }
}
