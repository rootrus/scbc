package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzkx$MediaBrowserCompat$CustomActionResultReceiver */
final class zzkx$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzkx$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new zzkx$MediaBrowserCompat$CustomActionResultReceiver();

    zzkx$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return ((SimpleLottieValueCallback) singleDataEntity.getData()).read();
    }
}
