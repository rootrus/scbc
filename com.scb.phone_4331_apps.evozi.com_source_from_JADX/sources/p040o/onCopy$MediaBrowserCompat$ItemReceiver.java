package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.onCopy$MediaBrowserCompat$ItemReceiver */
final class onCopy$MediaBrowserCompat$ItemReceiver<T, R> implements ActivateChequeDeepLinkActivity<T> {
    private ActivateChequeDeepLinkActivity<? super R> read;
    private DirectDebitDeepLinkActivity<? super T, ? extends R> write;

    onCopy$MediaBrowserCompat$ItemReceiver(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends R> directDebitDeepLinkActivity) {
        this.read = activateChequeDeepLinkActivity;
        this.write = directDebitDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.read.onSubscribe(bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        try {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(HmlLatestPersonalInformationDeepLinkActivity.write(this.write.write(t), "The mapper function returned a null value."));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            onError(th);
        }
    }

    public final void onError(Throwable th) {
        this.read.onError(th);
    }
}
