package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C1251R;
import p040o.zzge;

/* renamed from: o.zzge$zzc$zza$MediaBrowserCompat$ItemReceiver */
final class zzge$zzc$zza$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzge.zzc.zza MediaBrowserCompat$ItemReceiver;

    zzge$zzc$zza$MediaBrowserCompat$ItemReceiver(zzge.zzc.zza zza) {
        this.MediaBrowserCompat$ItemReceiver = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        List<StreetViewPanoramaOptions> list;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        fromAssetSync fromassetsync = (fromAssetSync) singleDataEntity.getData();
        getStreetViewPanoramaCamera getstreetviewpanoramacamera = null;
        if (fromassetsync == null) {
            return null;
        }
        getUserNavigationEnabled getusernavigationenabled = new getUserNavigationEnabled();
        List<fromJsonInputStream> list2 = fromassetsync.read;
        if (list2 != null) {
            Iterable<fromJsonInputStream> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (fromJsonInputStream MediaBrowserCompat$CustomActionResultReceiver : iterable) {
                arrayList.add(getMinAgeOfLockScreen.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        getusernavigationenabled.read = list;
        C1251R.integer integer = fromassetsync.MediaBrowserCompat$ItemReceiver;
        if (integer != null) {
            getstreetviewpanoramacamera = new getStreetViewPanoramaCamera();
            getstreetviewpanoramacamera.MediaBrowserCompat$ItemReceiver = integer.MediaBrowserCompat$CustomActionResultReceiver;
            getstreetviewpanoramacamera.read = integer.MediaBrowserCompat$ItemReceiver;
        }
        getusernavigationenabled.IconCompatParcelizer = getstreetviewpanoramacamera;
        return getusernavigationenabled;
    }
}
