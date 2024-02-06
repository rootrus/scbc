package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.TileProvider */
public final class TileProvider extends IndoorBuilding {
    public final AbstractMultimap.Entries MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public TileProvider(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.Entries entries) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$ItemReceiver = entries;
    }

    public final DebitCardResetOtpActivity<Boolean> read() {
        return write(DebitCardResetOtpActivity.just(Boolean.valueOf(!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver())));
    }
}
