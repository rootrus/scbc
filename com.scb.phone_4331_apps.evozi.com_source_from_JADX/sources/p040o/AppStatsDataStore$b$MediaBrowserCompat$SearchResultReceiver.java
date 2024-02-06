package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsDataStore$b$MediaBrowserCompat$SearchResultReceiver */
public final class AppStatsDataStore$b$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<AggregateException> {
    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public AppStatsDataStore$b$MediaBrowserCompat$SearchResultReceiver(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((AggregateException) obj).RatingCompat(this.MediaBrowserCompat$ItemReceiver);
    }
}
