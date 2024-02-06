package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.zzfy;

/* renamed from: o.zzju$MediaSessionCompat$QueueItem */
final class zzju$MediaSessionCompat$QueueItem<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzju MediaBrowserCompat$ItemReceiver;

    zzju$MediaSessionCompat$QueueItem(zzju zzju) {
        this.MediaBrowserCompat$ItemReceiver = zzju;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        TransformKeyframeAnimation transformKeyframeAnimation = (TransformKeyframeAnimation) data;
        onGetStartedClick.write((Object) transformKeyframeAnimation, "entity");
        return new zzfy.zze(transformKeyframeAnimation.write, transformKeyframeAnimation.MediaBrowserCompat$ItemReceiver);
    }
}
