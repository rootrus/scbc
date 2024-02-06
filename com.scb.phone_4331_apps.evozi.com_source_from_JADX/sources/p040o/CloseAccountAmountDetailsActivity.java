package p040o;

import android.util.Log;
import java.util.List;

/* renamed from: o.CloseAccountAmountDetailsActivity */
public final class CloseAccountAmountDetailsActivity implements CloseAccountSelectionActivity<ChequeAnnouncementActivity> {
    private static ChequeAnnouncementActivity MediaBrowserCompat$ItemReceiver;
    private final CcSofSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;

    public CloseAccountAmountDetailsActivity(CcSofSuccessActivity ccSofSuccessActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ccSofSuccessActivity;
    }

    public final void write() {
    }

    public final void read(List<ChequeAnnouncementActivity> list) {
        onEmailUsClick$MediaBrowserCompat$MediaItem write;
        ChequeAnnouncementActivity chequeAnnouncementActivity = MediaBrowserCompat$ItemReceiver;
        if (list.size() != 0) {
            for (ChequeAnnouncementActivity next : list) {
                if (chequeAnnouncementActivity == null) {
                    chequeAnnouncementActivity = next;
                }
                if (chequeAnnouncementActivity.IconCompatParcelizer.getBoundingBox().width() * chequeAnnouncementActivity.IconCompatParcelizer.getBoundingBox().height() < next.IconCompatParcelizer.getBoundingBox().width() * next.IconCompatParcelizer.getBoundingBox().height() || chequeAnnouncementActivity.IconCompatParcelizer.getTrackingId() == next.IconCompatParcelizer.getTrackingId()) {
                    chequeAnnouncementActivity = next;
                }
            }
            if (MediaBrowserCompat$ItemReceiver == null) {
                MediaBrowserCompat$ItemReceiver = chequeAnnouncementActivity;
            }
            if (MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getTrackingId() != chequeAnnouncementActivity.IconCompatParcelizer.getTrackingId()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
                return;
            }
            MediaBrowserCompat$ItemReceiver = chequeAnnouncementActivity;
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder();
            sb.append("triggered onUpdate with faceId ");
            sb.append(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getTrackingId());
            Log.d(name, sb.toString());
            CcSofSuccessActivity ccSofSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            ChequeAnnouncementActivity chequeAnnouncementActivity2 = MediaBrowserCompat$ItemReceiver;
            if (chequeAnnouncementActivity2 != null) {
                ccSofSuccessActivity.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                String name2 = ccSofSuccessActivity.getClass().getName();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("startChallenge onUpdate");
                sb2.append(ccSofSuccessActivity.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer());
                Log.e(name2, sb2.toString());
                String name3 = ccSofSuccessActivity.getClass().getName();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" isFinishCaptureAutomaticFaceFirst ");
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                sb3.append(false);
                Log.e(name3, sb3.toString());
                String name4 = ccSofSuccessActivity.getClass().getName();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("face.leftEyeOpenProbability() = ");
                sb4.append(chequeAnnouncementActivity2.MediaBrowserCompat$ItemReceiver ? chequeAnnouncementActivity2.IconCompatParcelizer.getRightEyeOpenProbability() : chequeAnnouncementActivity2.IconCompatParcelizer.getLeftEyeOpenProbability());
                Log.d(name4, sb4.toString());
                String name5 = ccSofSuccessActivity.getClass().getName();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("face.rightEyeOpenProbability() = ");
                sb5.append(chequeAnnouncementActivity2.MediaBrowserCompat$ItemReceiver ? chequeAnnouncementActivity2.IconCompatParcelizer.getLeftEyeOpenProbability() : chequeAnnouncementActivity2.IconCompatParcelizer.getRightEyeOpenProbability());
                Log.d(name5, sb5.toString());
                String name6 = ccSofSuccessActivity.getClass().getName();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("face.smilingProbability() = ");
                sb6.append(chequeAnnouncementActivity2.IconCompatParcelizer.getSmilingProbability());
                Log.d(name6, sb6.toString());
                String name7 = ccSofSuccessActivity.getClass().getName();
                StringBuilder sb7 = new StringBuilder();
                sb7.append("face.HeadEulerAngleY() = ");
                sb7.append(((float) chequeAnnouncementActivity2.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity2.IconCompatParcelizer.getHeadEulerAngleY());
                Log.d(name7, sb7.toString());
                String name8 = ccSofSuccessActivity.getClass().getName();
                StringBuilder sb8 = new StringBuilder();
                sb8.append("face.HeadEulerAngleZ() = ");
                sb8.append(((float) chequeAnnouncementActivity2.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity2.IconCompatParcelizer.getHeadEulerAngleZ());
                Log.d(name8, sb8.toString());
                if (ccSofSuccessActivity.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                    String name9 = ccSofSuccessActivity.getClass().getName();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("firstChallenge before click play button ");
                    sb9.append(ccSofSuccessActivity.MediaBrowserCompat$ItemReceiver.read());
                    Log.d(name9, sb9.toString());
                    if (ccSofSuccessActivity.MediaBrowserCompat$ItemReceiver.read() >= 0 && (write = ccSofSuccessActivity.MediaBrowserCompat$ItemReceiver.write()) != null) {
                        write.read(chequeAnnouncementActivity2);
                    }
                }
            }
        } else if (MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
        }
    }
}
