package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzgs$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgs$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzgs write;

    zzgs$MediaBrowserCompat$CustomActionResultReceiver(zzgs zzgs) {
        this.write = zzgs;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        return this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((removeLottieOnCompositionLoadedListener) singleDataEntity.getData());
    }
}
