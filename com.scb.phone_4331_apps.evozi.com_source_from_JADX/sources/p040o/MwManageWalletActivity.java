package p040o;

/* renamed from: o.MwManageWalletActivity */
final class MwManageWalletActivity extends MwManageWalletActivity_ViewBinding<clickManagePin> {
    private final FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> read;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.read.invoke((Throwable) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MwManageWalletActivity(clickManagePin clickmanagepin, FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        super(clickmanagepin);
        onGetStartedClick.write((Object) clickmanagepin, "job");
        onGetStartedClick.write((Object) fundFactSheetActivity, "handler");
        this.read = fundFactSheetActivity;
    }

    public final void IconCompatParcelizer(Throwable th) {
        this.read.invoke(th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCompletion[");
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('@');
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        sb.append(']');
        return sb.toString();
    }
}
