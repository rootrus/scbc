package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzgb$MediaBrowserCompat$SearchResultReceiver */
final class zzgb$MediaBrowserCompat$SearchResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgb$MediaBrowserCompat$SearchResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new zzgb$MediaBrowserCompat$SearchResultReceiver();

    zzgb$MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Optional optional = (Optional) singleDataEntity.getData();
        return new zzxb(optional.MediaBrowserCompat$CustomActionResultReceiver, optional.write, optional.read, optional.MediaBrowserCompat$ItemReceiver, optional.IconCompatParcelizer);
    }
}
