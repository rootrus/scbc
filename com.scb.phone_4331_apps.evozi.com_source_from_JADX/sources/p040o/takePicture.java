package p040o;

import p040o.LocalProjectProvider;

@HmlSetNTBPinActivity
/* renamed from: o.takePicture */
public final class takePicture extends IndoorBuilding {
    private getFrontException read;
    private final LocalProjectProvider.C69375 write;

    @HmlPinActivity
    public takePicture(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3, getFrontException getfrontexception) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.write = r3;
        this.read = getfrontexception;
    }

    public final void read(copyEvictableEntry copyevictableentry) {
        write(this.write.read(copyevictableentry));
    }

    public final void IconCompatParcelizer(copyEvictableEntry copyevictableentry) {
        write(this.write.MediaBrowserCompat$ItemReceiver(copyevictableentry));
    }

    public final boolean write() {
        if (this.read.write() == null || this.read.write().MediaSessionCompat$ResultReceiverWrapper == null) {
            return false;
        }
        return this.read.write().MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver;
    }
}
