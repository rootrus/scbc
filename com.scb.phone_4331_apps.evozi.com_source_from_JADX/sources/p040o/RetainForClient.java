package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.internal.cache.DiskLruCache;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.GoogleMap;
import p040o.PerformanceTracker;

/* renamed from: o.RetainForClient */
public final /* synthetic */ class RetainForClient implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write read;

    public /* synthetic */ RetainForClient(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.read = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        FragmentBuilder_BindPurchaseProfileManagementFragment.write write = this.read;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        GoogleMap.OnMarkerDragListener onMarkerDragListener = write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (((PerformanceTracker.C37281) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver != null) {
            write.MediaBrowserCompat$MediaItem.edit().putBoolean("com.scb.phone.pref.key.ENABLE_EMAIL_NOTIFICATIONS", ((PerformanceTracker.C37281) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver.equals(DiskLruCache.VERSION_1)).apply();
            if (onMarkerDragListener != null) {
                onMarkerDragListener.MediaBrowserCompat$MediaItem = ((PerformanceTracker.C37281) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
            }
        }
        if (onMarkerDragListener != null) {
            if (((PerformanceTracker.C37281) singleDataEntity.getData()).read != null) {
                onMarkerDragListener.MediaBrowserCompat$SearchResultReceiver = ((PerformanceTracker.C37281) singleDataEntity.getData()).read;
            }
            if (((PerformanceTracker.C37281) singleDataEntity.getData()).IconCompatParcelizer != null) {
                onMarkerDragListener.MediaDescriptionCompat = ((PerformanceTracker.C37281) singleDataEntity.getData()).IconCompatParcelizer;
            }
            write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = onMarkerDragListener;
        }
    }
}
