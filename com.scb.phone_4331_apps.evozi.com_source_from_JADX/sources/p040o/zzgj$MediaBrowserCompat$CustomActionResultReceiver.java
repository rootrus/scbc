package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzgj$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgj$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgj$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = new zzgj$MediaBrowserCompat$CustomActionResultReceiver();

    zzgj$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return (fetchBitmap) singleDataEntity.getData();
    }
}
