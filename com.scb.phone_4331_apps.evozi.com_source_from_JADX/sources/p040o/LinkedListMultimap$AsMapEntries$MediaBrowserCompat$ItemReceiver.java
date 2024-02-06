package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LinkedListMultimap;
import p040o.SortedLists;

/* renamed from: o.LinkedListMultimap$AsMapEntries$MediaBrowserCompat$ItemReceiver */
final class LinkedListMultimap$AsMapEntries$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<isFastestIntervalExplicitlySet, populateThreadData> {
    private /* synthetic */ LinkedListMultimap.AsMapEntries write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LinkedListMultimap$AsMapEntries$MediaBrowserCompat$ItemReceiver(LinkedListMultimap.AsMapEntries asMapEntries) {
        super(1);
        this.write = asMapEntries;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List<populateSessionData> list;
        isFastestIntervalExplicitlySet isfastestintervalexplicitlyset = (isFastestIntervalExplicitlySet) obj;
        onGetStartedClick.write((Object) isfastestintervalexplicitlyset, "resp");
        SortedLists.Relation.C37983 r0 = this.write.IconCompatParcelizer;
        onGetStartedClick.write((Object) isfastestintervalexplicitlyset, "model");
        populateThreadData populatethreaddata = new populateThreadData();
        populatethreaddata.MediaBrowserCompat$MediaItem = isfastestintervalexplicitlyset.MediaMetadataCompat;
        populatethreaddata.MediaBrowserCompat$CustomActionResultReceiver = isfastestintervalexplicitlyset.MediaBrowserCompat$CustomActionResultReceiver;
        populatethreaddata.read = isfastestintervalexplicitlyset.read;
        populatethreaddata.MediaBrowserCompat$SearchResultReceiver = isfastestintervalexplicitlyset.RatingCompat;
        List<setExpirationTime> list2 = isfastestintervalexplicitlyset.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            Iterable<setExpirationTime> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (setExpirationTime MediaBrowserCompat$ItemReceiver : iterable) {
                arrayList.add(r0.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        onGetStartedClick.write((Object) list, "<set-?>");
        populatethreaddata.MediaBrowserCompat$ItemReceiver = list;
        populatethreaddata.MediaDescriptionCompat = isfastestintervalexplicitlyset.MediaBrowserCompat$MediaItem;
        populatethreaddata.write = isfastestintervalexplicitlyset.write;
        populatethreaddata.IconCompatParcelizer = isfastestintervalexplicitlyset.IconCompatParcelizer;
        return populatethreaddata;
    }
}
