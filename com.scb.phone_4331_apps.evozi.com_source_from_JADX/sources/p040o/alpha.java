package p040o;

/* renamed from: o.alpha */
public final class alpha extends IndoorBuilding {
    public IdType read;
    public findValueIteratorAndKey write;

    @HmlPinActivity
    public alpha(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, IdType idType, findValueIteratorAndKey findvalueiteratorandkey) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = idType;
        this.write = findvalueiteratorandkey;
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(containsAllImpl containsallimpl) {
        return write(this.read.write(containsallimpl));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver() {
        return write(this.read.write());
    }
}
