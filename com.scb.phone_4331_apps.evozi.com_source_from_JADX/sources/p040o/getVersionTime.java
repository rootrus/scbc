package p040o;

import com.scb.phone.view.activity.mediaimage.MediaImagePreviewActivity;

/* renamed from: o.getVersionTime */
public final class getVersionTime implements MileageQuantitySelectionActivity<MediaImagePreviewActivity> {
    public static void read(MediaImagePreviewActivity mediaImagePreviewActivity, getEnvTimeZone getenvtimezone) {
        mediaImagePreviewActivity.mediaImagePresenter = getenvtimezone;
    }
}
