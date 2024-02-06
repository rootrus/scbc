package p040o;

/* renamed from: o.showDialogDeletePinLocation$MediaBrowserCompat$ItemReceiver */
final class showDialogDeletePinLocation$MediaBrowserCompat$ItemReceiver extends MailingAddressDetailsActivity {
    private final WalletAdapter$WalletHolder<?> MediaBrowserCompat$ItemReceiver;

    public showDialogDeletePinLocation$MediaBrowserCompat$ItemReceiver(showDialogDeletePinLocation showdialogdeletepinlocation, WalletAdapter$WalletHolder<?> walletAdapter$WalletHolder) {
        onGetStartedClick.write((Object) walletAdapter$WalletHolder, "receive");
        this.MediaBrowserCompat$ItemReceiver = walletAdapter$WalletHolder;
    }

    public final void read(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.aU_();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveReceiveOnCancel[");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.aU_();
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
