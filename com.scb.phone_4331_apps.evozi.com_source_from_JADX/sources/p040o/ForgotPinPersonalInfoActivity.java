package p040o;

/* renamed from: o.ForgotPinPersonalInfoActivity */
public final class ForgotPinPersonalInfoActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private BillerDeepLinkActivity<T> IconCompatParcelizer;
    private DataPrivacyManagementDeepLinkActivity read;

    public ForgotPinPersonalInfoActivity(BillerDeepLinkActivity<T> billerDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        this.IconCompatParcelizer = billerDeepLinkActivity;
        this.read = dataPrivacyManagementDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.IconCompatParcelizer.IconCompatParcelizer(new ForgotPinPersonalInfoActivity$MediaBrowserCompat$ItemReceiver(activateChequeDeepLinkActivity, this.read));
    }
}
