package p040o;

import android.os.Handler;
import android.os.Message;
import p039io.beid.beidk.processor.FaceProcessor;

/* renamed from: o.OrderChequeLandingActivity */
public final class OrderChequeLandingActivity extends ActivateChequeReviewActivity implements onEmailUsClick$MediaBrowserCompat$MediaItem, Runnable {
    private Integer IconCompatParcelizer;
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private Runnable MediaBrowserCompat$SearchResultReceiver;
    private Integer MediaDescriptionCompat;
    private Integer MediaMetadataCompat;
    private Handler RatingCompat;
    ChequeStatusActivity read;
    private Integer write;

    public OrderChequeLandingActivity() {
        this(1, 5000);
    }

    public OrderChequeLandingActivity(Integer num, Integer num2) {
        this.IconCompatParcelizer = FaceProcessor.LivenessActivity.STRAIGHT;
        this.MediaBrowserCompat$ItemReceiver = num;
        this.MediaBrowserCompat$CustomActionResultReceiver = num2;
        this.write = 0;
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat = -1;
    }

    public final Integer IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return "straight";
    }

    public final void read(ChequeStatusActivity chequeStatusActivity) {
        this.read = chequeStatusActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = this;
        Handler handler = new Handler();
        this.RatingCompat = handler;
        handler.postDelayed(this.MediaBrowserCompat$SearchResultReceiver, (long) this.MediaBrowserCompat$CustomActionResultReceiver.intValue());
        this.write = 0;
    }

    public final void read(ChequeAnnouncementActivity chequeAnnouncementActivity) {
        this.MediaDescriptionCompat = Integer.valueOf(this.MediaDescriptionCompat.intValue() + 1);
        if (this.write.intValue() != -1) {
            if ((chequeAnnouncementActivity.MediaBrowserCompat$ItemReceiver ? chequeAnnouncementActivity.IconCompatParcelizer.getRightEyeOpenProbability() : chequeAnnouncementActivity.IconCompatParcelizer.getLeftEyeOpenProbability()) == -1.0f) {
                if ((chequeAnnouncementActivity.MediaBrowserCompat$ItemReceiver ? chequeAnnouncementActivity.IconCompatParcelizer.getLeftEyeOpenProbability() : chequeAnnouncementActivity.IconCompatParcelizer.getRightEyeOpenProbability()) == -1.0f) {
                    return;
                }
            }
            if (this.write.intValue() == 0 && !MediaBrowserCompat$ItemReceiver(chequeAnnouncementActivity).booleanValue() && !write(chequeAnnouncementActivity).booleanValue() && !MediaBrowserCompat$CustomActionResultReceiver(chequeAnnouncementActivity).booleanValue() && !IconCompatParcelizer(chequeAnnouncementActivity).booleanValue()) {
                this.write = 3;
            }
            if (this.write.intValue() == 3) {
                this.write = 0;
                this.MediaMetadataCompat = Integer.valueOf(this.MediaMetadataCompat.intValue() + 1);
            }
            if (this.MediaMetadataCompat.intValue() >= this.MediaBrowserCompat$ItemReceiver.intValue()) {
                this.RatingCompat.removeCallbacks(this.MediaBrowserCompat$SearchResultReceiver);
                this.RatingCompat.postDelayed(new Runnable() {
                    public final void run() {
                        OrderChequeLandingActivity.this.read.MediaBrowserCompat$CustomActionResultReceiver(new Message());
                    }
                }, 1000);
                this.write = -1;
            }
        }
    }

    public final void run() {
        this.write = -1;
        this.read.read(new Throwable("timeout"));
    }
}
