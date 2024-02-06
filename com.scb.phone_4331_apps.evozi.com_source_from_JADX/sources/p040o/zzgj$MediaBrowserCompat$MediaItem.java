package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzgj$MediaBrowserCompat$MediaItem */
final class zzgj$MediaBrowserCompat$MediaItem<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgj$MediaBrowserCompat$MediaItem IconCompatParcelizer = new zzgj$MediaBrowserCompat$MediaItem();

    zzgj$MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return (setTraceEnabled) singleDataEntity.getData();
    }
}
