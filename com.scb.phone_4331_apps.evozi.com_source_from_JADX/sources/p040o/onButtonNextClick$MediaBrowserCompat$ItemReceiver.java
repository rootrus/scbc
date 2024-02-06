package p040o;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onButtonNextClick$MediaBrowserCompat$ItemReceiver */
final class onButtonNextClick$MediaBrowserCompat$ItemReceiver implements ActivateChequeDeepLinkActivity<T> {
    private final ActivateChequeDeepLinkActivity<? super T> read;
    private /* synthetic */ onButtonNextClick write;

    onButtonNextClick$MediaBrowserCompat$ItemReceiver(onButtonNextClick onbuttonnextclick, ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.write = onbuttonnextclick;
        this.read = activateChequeDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.read.onSubscribe(bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
    }

    public final void onError(Throwable th) {
        try {
            this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th);
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            th = new CompositeException(th, th2);
        }
        this.read.onError(th);
    }
}
