package p040o;

import android.os.Handler;
import p039io.beid.beidk.processor.FaceProcessor;

/* renamed from: o.StopChequeLandingActivity */
public final class StopChequeLandingActivity extends ActivateChequeReviewActivity implements onEmailUsClick$MediaBrowserCompat$MediaItem, Runnable {
    private Integer IconCompatParcelizer;
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private Runnable MediaBrowserCompat$SearchResultReceiver;
    private Integer MediaDescriptionCompat;
    private ChequeStatusActivity MediaMetadataCompat;
    private Handler RatingCompat;
    private Integer read;
    private Integer write;

    public StopChequeLandingActivity() {
        this(1, 5000);
    }

    public StopChequeLandingActivity(Integer num, Integer num2) {
        this.write = FaceProcessor.LivenessActivity.TILT_HEAD_LEFT;
        this.IconCompatParcelizer = num;
        this.MediaBrowserCompat$ItemReceiver = num2;
        this.read = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.MediaDescriptionCompat = -1;
    }

    public final Integer IconCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return "tilt_head_left";
    }

    public final void read(ChequeStatusActivity chequeStatusActivity) {
        this.MediaMetadataCompat = chequeStatusActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = this;
        Handler handler = new Handler();
        this.RatingCompat = handler;
        handler.postDelayed(this.MediaBrowserCompat$SearchResultReceiver, (long) this.MediaBrowserCompat$ItemReceiver.intValue());
        this.read = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.ChequeAnnouncementActivity r6) {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.MediaDescriptionCompat
            int r0 = r0.intValue()
            r1 = 1
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.MediaDescriptionCompat = r0
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
            r3 = 3
            if (r0 == 0) goto L_0x0067
            r4 = 2
            if (r0 == r1) goto L_0x0058
            if (r0 != r4) goto L_0x0095
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            goto L_0x0093
        L_0x0058:
            java.lang.Boolean r6 = MediaBrowserCompat$ItemReceiver(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0095
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            goto L_0x0093
        L_0x0067:
            java.lang.Boolean r0 = MediaBrowserCompat$ItemReceiver(r6)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0095
            java.lang.Boolean r0 = write(r6)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0095
            java.lang.Boolean r0 = MediaBrowserCompat$CustomActionResultReceiver(r6)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0095
            java.lang.Boolean r6 = IconCompatParcelizer(r6)
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0095
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x0093:
            r5.read = r6
        L_0x0095:
            java.lang.Integer r6 = r5.read
            int r6 = r6.intValue()
            if (r6 != r3) goto L_0x00b1
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.read = r6
            java.lang.Integer r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6.intValue()
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.MediaBrowserCompat$CustomActionResultReceiver = r6
        L_0x00b1:
            java.lang.Integer r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6.intValue()
            java.lang.Integer r0 = r5.IconCompatParcelizer
            int r0 = r0.intValue()
            if (r6 < r0) goto L_0x00d6
            android.os.Handler r6 = r5.RatingCompat
            java.lang.Runnable r0 = r5.MediaBrowserCompat$SearchResultReceiver
            r6.removeCallbacks(r0)
            o.ChequeStatusActivity r6 = r5.MediaMetadataCompat
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r6.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5.read = r6
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.StopChequeLandingActivity.read(o.ChequeAnnouncementActivity):void");
    }

    public final void run() {
        this.read = -1;
        this.MediaMetadataCompat.read(new Throwable("timeout"));
    }
}
