package p040o;

/* renamed from: o.onAddWalletClick */
public final class onAddWalletClick extends MwManageWalletActivity_ViewBinding<clickManagePin> {
    private final MwCurrentUserEwalletActivity write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onAddWalletClick(clickManagePin clickmanagepin, MwCurrentUserEwalletActivity mwCurrentUserEwalletActivity) {
        super(clickmanagepin);
        onGetStartedClick.write((Object) clickmanagepin, "job");
        onGetStartedClick.write((Object) mwCurrentUserEwalletActivity, "handle");
        this.write = mwCurrentUserEwalletActivity;
    }

    public final void IconCompatParcelizer(Throwable th) {
        this.write.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisposeOnCompletion[");
        sb.append(this.write);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.write.MediaBrowserCompat$CustomActionResultReceiver();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
