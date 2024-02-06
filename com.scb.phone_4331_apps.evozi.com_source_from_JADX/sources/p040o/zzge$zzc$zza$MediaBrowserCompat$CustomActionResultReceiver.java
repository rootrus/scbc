package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.StreetViewPanoramaFragment;
import p040o.zzge;

/* renamed from: o.zzge$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver */
final class zzge$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzge.zzc.zza write;

    zzge$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver(zzge.zzc.zza zza) {
        this.write = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        List<fromJsonInputStream> list;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        fromJson fromjson = (fromJson) singleDataEntity.getData();
        if (fromjson == null || (list = fromjson.IconCompatParcelizer) == null) {
            return null;
        }
        StreetViewPanoramaFragment.zza MediaBrowserCompat$ItemReceiver = StreetViewPanoramaFragment.zza.MediaBrowserCompat$ItemReceiver();
        Iterable<fromJsonInputStream> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (fromJsonInputStream MediaBrowserCompat$CustomActionResultReceiver : iterable) {
            arrayList.add(getMinAgeOfLockScreen.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver));
        }
        MediaBrowserCompat$ItemReceiver.write = (List) arrayList;
        return MediaBrowserCompat$ItemReceiver;
    }
}
