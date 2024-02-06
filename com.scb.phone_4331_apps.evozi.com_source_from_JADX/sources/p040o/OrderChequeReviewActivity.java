package p040o;

import android.os.Handler;
import p039io.beid.beidk.processor.FaceProcessor;

/* renamed from: o.OrderChequeReviewActivity */
public final class OrderChequeReviewActivity extends ActivateChequeReviewActivity implements onEmailUsClick$MediaBrowserCompat$MediaItem, Runnable {
    private Integer IconCompatParcelizer;
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private Runnable MediaBrowserCompat$SearchResultReceiver;
    private Handler MediaDescriptionCompat;
    private Integer MediaMetadataCompat;
    private ChequeStatusActivity RatingCompat;
    private Integer read;
    private Integer write;

    public OrderChequeReviewActivity() {
        this(1, 5000);
    }

    public OrderChequeReviewActivity(Integer num, Integer num2) {
        this.IconCompatParcelizer = FaceProcessor.LivenessActivity.TURN_FACE_RIGHT;
        this.write = num;
        this.MediaBrowserCompat$ItemReceiver = num2;
        this.read = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.MediaMetadataCompat = -1;
    }

    public final Integer IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return "turn_head_right";
    }

    public final void read(ChequeStatusActivity chequeStatusActivity) {
        this.RatingCompat = chequeStatusActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = this;
        Handler handler = new Handler();
        this.MediaDescriptionCompat = handler;
        handler.postDelayed(this.MediaBrowserCompat$SearchResultReceiver, (long) this.MediaBrowserCompat$ItemReceiver.intValue());
        this.read = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.ChequeAnnouncementActivity r6) {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.MediaMetadataCompat
            int r0 = r0.intValue()
            r1 = 1
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.MediaMetadataCompat = r0
            java.lang.Integer r0 = r5.read
            int r0 = r0.intValue()
            r2 = -1
            if (r0 != r2) goto L_0x0018
            return
        L_0x0018:
            boolean r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0023
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r6.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x0029
        L_0x0023:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r6.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x0029:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            boolean r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x003a
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r6.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
            goto L_0x0040
        L_0x003a:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r6.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
        L_0x0040:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.Integer r0 = r5.read
            int r0 = r0.intValue()
            r3 = 2
            r4 = 3
            if (r0 == 0) goto L_0x0058
            if (r0 == r1) goto L_0x0058
            if (r0 != r3) goto L_0x0068
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            goto L_0x0066
        L_0x0058:
            java.lang.Boolean r6 = IconCompatParcelizer(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0068
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
        L_0x0066:
            r5.read = r6
        L_0x0068:
            java.lang.Integer r6 = r5.read
            int r6 = r6.intValue()
            if (r6 != r4) goto L_0x0084
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.read = r6
            java.lang.Integer r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6.intValue()
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.MediaBrowserCompat$CustomActionResultReceiver = r6
        L_0x0084:
            java.lang.Integer r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6.intValue()
            java.lang.Integer r0 = r5.write
            int r0 = r0.intValue()
            if (r6 < r0) goto L_0x00a9
            android.os.Handler r6 = r5.MediaDescriptionCompat
            java.lang.Runnable r0 = r5.MediaBrowserCompat$SearchResultReceiver
            r6.removeCallbacks(r0)
            o.ChequeStatusActivity r6 = r5.RatingCompat
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r6.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5.read = r6
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.OrderChequeReviewActivity.read(o.ChequeAnnouncementActivity):void");
    }

    public final void run() {
        this.read = -1;
        this.RatingCompat.read(new Throwable("timeout"));
    }
}
