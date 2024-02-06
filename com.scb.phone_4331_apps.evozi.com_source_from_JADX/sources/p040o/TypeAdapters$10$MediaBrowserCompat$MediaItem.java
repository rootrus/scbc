package p040o;

import p040o.TypeAdapters;

/* renamed from: o.TypeAdapters$10$MediaBrowserCompat$MediaItem */
public final /* synthetic */ class TypeAdapters$10$MediaBrowserCompat$MediaItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<standardStartAndWait, HmlVerifyPhoneValidateOtpActivity> {
    public TypeAdapters$10$MediaBrowserCompat$MediaItem(TypeAdapters.C388010 r2) {
        super(1, r2);
    }

    public final String getName() {
        return "onSuccess";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(TypeAdapters.C388010.class);
    }

    public final String getSignature() {
        return "onSuccess(Lcom/scb/phone/presentation/model/display/SuccessfulDisplay;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        standardStartAndWait standardstartandwait = (standardStartAndWait) obj;
        onGetStartedClick.write((Object) standardstartandwait, "p1");
        TypeAdapters.C388010.IconCompatParcelizer((TypeAdapters.C388010) this.receiver, standardstartandwait);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
