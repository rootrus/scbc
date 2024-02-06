package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsDataStore$b$MediaBrowserCompat$ItemReceiver */
public final class AppStatsDataStore$b$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<AggregateException> {
    private /* synthetic */ boolean read;

    public AppStatsDataStore$b$MediaBrowserCompat$ItemReceiver(boolean z) {
        this.read = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((AggregateException) obj).MediaBrowserCompat$MediaItem(this.read);
    }
}
