package p040o;

import com.scb.phone.view.activity.mwpartner.MwPartnerCropPhotoActivity;

/* renamed from: o.isInstanceOfView */
public final class isInstanceOfView {
    private static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(mwPartnerCropPhotoActivity, write)) {
            mwPartnerCropPhotoActivity.mo14870x50fd9e4a();
        } else {
            AppCompatRatingBar.write(mwPartnerCropPhotoActivity, write, 36);
        }
    }

    public static void read(MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity, int i, int[] iArr) {
        if (i != 36) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            mwPartnerCropPhotoActivity.mo14870x50fd9e4a();
        } else if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(mwPartnerCropPhotoActivity, write)) {
            MwPartnerCropPhotoActivity.MediaSessionCompat$Token();
        } else {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
            mwPartnerCropPhotoActivity.finish();
        }
    }
}
