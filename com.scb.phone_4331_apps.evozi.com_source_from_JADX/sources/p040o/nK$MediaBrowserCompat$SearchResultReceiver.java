package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nK$MediaBrowserCompat$SearchResultReceiver */
final class nK$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70611> {
    private /* synthetic */ setImportance read;

    nK$MediaBrowserCompat$SearchResultReceiver(setImportance setimportance) {
        this.read = setimportance;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C70611) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
