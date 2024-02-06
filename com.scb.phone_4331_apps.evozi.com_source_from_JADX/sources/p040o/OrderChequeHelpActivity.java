package p040o;

import android.os.Handler;
import p039io.beid.beidk.processor.FaceProcessor;

/* renamed from: o.OrderChequeHelpActivity */
public final class OrderChequeHelpActivity extends ActivateChequeReviewActivity implements onEmailUsClick$MediaBrowserCompat$MediaItem, Runnable {
    private Integer IconCompatParcelizer;
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private ChequeStatusActivity MediaBrowserCompat$MediaItem;
    private Handler MediaBrowserCompat$SearchResultReceiver;
    private Runnable MediaDescriptionCompat;
    private Integer MediaMetadataCompat;
    private Integer read;
    private Integer write;

    public OrderChequeHelpActivity() {
        this(1, 5000);
    }

    public OrderChequeHelpActivity(Integer num, Integer num2) {
        this.read = FaceProcessor.LivenessActivity.CLOSE_LEFT_EYE;
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
        this.MediaBrowserCompat$ItemReceiver = num2;
        this.write = 0;
        this.IconCompatParcelizer = 0;
        this.MediaMetadataCompat = -1;
    }

    public final Integer IconCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return "close_left_eye";
    }

    public final void read(ChequeStatusActivity chequeStatusActivity) {
        this.MediaBrowserCompat$MediaItem = chequeStatusActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaDescriptionCompat = this;
        Handler handler = new Handler();
        this.MediaBrowserCompat$SearchResultReceiver = handler;
        handler.postDelayed(this.MediaDescriptionCompat, (long) this.MediaBrowserCompat$ItemReceiver.intValue());
        this.write = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.ChequeAnnouncementActivity r12) {
        /*
            r11 = this;
            java.lang.Integer r0 = r11.MediaMetadataCompat
            int r0 = r0.intValue()
            r1 = 1
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.MediaMetadataCompat = r0
            java.lang.Integer r0 = r11.write
            int r0 = r0.intValue()
            r2 = -1
            if (r0 != r2) goto L_0x0018
            return
        L_0x0018:
            boolean r0 = r12.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0023
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x0029
        L_0x0023:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x0029:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            boolean r0 = r12.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x003a
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
            goto L_0x0040
        L_0x003a:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
        L_0x0040:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.Integer r0 = r11.write
            int r0 = r0.intValue()
            r3 = 3
            r4 = 4605831338911806259(0x3feb333333333333, double:0.85)
            if (r0 == 0) goto L_0x0091
            r6 = 2
            if (r0 == r1) goto L_0x005d
            if (r0 != r6) goto L_0x00c1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            goto L_0x00bf
        L_0x005d:
            boolean r0 = r12.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0068
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x006e
        L_0x0068:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x006e:
            double r7 = (double) r0
            r9 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            boolean r0 = r12.MediaBrowserCompat$ItemReceiver
            com.google.firebase.ml.vision.face.FirebaseVisionFace r12 = r12.IconCompatParcelizer
            if (r0 == 0) goto L_0x0083
            float r12 = r12.getLeftEyeOpenProbability()
            goto L_0x0087
        L_0x0083:
            float r12 = r12.getRightEyeOpenProbability()
        L_0x0087:
            double r7 = (double) r12
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            goto L_0x00bf
        L_0x0091:
            boolean r0 = r12.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x009c
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x00a2
        L_0x009c:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r12.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x00a2:
            double r6 = (double) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            boolean r0 = r12.MediaBrowserCompat$ItemReceiver
            com.google.firebase.ml.vision.face.FirebaseVisionFace r12 = r12.IconCompatParcelizer
            if (r0 == 0) goto L_0x00b2
            float r12 = r12.getLeftEyeOpenProbability()
            goto L_0x00b6
        L_0x00b2:
            float r12 = r12.getRightEyeOpenProbability()
        L_0x00b6:
            double r6 = (double) r12
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
        L_0x00bf:
            r11.write = r12
        L_0x00c1:
            java.lang.Integer r12 = r11.write
            int r12 = r12.intValue()
            if (r12 != r3) goto L_0x00dd
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.write = r12
            java.lang.Integer r12 = r11.IconCompatParcelizer
            int r12 = r12.intValue()
            int r12 = r12 + r1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.IconCompatParcelizer = r12
        L_0x00dd:
            java.lang.Integer r12 = r11.IconCompatParcelizer
            int r12 = r12.intValue()
            java.lang.Integer r0 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.intValue()
            if (r12 < r0) goto L_0x0102
            android.os.Handler r12 = r11.MediaBrowserCompat$SearchResultReceiver
            java.lang.Runnable r0 = r11.MediaDescriptionCompat
            r12.removeCallbacks(r0)
            o.ChequeStatusActivity r12 = r11.MediaBrowserCompat$MediaItem
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r12.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r11.write = r12
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.OrderChequeHelpActivity.read(o.ChequeAnnouncementActivity):void");
    }

    public final void run() {
        this.write = -1;
        this.MediaBrowserCompat$MediaItem.read(new Throwable("timeout"));
    }
}
