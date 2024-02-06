package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzge$zzk$MediaBrowserCompat$SearchResultReceiver */
final class zzge$zzk$MediaBrowserCompat$SearchResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzge$zzk$MediaBrowserCompat$SearchResultReceiver IconCompatParcelizer = new zzge$zzk$MediaBrowserCompat$SearchResultReceiver();

    zzge$zzk$MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return ((getMean) singleDataEntity.getData()).IconCompatParcelizer();
    }
}
