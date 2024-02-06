package p040o;

/* renamed from: o.BaseNtbInstructionActivity_ViewBinding */
public class BaseNtbInstructionActivity_ViewBinding<T> extends SmeLoanDetailActivity_ViewBinding<T> implements HmlNTBDocumentSubmissionActivity {
    public final HmlNTBPromptPayNotFoundActivity<T> MediaDescriptionCompat;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo15960x50fd9e4a() {
        return true;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseNtbInstructionActivity_ViewBinding(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        super(hmlPromptPayVerificationActivity, true);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "uCont");
        this.MediaDescriptionCompat = hmlNTBPromptPayNotFoundActivity;
    }

    public final HmlNTBDocumentSubmissionActivity getCallerFrame() {
        return (HmlNTBDocumentSubmissionActivity) this.MediaDescriptionCompat;
    }

    public void read(Object obj) {
        onCreateQRCodeButtonClick.read(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat), AlertController$RecycleListView.write(obj, this.MediaDescriptionCompat));
    }

    public void IconCompatParcelizer(Object obj) {
        HmlNTBPromptPayNotFoundActivity<T> hmlNTBPromptPayNotFoundActivity = this.MediaDescriptionCompat;
        hmlNTBPromptPayNotFoundActivity.resumeWith(AlertController$RecycleListView.write(obj, hmlNTBPromptPayNotFoundActivity));
    }
}
