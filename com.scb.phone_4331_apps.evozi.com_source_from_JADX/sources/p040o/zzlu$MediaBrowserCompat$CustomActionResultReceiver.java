package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzlu$MediaBrowserCompat$CustomActionResultReceiver */
final class zzlu$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzlu$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new zzlu$MediaBrowserCompat$CustomActionResultReceiver();

    zzlu$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return (RadarChart) singleDataEntity.getData();
    }
}
