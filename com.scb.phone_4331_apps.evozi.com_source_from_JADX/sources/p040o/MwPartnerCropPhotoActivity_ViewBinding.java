package p040o;

/* renamed from: o.MwPartnerCropPhotoActivity_ViewBinding */
final class MwPartnerCropPhotoActivity_ViewBinding<T, R> extends MwManageWalletActivity_ViewBinding<onDoneNicknameClick> {
    private final BaseDiscoverFundFilterActivity<T, HmlNTBPromptPayNotFoundActivity<? super R>, Object> MediaBrowserCompat$CustomActionResultReceiver;
    private final OccupationSearchActivity<R> write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MwPartnerCropPhotoActivity_ViewBinding(onDoneNicknameClick ondonenicknameclick, OccupationSearchActivity<? super R> occupationSearchActivity, BaseDiscoverFundFilterActivity<? super T, ? super HmlNTBPromptPayNotFoundActivity<? super R>, ? extends Object> baseDiscoverFundFilterActivity) {
        super(ondonenicknameclick);
        onGetStartedClick.write((Object) ondonenicknameclick, "job");
        onGetStartedClick.write((Object) occupationSearchActivity, "select");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        this.write = occupationSearchActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverFundFilterActivity;
    }

    public final void IconCompatParcelizer(Throwable th) {
        if (this.write.read()) {
            ((onDoneNicknameClick) this.IconCompatParcelizer).write(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectAwaitOnCompletion[");
        sb.append(this.write);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        if (this.write.read()) {
            ((onDoneNicknameClick) this.IconCompatParcelizer).write(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
