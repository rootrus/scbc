package p040o;

/* renamed from: o.onClearNicknameClick */
public final class onClearNicknameClick<T> extends MwCoachMarkActivity<T> {
    private final HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onClearNicknameClick(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, BaseDiscoverFundFilterActivity<? super MwCasaOtpActivity, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity) {
        super(hmlPromptPayVerificationActivity, false);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "parentContext");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        this.MediaBrowserCompat$CustomActionResultReceiver = HmlDocumentSubmissionActivity.read(baseDiscoverFundFilterActivity, this, this);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$MediaItem() {
        AlertController$RecycleListView.IconCompatParcelizer((HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>) this.MediaBrowserCompat$CustomActionResultReceiver, (HmlNTBPromptPayNotFoundActivity<?>) this);
    }
}
