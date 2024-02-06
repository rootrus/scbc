package p040o;

import p040o.TypeAdapters;

/* renamed from: o.TypeAdapters$10$MediaBrowserCompat$SearchResultReceiver */
public final /* synthetic */ class TypeAdapters$10$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    public TypeAdapters$10$MediaBrowserCompat$SearchResultReceiver(TypeAdapters.C388010 r2) {
        super(1, r2);
    }

    public final String getName() {
        return "onError";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(TypeAdapters.C388010.class);
    }

    public final String getSignature() {
        return "onError(Ljava/lang/Throwable;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "p1");
        TypeAdapters.C388010.MediaBrowserCompat$CustomActionResultReceiver((TypeAdapters.C388010) this.receiver, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
