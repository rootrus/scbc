package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.zzge$zzd$zza$MediaBrowserCompat$CustomActionResultReceiver */
final class zzge$zzd$zza$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzge$zzd$zza$MediaBrowserCompat$CustomActionResultReceiver write = new zzge$zzd$zza$MediaBrowserCompat$CustomActionResultReceiver();

    zzge$zzd$zza$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        LocationResult locationResult;
        List list;
        List list2;
        List list3;
        getShapePath getshapepath = (getShapePath) obj;
        onGetStartedClick.write((Object) getshapepath, "it");
        getItems getitems = getshapepath.MediaBrowserCompat$ItemReceiver;
        if (getitems != null) {
            List<isClosed> list4 = getitems.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 10;
            if (list4 != null) {
                Iterable<isClosed> iterable = list4;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
                for (isClosed IconCompatParcelizer : iterable) {
                    arrayList.add(IconCompatParcelizer.IconCompatParcelizer());
                }
                list = (List) arrayList;
            } else {
                list = HmlNationalIdActivity.IconCompatParcelizer;
            }
            List<isClosed> list5 = getitems.IconCompatParcelizer;
            if (list5 != null) {
                Iterable<isClosed> iterable2 = list5;
                onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
                Collection arrayList2 = new ArrayList(iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10);
                for (isClosed IconCompatParcelizer2 : iterable2) {
                    arrayList2.add(IconCompatParcelizer2.IconCompatParcelizer());
                }
                list2 = (List) arrayList2;
            } else {
                list2 = HmlNationalIdActivity.IconCompatParcelizer;
            }
            List<isClosed> list6 = getitems.MediaBrowserCompat$ItemReceiver;
            if (list6 != null) {
                Iterable<isClosed> iterable3 = list6;
                onGetStartedClick.write((Object) iterable3, "$this$collectionSizeOrDefault");
                if (iterable3 instanceof Collection) {
                    i = ((Collection) iterable3).size();
                }
                Collection arrayList3 = new ArrayList(i);
                for (isClosed IconCompatParcelizer3 : iterable3) {
                    arrayList3.add(IconCompatParcelizer3.IconCompatParcelizer());
                }
                list3 = (List) arrayList3;
            } else {
                list3 = HmlNationalIdActivity.IconCompatParcelizer;
            }
            locationResult = new LocationResult(list, list2, list3);
        } else {
            locationResult = new LocationResult((byte) 0);
        }
        toPaintCap topaintcap = getshapepath.IconCompatParcelizer;
        return new setIvAvatar(locationResult, topaintcap != null ? topaintcap.write() : new setMaxWaitTime((byte) 0));
    }
}
