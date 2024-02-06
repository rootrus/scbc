package p040o;

/* renamed from: o.setFormat$MediaBrowserCompat$MediaItem */
final class setFormat$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<ExceptionResponseImpl, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ boolean IconCompatParcelizer;
    private /* synthetic */ setFormat read;
    private /* synthetic */ String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    setFormat$MediaBrowserCompat$MediaItem(setFormat setformat, String str, boolean z) {
        super(1);
        this.read = setformat;
        this.write = str;
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ExceptionResponseImpl exceptionResponseImpl = (ExceptionResponseImpl) obj;
        onGetStartedClick.write((Object) exceptionResponseImpl, "$receiver");
        exceptionResponseImpl.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$SearchResultReceiver);
        exceptionResponseImpl.read(this.write, this.read.MediaBrowserCompat$MediaItem, this.IconCompatParcelizer ? "history" : "manual");
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
