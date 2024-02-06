package p040o;

import p040o.access$2300;

/* renamed from: o.nK$MediaSessionCompat$QueueItem */
public final /* synthetic */ class nK$MediaSessionCompat$QueueItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public nK$MediaSessionCompat$QueueItem(C5010nK nKVar) {
        super(1, nKVar);
    }

    public final String getName() {
        return "onVerificationFail";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(C5010nK.class);
    }

    public final String getSignature() {
        return "onVerificationFail(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        ((C5010nK) this.receiver).MediaBrowserCompat$ItemReceiver(((C5010nK) this.receiver).MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
