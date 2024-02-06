package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.isMeasurementEnabled */
public final class isMeasurementEnabled extends FragmentBuilder_BindSummaryFragment {
    public static List<isZoomGesturesEnabled> read(List<ItemListIntents> list) {
        SearchIntents searchIntents;
        String str;
        NoteIntents noteIntents;
        String str2;
        List<setFlexDirection> list2;
        if (list == null) {
            return null;
        }
        Iterable<ItemListIntents> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (ItemListIntents itemListIntents : iterable) {
            String str3 = itemListIntents != null ? itemListIntents.MediaBrowserCompat$CustomActionResultReceiver : null;
            String str4 = itemListIntents != null ? itemListIntents.MediaBrowserCompat$ItemReceiver : null;
            String str5 = itemListIntents != null ? itemListIntents.write : null;
            String str6 = itemListIntents != null ? itemListIntents.MediaDescriptionCompat : null;
            String str7 = itemListIntents != null ? itemListIntents.MediaBrowserCompat$MediaItem : null;
            String str8 = itemListIntents != null ? itemListIntents.IconCompatParcelizer : null;
            if (itemListIntents != null) {
                searchIntents = itemListIntents.MediaMetadataCompat;
            } else {
                searchIntents = null;
            }
            String str9 = searchIntents != null ? searchIntents.write : null;
            if (searchIntents == null || (str = searchIntents.MediaBrowserCompat$ItemReceiver) == null) {
                str = "";
            }
            pointToOrientation pointtoorientation = new pointToOrientation(str9, str);
            if (itemListIntents != null) {
                noteIntents = itemListIntents.RatingCompat;
            } else {
                noteIntents = null;
            }
            String str10 = noteIntents != null ? noteIntents.IconCompatParcelizer : null;
            if (noteIntents != null) {
                str2 = noteIntents.MediaBrowserCompat$ItemReceiver;
            } else {
                str2 = null;
            }
            orientationToPoint orientationtopoint = new orientationToPoint(str10, str2);
            if (itemListIntents != null) {
                list2 = itemListIntents.read;
            } else {
                list2 = null;
            }
            arrayList.add(new isZoomGesturesEnabled(str3, str4, str5, str6, str7, str8, pointtoorientation, orientationtopoint, IconCompatParcelizer(list2)));
        }
        return (List) arrayList;
    }

    private static List<getVisibleRegion> IconCompatParcelizer(List<setFlexDirection> list) {
        String str;
        String str2;
        String str3;
        String str4;
        if (list == null) {
            return null;
        }
        Iterable<setFlexDirection> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (setFlexDirection setflexdirection : iterable) {
            String str5 = setflexdirection != null ? setflexdirection.IconCompatParcelizer : null;
            if (setflexdirection != null) {
                str = setflexdirection.write;
            } else {
                str = null;
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "Integer", false)) {
                if (setflexdirection == null || (str4 = setflexdirection.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                    str4 = "0";
                }
                str2 = String.valueOf(Integer.valueOf(str4).intValue());
            } else if (setflexdirection == null || (str2 = setflexdirection.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                str2 = "0.00";
            }
            if (setflexdirection != null) {
                str3 = setflexdirection.write;
            } else {
                str3 = null;
            }
            arrayList.add(new getVisibleRegion(str5, str2, str3));
        }
        return (List) arrayList;
    }
}
