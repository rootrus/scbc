package p040o;

/* renamed from: o.PreJava9ReflectionAccessor$MediaBrowserCompat$MediaItem */
public final /* synthetic */ class PreJava9ReflectionAccessor$MediaBrowserCompat$MediaItem extends InvestmentFundDetailsActivity implements FundFactSheetActivity<EventBus, HmlVerifyPhoneValidateOtpActivity> {
    public PreJava9ReflectionAccessor$MediaBrowserCompat$MediaItem(PreJava9ReflectionAccessor preJava9ReflectionAccessor) {
        super(1, preJava9ReflectionAccessor);
    }

    public final String getName() {
        return "onSuccessPostInquiry";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(PreJava9ReflectionAccessor.class);
    }

    public final String getSignature() {
        return "onSuccessPostInquiry(Lcom/scb/phone/presentation/model/display/csent/SensitiveConsentDisplay;)V";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        EventBus eventBus = (EventBus) obj;
        onGetStartedClick.write((Object) eventBus, "p1");
        PreJava9ReflectionAccessor.read((PreJava9ReflectionAccessor) this.receiver, eventBus);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
