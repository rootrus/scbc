package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.HmlDocumentSubmissionTutorialsActivity */
public abstract class HmlDocumentSubmissionTutorialsActivity extends HmlNTBCropDocumentActivity {
    private final HmlPromptPayVerificationActivity _context;
    private transient HmlNTBPromptPayNotFoundActivity<Object> intercepted;

    public HmlDocumentSubmissionTutorialsActivity(HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity, HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        this._context = hmlPromptPayVerificationActivity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HmlDocumentSubmissionTutorialsActivity(HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity) {
        this(hmlNTBPromptPayNotFoundActivity, hmlNTBPromptPayNotFoundActivity != null ? hmlNTBPromptPayNotFoundActivity.getContext() : null);
    }

    public HmlPromptPayVerificationActivity getContext() {
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = this._context;
        if (hmlPromptPayVerificationActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return hmlPromptPayVerificationActivity;
    }

    public final HmlNTBPromptPayNotFoundActivity<Object> intercepted() {
        HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity = this.intercepted;
        if (hmlNTBPromptPayNotFoundActivity == null) {
            HmlNTBPromptPayNotFoundActivity_ViewBinding hmlNTBPromptPayNotFoundActivity_ViewBinding = (HmlNTBPromptPayNotFoundActivity_ViewBinding) getContext().IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity_ViewBinding.write);
            hmlNTBPromptPayNotFoundActivity = hmlNTBPromptPayNotFoundActivity_ViewBinding != null ? hmlNTBPromptPayNotFoundActivity_ViewBinding.write(this) : this;
            this.intercepted = hmlNTBPromptPayNotFoundActivity;
        }
        return hmlNTBPromptPayNotFoundActivity;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity = this.intercepted;
        if (!(hmlNTBPromptPayNotFoundActivity == null || hmlNTBPromptPayNotFoundActivity == this)) {
            HmlPromptPayVerificationActivity.IconCompatParcelizer IconCompatParcelizer = getContext().IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity_ViewBinding.write);
            if (IconCompatParcelizer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            ((HmlNTBPromptPayNotFoundActivity_ViewBinding) IconCompatParcelizer).MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity);
        }
        this.intercepted = HmlCropDocumentActivity.read;
    }
}
