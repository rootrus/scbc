package p040o;

/* renamed from: o.ActivateChequeReviewActivity */
public abstract class ActivateChequeReviewActivity {
    protected static Boolean MediaBrowserCompat$ItemReceiver(ChequeAnnouncementActivity chequeAnnouncementActivity) {
        return Boolean.valueOf(((float) chequeAnnouncementActivity.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity.IconCompatParcelizer.getHeadEulerAngleZ() >= 12.0f);
    }

    protected static Boolean write(ChequeAnnouncementActivity chequeAnnouncementActivity) {
        return Boolean.valueOf(((float) chequeAnnouncementActivity.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity.IconCompatParcelizer.getHeadEulerAngleZ() <= -12.0f);
    }

    protected static Boolean MediaBrowserCompat$CustomActionResultReceiver(ChequeAnnouncementActivity chequeAnnouncementActivity) {
        return Boolean.valueOf(((float) chequeAnnouncementActivity.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity.IconCompatParcelizer.getHeadEulerAngleY() >= 12.0f && ((float) chequeAnnouncementActivity.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity.IconCompatParcelizer.getHeadEulerAngleY() <= 60.0f);
    }

    protected static Boolean IconCompatParcelizer(ChequeAnnouncementActivity chequeAnnouncementActivity) {
        return Boolean.valueOf(((float) chequeAnnouncementActivity.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity.IconCompatParcelizer.getHeadEulerAngleY() <= -12.0f && ((float) chequeAnnouncementActivity.MediaBrowserCompat$CustomActionResultReceiver) * chequeAnnouncementActivity.IconCompatParcelizer.getHeadEulerAngleY() >= -60.0f);
    }
}
