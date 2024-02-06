package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.loop;
import p040o.requestActivityUpdates;

/* renamed from: o.getChangeType */
public final class getChangeType extends FragmentBuilder_BindSummaryFragment {
    public final requestActivityUpdates IconCompatParcelizer(loop loop) {
        List list;
        String str;
        removeActivityUpdates removeactivityupdates;
        loop loop2 = loop;
        onGetStartedClick.write((Object) loop2, "validationEligibilityEntity");
        if (loop2.read == null || loop2.write == null || loop2.IconCompatParcelizer == null || loop2.MediaMetadataCompat == null || loop2.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        loop$MediaBrowserCompat$ItemReceiver loop_mediabrowsercompat_itemreceiver = loop2.read;
        requestActivityUpdates.read read = new requestActivityUpdates.read(loop_mediabrowsercompat_itemreceiver.MediaMetadataCompat, loop_mediabrowsercompat_itemreceiver.write, loop_mediabrowsercompat_itemreceiver.MediaDescriptionCompat, loop_mediabrowsercompat_itemreceiver.MediaSessionCompat$Token, loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem, loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver, loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, loop_mediabrowsercompat_itemreceiver.RatingCompat, loop_mediabrowsercompat_itemreceiver.read, loop_mediabrowsercompat_itemreceiver.IconCompatParcelizer, loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver);
        isAnimating isanimating = loop2.write;
        removeActivityUpdates removeactivityupdates2 = new removeActivityUpdates(isanimating.MediaBrowserCompat$ItemReceiver, isanimating.write);
        String str2 = loop2.IconCompatParcelizer;
        List<loop.IconCompatParcelizer> list2 = loop2.RatingCompat;
        if (list2 == null) {
            str = str2;
            removeactivityupdates = removeactivityupdates2;
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterable<loop.IconCompatParcelizer> iterable = list2;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList2 = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (loop.IconCompatParcelizer iconCompatParcelizer : iterable) {
                String str3 = str2;
                ArrayList arrayList3 = arrayList;
                arrayList2.add(Boolean.valueOf(arrayList3.add(new C5229x76737fb9(iconCompatParcelizer.MediaBrowserCompat$MediaItem, FragmentBuilder_BindSummaryFragment.write(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null), iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.write, iconCompatParcelizer.read, FragmentBuilder_BindSummaryFragment.write(iconCompatParcelizer.IconCompatParcelizer, (OffsetDateTime) null), iconCompatParcelizer.MediaDescriptionCompat, iconCompatParcelizer.RatingCompat))));
                arrayList = arrayList3;
                removeactivityupdates2 = removeactivityupdates2;
                str2 = str3;
            }
            str = str2;
            removeactivityupdates = removeactivityupdates2;
            list = arrayList;
        }
        String str4 = loop2.MediaMetadataCompat;
        Iterable<isMergePathsEnabledForKitKatAndAbove> iterable2 = loop2.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        Collection arrayList4 = new ArrayList(iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10);
        for (isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove : iterable2) {
            arrayList4.add(ismergepathsenabledforkitkatandabove.MediaBrowserCompat$ItemReceiver);
        }
        return new requestActivityUpdates(read, removeactivityupdates, str, list, str4, (List) arrayList4);
    }
}
