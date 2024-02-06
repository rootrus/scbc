package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.isPresent$MediaSessionCompat$Token */
final class isPresent$MediaSessionCompat$Token<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final isPresent$MediaSessionCompat$Token write = new isPresent$MediaSessionCompat$Token();

    isPresent$MediaSessionCompat$Token() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return ((fetchFromNetworkInternal) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
    }
}
