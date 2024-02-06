package p040o;

/* renamed from: o.getRtpEBillPaymentReview$MediaBrowserCompat$SearchResultReceiver */
final class getRtpEBillPaymentReview$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getRtpEBillPaymentReview read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getRtpEBillPaymentReview$MediaBrowserCompat$SearchResultReceiver(getRtpEBillPaymentReview getrtpebillpaymentreview) {
        super(1);
        this.read = getrtpebillpaymentreview;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(str);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
