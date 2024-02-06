package p040o;

import android.os.Handler;
import p039io.beid.beidk.processor.FaceProcessor;

/* renamed from: o.ChequeStatusActivity_ViewBinding */
public final class ChequeStatusActivity_ViewBinding extends ActivateChequeReviewActivity implements onEmailUsClick$MediaBrowserCompat$MediaItem, Runnable {
    private Integer IconCompatParcelizer;
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private Runnable MediaBrowserCompat$SearchResultReceiver;
    private ChequeStatusActivity MediaDescriptionCompat;
    private Handler MediaMetadataCompat;
    private Integer RatingCompat;
    private Integer read;
    private Integer write;

    public ChequeStatusActivity_ViewBinding() {
        this(1, 5000);
    }

    public ChequeStatusActivity_ViewBinding(Integer num, Integer num2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = FaceProcessor.LivenessActivity.SMILE;
        this.read = num;
        this.MediaBrowserCompat$ItemReceiver = num2;
        this.IconCompatParcelizer = 0;
        this.write = 0;
        this.RatingCompat = -1;
    }

    public final Integer IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String read() {
        return "smile_with_teeth";
    }

    public final void read(ChequeStatusActivity chequeStatusActivity) {
        this.MediaDescriptionCompat = chequeStatusActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = this;
        Handler handler = new Handler();
        this.MediaMetadataCompat = handler;
        handler.postDelayed(this.MediaBrowserCompat$SearchResultReceiver, (long) this.MediaBrowserCompat$ItemReceiver.intValue());
        this.IconCompatParcelizer = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
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
            java.lang.Integer r0 = r9.IconCompatParcelizer
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
            java.lang.Integer r0 = r9.IconCompatParcelizer
            int r0 = r0.intValue()
            r3 = 3
            r4 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            if (r0 == 0) goto L_0x006d
            r6 = 2
            if (r0 == r1) goto L_0x005d
            if (r0 != r6) goto L_0x007e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            goto L_0x007c
        L_0x005d:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r10 = r10.IconCompatParcelizer
            float r10 = r10.getSmilingProbability()
            double r7 = (double) r10
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x007e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            goto L_0x007c
        L_0x006d:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r10 = r10.IconCompatParcelizer
            float r10 = r10.getSmilingProbability()
            double r6 = (double) r10
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x007e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
        L_0x007c:
            r9.IconCompatParcelizer = r10
        L_0x007e:
            java.lang.Integer r10 = r9.IconCompatParcelizer
            int r10 = r10.intValue()
            if (r10 != r3) goto L_0x009a
            r10 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.IconCompatParcelizer = r10
            java.lang.Integer r10 = r9.write
            int r10 = r10.intValue()
            int r10 = r10 + r1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.write = r10
        L_0x009a:
            java.lang.Integer r10 = r9.write
            int r10 = r10.intValue()
            java.lang.Integer r0 = r9.read
            int r0 = r0.intValue()
            if (r10 < r0) goto L_0x00bf
            android.os.Handler r10 = r9.MediaMetadataCompat
            java.lang.Runnable r0 = r9.MediaBrowserCompat$SearchResultReceiver
            r10.removeCallbacks(r0)
            o.ChequeStatusActivity r10 = r9.MediaDescriptionCompat
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r10.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r9.IconCompatParcelizer = r10
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ChequeStatusActivity_ViewBinding.read(o.ChequeAnnouncementActivity):void");
    }

    public final void run() {
        this.IconCompatParcelizer = -1;
        this.MediaDescriptionCompat.read(new Throwable("timeout"));
    }
}
