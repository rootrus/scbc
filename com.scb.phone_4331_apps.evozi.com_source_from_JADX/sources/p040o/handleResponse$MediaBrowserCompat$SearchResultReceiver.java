package p040o;

import p040o.MoreExecutors;
import p040o.writeUInt64NoTag;

/* renamed from: o.handleResponse$MediaBrowserCompat$SearchResultReceiver */
public final class handleResponse$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getPayeeEndorsement> {
    private /* synthetic */ MoreExecutors.SameThreadExecutorService IconCompatParcelizer;

    public handleResponse$MediaBrowserCompat$SearchResultReceiver(MoreExecutors.SameThreadExecutorService sameThreadExecutorService) {
        this.IconCompatParcelizer = sameThreadExecutorService;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getPayeeEndorsement) obj).write(this.IconCompatParcelizer);
    }
}
