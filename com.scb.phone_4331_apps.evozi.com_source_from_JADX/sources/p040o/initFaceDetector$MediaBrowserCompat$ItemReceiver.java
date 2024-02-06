package p040o;

import com.scb.phone.view.activity.mediaimage.MediaImagePreviewActivity;
import java.lang.ref.WeakReference;

/* renamed from: o.initFaceDetector$MediaBrowserCompat$ItemReceiver */
final class initFaceDetector$MediaBrowserCompat$ItemReceiver implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
    private final WeakReference<MediaImagePreviewActivity> MediaBrowserCompat$ItemReceiver;

    /* synthetic */ initFaceDetector$MediaBrowserCompat$ItemReceiver(MediaImagePreviewActivity mediaImagePreviewActivity, byte b) {
        this(mediaImagePreviewActivity);
    }

    private initFaceDetector$MediaBrowserCompat$ItemReceiver(MediaImagePreviewActivity mediaImagePreviewActivity) {
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(mediaImagePreviewActivity);
    }

    public final void write() {
        MediaImagePreviewActivity mediaImagePreviewActivity = this.MediaBrowserCompat$ItemReceiver.get();
        if (mediaImagePreviewActivity != null) {
            AppCompatRatingBar.write(mediaImagePreviewActivity, initFaceDetector.write, 33);
        }
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver.get() != null) {
            MediaImagePreviewActivity.m2958x50fd9e4a();
        }
    }
}
