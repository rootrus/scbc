package p040o;

import p039io.reactivex.exceptions.MissingBackpressureException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.SCBDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9820x71276894<T> extends SCBDeepLinkActivity$MediaBrowserCompat$SearchResultReceiver<T> {
    C9820x71276894(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        super(depositDetailRecyclerViewAdapter$DepositViewHolder);
    }

    /* access modifiers changed from: package-private */
    public final void MediaMetadataCompat() {
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("create: could not emit value due to lack of requests");
        if (!IconCompatParcelizer(missingBackpressureException)) {
            AlertController$RecycleListView.read.read((Throwable) missingBackpressureException);
        }
    }
}
