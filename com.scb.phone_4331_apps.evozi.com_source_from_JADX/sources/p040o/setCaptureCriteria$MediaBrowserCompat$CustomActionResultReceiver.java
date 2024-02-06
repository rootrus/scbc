package p040o;

import p040o.access$2300;

/* renamed from: o.setCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver */
public final /* synthetic */ class setCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public setCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver(setCaptureCriteria setcapturecriteria) {
        super(1, setcapturecriteria);
    }

    public final String getName() {
        return "showErrorDialog";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(setCaptureCriteria.class);
    }

    public final String getSignature() {
        return "showErrorDialog(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ((setCaptureCriteria) this.receiver).MediaBrowserCompat$ItemReceiver(((setCaptureCriteria) this.receiver).MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
