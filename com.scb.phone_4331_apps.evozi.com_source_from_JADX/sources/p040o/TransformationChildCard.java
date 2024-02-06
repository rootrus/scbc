package p040o;

/* renamed from: o.TransformationChildCard */
public final class TransformationChildCard extends IndoorBuilding {
    private IIdImageProcessingListener write;

    @HmlPinActivity
    public TransformationChildCard(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IIdImageProcessingListener iIdImageProcessingListener) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.write = iIdImageProcessingListener;
    }

    public final void write(inferValueType infervaluetype) {
        DebitCardResetOtpActivity debitCardResetOtpActivity;
        DebitCardCoachMarkActivity write2 = this.write.write(infervaluetype);
        if (write2 instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
            debitCardResetOtpActivity = ((HmlLatestLoanOfferStatusDeepLinkActivity) write2).MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            debitCardResetOtpActivity = new RtpInputDeepLinkActivity(write2);
        }
        write(debitCardResetOtpActivity);
    }
}
