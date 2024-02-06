package p040o;

/* renamed from: o.DocumentBaseOverlayView$MediaBrowserCompat$SearchResultReceiver */
public final /* synthetic */ class DocumentBaseOverlayView$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public DocumentBaseOverlayView$MediaBrowserCompat$SearchResultReceiver(DocumentBaseOverlayView documentBaseOverlayView) {
        super(1, documentBaseOverlayView);
    }

    public final String getName() {
        return "onSendOtaError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(DocumentBaseOverlayView.class);
    }

    public final String getSignature() {
        return "onSendOtaError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        DocumentBaseOverlayView.IconCompatParcelizer((DocumentBaseOverlayView) this.receiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
