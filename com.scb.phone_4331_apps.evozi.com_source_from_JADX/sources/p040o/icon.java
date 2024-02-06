package p040o;

/* renamed from: o.icon */
public final class icon extends IndoorBuilding {
    public findValueIteratorAndKey MediaBrowserCompat$ItemReceiver;
    public LocalProjectProvider read;

    @HmlPinActivity
    public icon(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, findValueIteratorAndKey findvalueiteratorandkey) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = localProjectProvider;
        this.MediaBrowserCompat$ItemReceiver = findvalueiteratorandkey;
    }

    public final void write(poll poll, int i) {
        if (i == 1) {
            write(this.read.MediaBrowserCompat$CustomActionResultReceiver(poll));
        } else if (i == 2) {
            write(this.read.read(poll));
        } else if (i != 3) {
            write(DebitCardResetOtpActivity.just(new zzuk().read(new zzvj("NO_CHANGE", "NO_CHANGE"))));
        } else {
            write(this.read.IconCompatParcelizer(poll));
        }
    }

    public final DebitCardResetOtpActivity<isInfoWindowShown> MediaBrowserCompat$ItemReceiver(valueIterator valueiterator) {
        return write(this.read.MediaBrowserCompat$CustomActionResultReceiver(valueiterator));
    }
}
