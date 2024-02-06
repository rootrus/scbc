package p040o;

/* renamed from: o.getRtpEBillPaymentReview$MediaBrowserCompat$MediaItem */
final class getRtpEBillPaymentReview$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getRtpEBillPaymentReview read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getRtpEBillPaymentReview$MediaBrowserCompat$MediaItem(getRtpEBillPaymentReview getrtpebillpaymentreview) {
        super(1);
        this.read = getrtpebillpaymentreview;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(((Boolean) obj).booleanValue());
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
