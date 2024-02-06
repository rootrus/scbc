package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getQueryParamsFor$MediaBrowserCompat$MediaItem */
public final class getQueryParamsFor$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getSignature> {
    private /* synthetic */ getQueryParamsFor MediaBrowserCompat$ItemReceiver;

    public getQueryParamsFor$MediaBrowserCompat$MediaItem(getQueryParamsFor getqueryparamsfor) {
        this.MediaBrowserCompat$ItemReceiver = getqueryparamsfor;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getSignature) obj).read(getQueryParamsFor.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$MediaItem);
    }
}
