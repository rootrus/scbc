package p040o;

/* renamed from: o.setHelperText */
public final class setHelperText extends IndoorBuilding {
    private PassportExtractActivity read;

    @HmlPinActivity
    public setHelperText(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, PassportExtractActivity passportExtractActivity) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = passportExtractActivity;
    }

    public final DebitCardResetOtpActivity write() {
        return write(this.read.MediaBrowserCompat$ItemReceiver());
    }
}
