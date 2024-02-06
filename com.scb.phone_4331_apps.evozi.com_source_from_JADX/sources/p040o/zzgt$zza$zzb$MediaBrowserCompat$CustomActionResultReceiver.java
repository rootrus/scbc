package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.zzgt$zza$zzb$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgt$zza$zzb$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgt$zza$zzb$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = new zzgt$zza$zzb$MediaBrowserCompat$CustomActionResultReceiver();

    zzgt$zza$zzb$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        Iterable<setApplyingOpacityToLayersEnabled> iterable = (Iterable) data;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (setApplyingOpacityToLayersEnabled write : iterable) {
            arrayList.add(write.write());
        }
        return (List) arrayList;
    }
}
