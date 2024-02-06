package p040o;

import p040o.onNextTutorialButtonClick;

/* renamed from: o.onNextTutorialButtonClick$read$MediaBrowserCompat$CustomActionResultReceiver */
final class C7325x64e818a1 extends CheckEligibilityActivity implements FundFactSheetActivity<T, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ FundFactSheetActivity read;
    private /* synthetic */ onNextTutorialButtonClick.read write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7325x64e818a1(onNextTutorialButtonClick.read read2, FundFactSheetActivity fundFactSheetActivity) {
        super(1);
        this.write = read2;
        this.read = fundFactSheetActivity;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver(this.write.IconCompatParcelizer, obj)) {
            this.write.IconCompatParcelizer = obj;
            this.read.invoke(this.write.IconCompatParcelizer);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
