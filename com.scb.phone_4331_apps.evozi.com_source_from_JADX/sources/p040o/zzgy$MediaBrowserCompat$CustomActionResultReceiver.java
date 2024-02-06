package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.LottieCompositionFactory;

/* renamed from: o.zzgy$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgy$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgy$MediaBrowserCompat$CustomActionResultReceiver read = new zzgy$MediaBrowserCompat$CustomActionResultReceiver();

    zzgy$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return (LottieCompositionFactory.C36109) singleDataEntity.getData();
    }
}
