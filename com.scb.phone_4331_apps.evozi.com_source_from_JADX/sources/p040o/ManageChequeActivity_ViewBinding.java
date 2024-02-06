package p040o;

import android.os.Handler;
import p039io.beid.beidk.processor.FaceProcessor;

/* renamed from: o.ManageChequeActivity_ViewBinding */
public final class ManageChequeActivity_ViewBinding extends ActivateChequeReviewActivity implements onEmailUsClick$MediaBrowserCompat$MediaItem, Runnable {
    private Integer IconCompatParcelizer;
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private Runnable MediaBrowserCompat$SearchResultReceiver;
    private Integer MediaDescriptionCompat;
    private ChequeStatusActivity MediaMetadataCompat;
    private Handler RatingCompat;
    private Integer read;
    private Integer write;

    public ManageChequeActivity_ViewBinding() {
        this(1, 5000);
    }

    public ManageChequeActivity_ViewBinding(Integer num, Integer num2) {
        this.read = FaceProcessor.LivenessActivity.BLINK;
        this.write = num;
        this.MediaBrowserCompat$CustomActionResultReceiver = num2;
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.IconCompatParcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public final Integer IconCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return "blink";
    }

    public final void read(ChequeStatusActivity chequeStatusActivity) {
        this.MediaMetadataCompat = chequeStatusActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = this;
        Handler handler = new Handler();
        this.RatingCompat = handler;
        handler.postDelayed(this.MediaBrowserCompat$SearchResultReceiver, (long) this.MediaBrowserCompat$CustomActionResultReceiver.intValue());
        this.MediaBrowserCompat$ItemReceiver = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.ChequeAnnouncementActivity r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "state = "
            r0.append(r1)
            java.lang.Integer r1 = r9.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Blink: "
            android.util.Log.i(r1, r0)
            java.lang.Integer r0 = r9.MediaDescriptionCompat
            int r0 = r0.intValue()
            r1 = 1
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.MediaDescriptionCompat = r0
            java.lang.Integer r0 = r9.MediaBrowserCompat$ItemReceiver
            int r0 = r0.intValue()
            r2 = -1
            if (r0 != r2) goto L_0x0034
            return
        L_0x0034:
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x003f
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x0045
        L_0x003f:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x0045:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0056
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
            goto L_0x005c
        L_0x0056:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
        L_0x005c:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            return
        L_0x0061:
            java.lang.Integer r0 = r9.MediaBrowserCompat$ItemReceiver
            int r0 = r0.intValue()
            r3 = 3
            r4 = 4605831338911806259(0x3feb333333333333, double:0.85)
            if (r0 == 0) goto L_0x00d7
            r6 = 2
            if (r0 == r1) goto L_0x00a3
            if (r0 != r6) goto L_0x0107
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x007f
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x0085
        L_0x007f:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x0085:
            double r6 = (double) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0107
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            com.google.firebase.ml.vision.face.FirebaseVisionFace r10 = r10.IconCompatParcelizer
            if (r0 == 0) goto L_0x0095
            float r10 = r10.getLeftEyeOpenProbability()
            goto L_0x0099
        L_0x0095:
            float r10 = r10.getRightEyeOpenProbability()
        L_0x0099:
            double r6 = (double) r10
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0107
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            goto L_0x0105
        L_0x00a3:
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x00ae
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x00b4
        L_0x00ae:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x00b4:
            double r4 = (double) r0
            r7 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0107
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            com.google.firebase.ml.vision.face.FirebaseVisionFace r10 = r10.IconCompatParcelizer
            if (r0 == 0) goto L_0x00c9
            float r10 = r10.getLeftEyeOpenProbability()
            goto L_0x00cd
        L_0x00c9:
            float r10 = r10.getRightEyeOpenProbability()
        L_0x00cd:
            double r4 = (double) r10
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x0107
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            goto L_0x0105
        L_0x00d7:
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x00e2
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getRightEyeOpenProbability()
            goto L_0x00e8
        L_0x00e2:
            com.google.firebase.ml.vision.face.FirebaseVisionFace r0 = r10.IconCompatParcelizer
            float r0 = r0.getLeftEyeOpenProbability()
        L_0x00e8:
            double r6 = (double) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0107
            boolean r0 = r10.MediaBrowserCompat$ItemReceiver
            com.google.firebase.ml.vision.face.FirebaseVisionFace r10 = r10.IconCompatParcelizer
            if (r0 == 0) goto L_0x00f8
            float r10 = r10.getLeftEyeOpenProbability()
            goto L_0x00fc
        L_0x00f8:
            float r10 = r10.getRightEyeOpenProbability()
        L_0x00fc:
            double r6 = (double) r10
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0107
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
        L_0x0105:
            r9.MediaBrowserCompat$ItemReceiver = r10
        L_0x0107:
            java.lang.Integer r10 = r9.MediaBrowserCompat$ItemReceiver
            int r10 = r10.intValue()
            if (r10 != r3) goto L_0x0123
            r10 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.MediaBrowserCompat$ItemReceiver = r10
            java.lang.Integer r10 = r9.IconCompatParcelizer
            int r10 = r10.intValue()
            int r10 = r10 + r1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.IconCompatParcelizer = r10
        L_0x0123:
            java.lang.Integer r10 = r9.IconCompatParcelizer
            int r10 = r10.intValue()
            java.lang.Integer r0 = r9.write
            int r0 = r0.intValue()
            if (r10 < r0) goto L_0x0148
            android.os.Handler r10 = r9.RatingCompat
            java.lang.Runnable r0 = r9.MediaBrowserCompat$SearchResultReceiver
            r10.removeCallbacks(r0)
            o.ChequeStatusActivity r10 = r9.MediaMetadataCompat
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            r10.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r9.MediaBrowserCompat$ItemReceiver = r10
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ManageChequeActivity_ViewBinding.read(o.ChequeAnnouncementActivity):void");
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver = -1;
        this.MediaMetadataCompat.read(new Throwable("timeout"));
    }
}
