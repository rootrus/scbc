package p040o;

import p040o.getFirstName;

/* renamed from: o.modifyString$MediaBrowserCompat$CustomActionResultReceiver */
public final /* synthetic */ class modifyString$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getFirstName.IconCompatParcelizer, HmlVerifyPhoneValidateOtpActivity> {
    public static final modifyString$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new modifyString$MediaBrowserCompat$CustomActionResultReceiver();

    modifyString$MediaBrowserCompat$CustomActionResultReceiver() {
        super(1);
    }

    public final String getName() {
        return "showTimeExpired";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(getFirstName.IconCompatParcelizer.class);
    }

    public final String getSignature() {
        return "showTimeExpired()V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
        onGetStartedClick.write((Object) iconCompatParcelizer, "p1");
        iconCompatParcelizer.RatingCompat();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
