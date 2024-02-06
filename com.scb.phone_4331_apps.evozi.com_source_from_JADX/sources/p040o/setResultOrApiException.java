package p040o;

/* renamed from: o.setResultOrApiException */
public final /* synthetic */ class setResultOrApiException implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zabr$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setResultOrApiException(zabr$MediaBrowserCompat$ItemReceiver zabr_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = zabr_mediabrowsercompat_itemreceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.error((Throwable) zabr.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, (Throwable) obj));
    }
}
