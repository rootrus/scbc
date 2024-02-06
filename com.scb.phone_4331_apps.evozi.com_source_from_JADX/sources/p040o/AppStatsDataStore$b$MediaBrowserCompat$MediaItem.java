package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsDataStore$b$MediaBrowserCompat$MediaItem */
public final class AppStatsDataStore$b$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<AggregateException> {
    private /* synthetic */ boolean IconCompatParcelizer;

    public AppStatsDataStore$b$MediaBrowserCompat$MediaItem(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((AggregateException) obj).MediaDescriptionCompat(this.IconCompatParcelizer);
    }
}
