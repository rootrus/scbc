package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.zzge;

/* renamed from: o.zzge$zzg$zzb$MediaBrowserCompat$ItemReceiver */
final class zzge$zzg$zzb$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzge.zzg.zzb IconCompatParcelizer;

    zzge$zzg$zzb$MediaBrowserCompat$ItemReceiver(zzge.zzg.zzb zzb) {
        this.IconCompatParcelizer = zzb;
    }

    public final /* synthetic */ Object write(Object obj) {
        List<DeepLinkModule> list;
        DeepLinkEntry deepLinkEntry;
        setOnCameraMoveCanceledListener setoncameramovecanceledlistener;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "entity.data");
        MiscUtils miscUtils = (MiscUtils) data;
        onGetStartedClick.write((Object) miscUtils, "entity");
        String str = miscUtils.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = miscUtils.MediaDescriptionCompat;
        String str3 = miscUtils.MediaBrowserCompat$SearchResultReceiver;
        double d = miscUtils.MediaBrowserCompat$ItemReceiver;
        String str4 = miscUtils.write;
        String str5 = miscUtils.read;
        String str6 = miscUtils.MediaSessionCompat$QueueItem;
        String str7 = miscUtils.ParcelableVolumeInfo;
        String str8 = miscUtils.MediaSessionCompat$Token;
        String str9 = miscUtils.RatingCompat;
        String str10 = miscUtils.MediaSessionCompat$ResultReceiverWrapper;
        String str11 = miscUtils.f2760x50fd9e4a;
        String str12 = miscUtils.MediaBrowserCompat$MediaItem;
        String str13 = miscUtils.MediaMetadataCompat;
        parseParameters parseparameters = miscUtils.IconCompatParcelizer;
        if (parseparameters != null) {
            list = parseparameters.IconCompatParcelizer;
        } else {
            list = null;
        }
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        Iterable iterable = list;
        String str14 = str12;
        int i = 10;
        String str15 = str11;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeepLinkModule deepLinkModule = (DeepLinkModule) it.next();
            arrayList.add(new setOnIndoorStateChangeListener(deepLinkModule.MediaBrowserCompat$ItemReceiver, deepLinkModule.write, deepLinkModule.MediaBrowserCompat$CustomActionResultReceiver, deepLinkModule.RatingCompat, deepLinkModule.read, 32));
            it = it;
            str10 = str10;
            str9 = str9;
            str8 = str8;
            str7 = str7;
        }
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        String str19 = str10;
        List MediaBrowserCompat$CustomActionResultReceiver = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList);
        parseParameters parseparameters2 = miscUtils.IconCompatParcelizer;
        if (parseparameters2 != null) {
            deepLinkEntry = parseparameters2.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            deepLinkEntry = null;
        }
        if (deepLinkEntry != null) {
            setoncameramovecanceledlistener = new setOnCameraMoveCanceledListener(deepLinkEntry.MediaBrowserCompat$CustomActionResultReceiver, deepLinkEntry.MediaBrowserCompat$ItemReceiver, deepLinkEntry.IconCompatParcelizer, deepLinkEntry.write, deepLinkEntry.read);
        } else {
            setoncameramovecanceledlistener = null;
        }
        return new setOnCircleClickListener(str, str2, str3, d, str4, str5, str6, str16, str17, str18, str19, str15, str14, str13, MediaBrowserCompat$CustomActionResultReceiver, setoncameramovecanceledlistener);
    }
}
