package p040o;

/* renamed from: o.RtpDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C7031x17c371f0 implements DebitCardRequestInputActivity {
    private /* synthetic */ RtpDeepLinkActivity IconCompatParcelizer;
    private final ActivateChequeDeepLinkActivity<? super T> read;

    C7031x17c371f0(RtpDeepLinkActivity rtpDeepLinkActivity, ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.IconCompatParcelizer = rtpDeepLinkActivity;
        this.read = activateChequeDeepLinkActivity;
    }

    public final void onComplete() {
        T t = this.IconCompatParcelizer.IconCompatParcelizer;
        if (t == null) {
            this.read.onError(new NullPointerException("The value supplied is null"));
        } else {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
        }
    }

    public final void onError(Throwable th) {
        this.read.onError(th);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.read.onSubscribe(bulkTransferDeepLinkActivity);
    }
}
