package p040o;

/* renamed from: o.MwLandingActivity_ViewBinding */
final class MwLandingActivity_ViewBinding extends MailingAddressDetailsActivity {
    private final FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.invoke((Throwable) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public MwLandingActivity_ViewBinding(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "handler");
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
    }

    public final void read(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.invoke(th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancel[");
        FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity, "$this$classSimpleName");
        String simpleName = fundFactSheetActivity.getClass().getSimpleName();
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
