package p040o;

import android.content.Context;
import com.scb.phone.R;
import com.scb.phone.view.activity.mediaimage.MediaImagePreviewActivity;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.initFaceDetector */
public final class initFaceDetector {
    /* access modifiers changed from: private */
    public static final String[] write = {"android.permission.READ_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(MediaImagePreviewActivity mediaImagePreviewActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(mediaImagePreviewActivity, write)) {
            mediaImagePreviewActivity.MediaSessionCompat$ResultReceiverWrapper();
        } else if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(mediaImagePreviewActivity, write)) {
            initFaceDetector$MediaBrowserCompat$ItemReceiver initfacedetector_mediabrowsercompat_itemreceiver = new initFaceDetector$MediaBrowserCompat$ItemReceiver(mediaImagePreviewActivity, (byte) 0);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) mediaImagePreviewActivity);
            String string = IconCompatParcelizer.read.getString(R.string.permission_storage_title);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer.mTitleTextView.setVisibility(0);
                IconCompatParcelizer.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer.read.getString(R.string.permission_storage);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer.mTextTextView.setVisibility(0);
                IconCompatParcelizer.mTextTextView.setText(string2);
            }
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new PaFaceDetectorManager(initfacedetector_mediabrowsercompat_itemreceiver));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new getCameraOri(initfacedetector_mediabrowsercompat_itemreceiver)).show();
        } else {
            AppCompatRatingBar.write(mediaImagePreviewActivity, write, 33);
        }
    }

    public static void write(MediaImagePreviewActivity mediaImagePreviewActivity, int i, int[] iArr) {
        if (i != 33) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            mediaImagePreviewActivity.MediaSessionCompat$ResultReceiverWrapper();
        } else if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(mediaImagePreviewActivity, write)) {
            MediaImagePreviewActivity.MediaSessionCompat$QueueItem();
        } else {
            MediaImagePreviewActivity.m2958x50fd9e4a();
        }
    }
}
