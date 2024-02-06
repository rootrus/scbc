package p040o;

import com.google.android.gms.analytics.ecommerce.Promotion;
import p040o.AppStatsDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsDataStore$b$MediaSessionCompat$Token */
public final class AppStatsDataStore$b$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<AggregateException> {
    private /* synthetic */ AppStatsDataStore.C3032b write;

    public AppStatsDataStore$b$MediaSessionCompat$Token(AppStatsDataStore.C3032b bVar) {
        this.write = bVar;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        AggregateException aggregateException = (AggregateException) obj;
        if (this.write.MediaBrowserCompat$MediaItem != null) {
            AppStatsDataStore.C3032b bVar = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) aggregateException, Promotion.ACTION_VIEW);
            AppStatsDataStore.C3032b.IconCompatParcelizer(bVar, aggregateException);
        }
    }
}
