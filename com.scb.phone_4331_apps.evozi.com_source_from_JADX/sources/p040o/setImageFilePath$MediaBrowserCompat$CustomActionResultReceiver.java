package p040o;

import p040o.CheckExtractActivity_MembersInjector;

/* renamed from: o.setImageFilePath$MediaBrowserCompat$CustomActionResultReceiver */
public final /* synthetic */ class setImageFilePath$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<CheckExtractActivity_MembersInjector.write, HmlVerifyPhoneValidateOtpActivity> {
    public static final setImageFilePath$MediaBrowserCompat$CustomActionResultReceiver write = new setImageFilePath$MediaBrowserCompat$CustomActionResultReceiver();

    setImageFilePath$MediaBrowserCompat$CustomActionResultReceiver() {
        super(1);
    }

    public final String getName() {
        return "hideContent";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(CheckExtractActivity_MembersInjector.write.class);
    }

    public final String getSignature() {
        return "hideContent()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        CheckExtractActivity_MembersInjector.write write2 = (CheckExtractActivity_MembersInjector.write) obj;
        onGetStartedClick.write((Object) write2, "p1");
        write2.IconCompatParcelizer();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
