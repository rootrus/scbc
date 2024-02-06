package p040o;

import java.util.concurrent.atomic.AtomicLong;
import p040o.AlertController$RecycleListView;
import p040o.SCBDeepLinkActivity;

/* renamed from: o.SCBDeepLinkActivity$MediaBrowserCompat$SearchResultReceiver */
abstract class SCBDeepLinkActivity$MediaBrowserCompat$SearchResultReceiver<T> extends SCBDeepLinkActivity.read<T> {
    /* access modifiers changed from: package-private */
    public abstract void MediaMetadataCompat();

    SCBDeepLinkActivity$MediaBrowserCompat$SearchResultReceiver(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        super(depositDetailRecyclerViewAdapter$DepositViewHolder);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!IconCompatParcelizer(nullPointerException)) {
                    AlertController$RecycleListView.read.read((Throwable) nullPointerException);
                }
            } else if (get() != 0) {
                this.MediaBrowserCompat$ItemReceiver.onNext(t);
                AlertController$RecycleListView.IconCompatParcelizer((AtomicLong) this, 1);
            } else {
                MediaMetadataCompat();
            }
        }
    }
}
