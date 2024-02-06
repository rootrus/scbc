package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.ListenerHolder;

/* renamed from: o.createDoubleArray */
public final /* synthetic */ class createDoubleArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ ListenerHolder.ListenerKey MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ createDoubleArray(ListenerHolder.ListenerKey listenerKey) {
        this.MediaBrowserCompat$ItemReceiver = listenerKey;
    }

    public final Object write(Object obj) {
        C4169camera camera;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        int i = ((getFloat) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
        String str = ((getFloat) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
        int i2 = ((getFloat) singleDataEntity.getData()).read;
        boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((getFloat) singleDataEntity.getData()).write, (Object) "Y");
        Iterable<CampaignTrackingReceiver> iterable = ((getFloat) singleDataEntity.getData()).IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (CampaignTrackingReceiver campaignTrackingReceiver : iterable) {
            int i3 = campaignTrackingReceiver.MediaDescriptionCompat;
            String str2 = campaignTrackingReceiver.MediaBrowserCompat$SearchResultReceiver;
            String str3 = campaignTrackingReceiver.IconCompatParcelizer;
            String str4 = campaignTrackingReceiver.read;
            String str5 = campaignTrackingReceiver.MediaBrowserCompat$MediaItem;
            boolean MediaBrowserCompat$ItemReceiver3 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) campaignTrackingReceiver.write, (Object) "Y");
            boolean MediaBrowserCompat$ItemReceiver4 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) campaignTrackingReceiver.MediaBrowserCompat$CustomActionResultReceiver, (Object) "Y");
            zzc zzc = campaignTrackingReceiver.MediaBrowserCompat$ItemReceiver;
            if (zzc == null) {
                camera = null;
            } else {
                camera = new C4169camera(zzc.MediaBrowserCompat$ItemReceiver, zzc.write);
            }
            arrayList.add(new compassEnabled(Integer.valueOf(i3), str4, str5, str2, (String) null, (String) null, (String) null, (String) null, str3, MediaBrowserCompat$ItemReceiver4, MediaBrowserCompat$ItemReceiver3, camera, (String) null, (String) null, campaignTrackingReceiver.RatingCompat, 12528));
        }
        return new GoogleMapOptions(i, MediaBrowserCompat$ItemReceiver2, str, Integer.valueOf(i2), HmlNTBBusinessURLInformationActivity.write((List) arrayList, new C3591x8d1c9634()));
    }
}
