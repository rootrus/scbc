package p040o;

/* renamed from: o.getRtpEBillPaymentReview$MediaBrowserCompat$ItemReceiver */
final class getRtpEBillPaymentReview$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getRtpEBillPaymentReview MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getRtpEBillPaymentReview$MediaBrowserCompat$ItemReceiver(getRtpEBillPaymentReview getrtpebillpaymentreview) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = getrtpebillpaymentreview;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write(str);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
