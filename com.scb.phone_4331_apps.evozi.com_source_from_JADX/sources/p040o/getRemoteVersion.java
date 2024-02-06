package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.getRemoteVersion */
public final /* synthetic */ class getRemoteVersion implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getRemoteVersion(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSummaryFragment;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        String str5;
        ReserveIntents reserveIntents = (ReserveIntents) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) reserveIntents, "securitiesSummaryEntity");
        String str6 = reserveIntents.MediaMetadataCompat;
        String str7 = reserveIntents.MediaBrowserCompat$SearchResultReceiver;
        String str8 = reserveIntents.MediaBrowserCompat$ItemReceiver;
        String str9 = reserveIntents.IconCompatParcelizer;
        List<getAdvertisingIdInfo> list2 = reserveIntents.read;
        if (list2 != null) {
            Iterable iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                getAdvertisingIdInfo getadvertisingidinfo = (getAdvertisingIdInfo) it.next();
                Projection MediaBrowserCompat$CustomActionResultReceiver2 = Projection.MediaBrowserCompat$CustomActionResultReceiver(getadvertisingidinfo.MediaBrowserCompat$CustomActionResultReceiver);
                String str10 = getadvertisingidinfo.write;
                String str11 = getadvertisingidinfo.IconCompatParcelizer;
                String str12 = getadvertisingidinfo.f2824x50fd9e4a;
                String str13 = getadvertisingidinfo.ParcelableVolumeInfo;
                String str14 = getadvertisingidinfo.MediaMetadataCompat;
                Iterator it2 = it;
                String str15 = str9;
                String str16 = str8;
                String str17 = str7;
                String str18 = str14;
                arrayList.add(new isPanningGesturesEnabled(MediaBrowserCompat$CustomActionResultReceiver2, str10, str11, str12, str13, str18, getadvertisingidinfo.MediaBrowserCompat$MediaItem, getadvertisingidinfo.read, getadvertisingidinfo.MediaBrowserCompat$SearchResultReceiver, getadvertisingidinfo.MediaSessionCompat$QueueItem, getadvertisingidinfo.RatingCompat, getadvertisingidinfo.MediaDescriptionCompat, getadvertisingidinfo.MediaBrowserCompat$ItemReceiver));
                it = it2;
                str9 = str15;
                str8 = str16;
                str7 = str17;
                str6 = str6;
            }
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            list = (List) arrayList;
        } else {
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            list = null;
        }
        List<animateTo> MediaBrowserCompat$ItemReceiver = isMeasurementExplicitlyDisabled.MediaBrowserCompat$ItemReceiver(reserveIntents.write);
        getInfo getinfo = reserveIntents.MediaBrowserCompat$MediaItem;
        if (getinfo != null) {
            str5 = getinfo.MediaBrowserCompat$ItemReceiver;
        } else {
            str5 = null;
        }
        return DebitCardResetOtpActivity.just(new setOnStreetViewPanoramaChangeListener(str, str2, str3, str4, list, MediaBrowserCompat$ItemReceiver, new setOnStreetViewPanoramaClickListener(str5), onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "Y", (Object) reserveIntents.MediaBrowserCompat$CustomActionResultReceiver)));
    }
}
