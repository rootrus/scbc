package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.isPresent$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C4828x996a27d7<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final C4828x996a27d7 MediaBrowserCompat$ItemReceiver = new C4828x996a27d7();

    C4828x996a27d7() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return (fetchFromNetworkInternal) singleDataEntity.getData();
    }
}
