package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.isPresent$MediaSessionCompat$QueueItem */
final class isPresent$MediaSessionCompat$QueueItem<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final isPresent$MediaSessionCompat$QueueItem MediaBrowserCompat$CustomActionResultReceiver = new isPresent$MediaSessionCompat$QueueItem();

    isPresent$MediaSessionCompat$QueueItem() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return (AnimatablePathValueParser) singleDataEntity.getData();
    }
}
