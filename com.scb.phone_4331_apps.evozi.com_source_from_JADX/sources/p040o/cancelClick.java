package p040o;

/* renamed from: o.cancelClick */
public class cancelClick extends SmeLoanDetailActivity_ViewBinding<HmlVerifyPhoneValidateOtpActivity> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cancelClick(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, boolean z) {
        super(hmlPromptPayVerificationActivity, z);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "parentContext");
    }

    /* access modifiers changed from: protected */
    public final boolean IconCompatParcelizer(Throwable th) {
        onGetStartedClick.write((Object) th, "exception");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(getContext(), th);
        return true;
    }
}
