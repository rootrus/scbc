package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.MergePaths;
import p040o.ShapeStroke;
import p040o.zzge;

/* renamed from: o.zzge$zzj$MediaBrowserCompat$ItemReceiver */
final class zzge$zzj$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzge.zzj IconCompatParcelizer;

    zzge$zzj$MediaBrowserCompat$ItemReceiver(zzge.zzj zzj) {
        this.IconCompatParcelizer = zzj;
    }

    public final /* synthetic */ Object write(Object obj) {
        boolean z;
        boolean z2;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        onLoadFinished onloadfinished = this.IconCompatParcelizer.write;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        ShapeStroke.LineCapType lineCapType = (ShapeStroke.LineCapType) data;
        onGetStartedClick.write((Object) lineCapType, "entity");
        Boolean bool = lineCapType.read;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean bool2 = lineCapType.MediaBrowserCompat$CustomActionResultReceiver;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        MergePaths.MergePathsMode mergePathsMode = lineCapType.MediaBrowserCompat$ItemReceiver;
        getInitialTrigger MediaBrowserCompat$ItemReceiver = mergePathsMode != null ? onloadfinished.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(mergePathsMode) : null;
        List<getMaskPath> list = lineCapType.IconCompatParcelizer;
        List<getGeofenceTransition> write = list != null ? onloadfinished.write.write(list) : null;
        List<getParentId> list2 = lineCapType.write;
        return new LocationServices(z, z2, MediaBrowserCompat$ItemReceiver, write, (list2 == null || !(list2.isEmpty() ^ true)) ? null : hasResolution.MediaBrowserCompat$CustomActionResultReceiver(list2.get(0)));
    }
}
