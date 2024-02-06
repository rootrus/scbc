package p040o;

import p040o.LocalProjectProvider;

/* renamed from: o.PolygonOptions */
public final class PolygonOptions extends IndoorBuilding {
    private final LocalProjectProvider.C6940b read;

    @HmlPinActivity
    public PolygonOptions(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C6940b bVar) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = bVar;
    }

    public final DebitCardResetOtpActivity write() {
        return write(this.read.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final DebitCardResetOtpActivity write(putInstance putinstance) {
        return write(this.read.MediaBrowserCompat$ItemReceiver(putinstance));
    }

    public final DebitCardResetOtpActivity write(Interner interner) {
        return write(this.read.MediaBrowserCompat$ItemReceiver(interner));
    }

    public final DebitCardResetOtpActivity read(unsafeComparator unsafecomparator) {
        return write(this.read.MediaBrowserCompat$ItemReceiver(unsafecomparator));
    }
}
