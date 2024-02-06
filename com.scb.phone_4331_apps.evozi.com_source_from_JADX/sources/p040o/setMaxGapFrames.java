package p040o;

import p040o.CustomConcurrentHashMap;
import p040o.LocalProjectProvider;

/* renamed from: o.setMaxGapFrames */
public final class setMaxGapFrames extends IndoorBuilding {
    private LocalProjectProvider.C69375 MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public setMaxGapFrames(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    public final void MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.Segment segment, boolean z, boolean z2) {
        if (!z) {
            write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(segment));
        } else if (z2) {
            write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(segment));
        } else {
            write(this.MediaBrowserCompat$ItemReceiver.read(segment));
        }
    }

    public final void IconCompatParcelizer(CustomConcurrentHashMap.Segment segment) {
        write(this.MediaBrowserCompat$ItemReceiver.write(segment));
    }

    public final void IconCompatParcelizer(getPreviousEvictable getpreviousevictable) {
        write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(getpreviousevictable));
    }
}
