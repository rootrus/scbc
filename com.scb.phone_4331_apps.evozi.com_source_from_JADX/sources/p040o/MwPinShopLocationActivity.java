package p040o;

/* renamed from: o.MwPinShopLocationActivity */
public final class MwPinShopLocationActivity<T> extends BaseNtbInstructionActivity_ViewBinding<T> {
    public final boolean read(Throwable th) {
        onGetStartedClick.write((Object) th, "cause");
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MwPinShopLocationActivity(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        super(hmlPromptPayVerificationActivity, hmlNTBPromptPayNotFoundActivity);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "uCont");
    }
}
