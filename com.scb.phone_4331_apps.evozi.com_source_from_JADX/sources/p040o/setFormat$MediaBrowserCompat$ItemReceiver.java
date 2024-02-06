package p040o;

/* renamed from: o.setFormat$MediaBrowserCompat$ItemReceiver */
final class setFormat$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<ExceptionResponseImpl, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setFormat IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    setFormat$MediaBrowserCompat$ItemReceiver(setFormat setformat) {
        super(1);
        this.IconCompatParcelizer = setformat;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ExceptionResponseImpl exceptionResponseImpl = (ExceptionResponseImpl) obj;
        onGetStartedClick.write((Object) exceptionResponseImpl, "$receiver");
        exceptionResponseImpl.write(this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
