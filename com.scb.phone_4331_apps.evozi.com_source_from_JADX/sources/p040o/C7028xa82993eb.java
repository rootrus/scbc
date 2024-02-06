package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.ReviewDeviceActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C7028xa82993eb implements ActivateChequeDeepLinkActivity<T> {
    private ActivateChequeDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ ReviewDeviceActivity_ViewBinding write;

    C7028xa82993eb(ReviewDeviceActivity_ViewBinding reviewDeviceActivity_ViewBinding, ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.write = reviewDeviceActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = activateChequeDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver.onSubscribe(bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        try {
            this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(t);
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.MediaBrowserCompat$ItemReceiver.onError(th);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.onError(th);
    }
}
