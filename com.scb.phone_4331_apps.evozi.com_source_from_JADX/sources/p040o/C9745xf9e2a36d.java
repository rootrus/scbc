package p040o;

import p040o.access$2300;

/* renamed from: o.FixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$SearchResultReceiver */
public final /* synthetic */ class C9745xf9e2a36d extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public C9745xf9e2a36d(FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector) {
        super(1, fixedAspectRatioCaptureExperience_MembersInjector);
    }

    public final String getName() {
        return "onRequestFormError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(FixedAspectRatioCaptureExperience_MembersInjector.class);
    }

    public final String getSignature() {
        return "onRequestFormError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        ((FixedAspectRatioCaptureExperience_MembersInjector) this.receiver).MediaBrowserCompat$ItemReceiver(((FixedAspectRatioCaptureExperience_MembersInjector) this.receiver).MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
