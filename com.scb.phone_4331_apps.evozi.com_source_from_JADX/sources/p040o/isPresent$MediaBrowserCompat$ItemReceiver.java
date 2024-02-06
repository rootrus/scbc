package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.isPresent$MediaBrowserCompat$ItemReceiver */
final class isPresent$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final isPresent$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new isPresent$MediaBrowserCompat$ItemReceiver();

    isPresent$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return ((fetchFromNetworkInternal) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
    }
}
