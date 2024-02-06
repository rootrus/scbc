package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p040o.SignedBytes;
import p040o.zzwe;

/* renamed from: o.readCount */
public final class readCount extends constrainedListMultimap {
    private final SignedBytes.LexicographicalComparator IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public readCount(Resources resources, SharedPreferences sharedPreferences, SignedBytes.LexicographicalComparator lexicographicalComparator) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) lexicographicalComparator, "baseAssetsDisplayMapper");
        this.IconCompatParcelizer = lexicographicalComparator;
    }

    public final writeFatal write(zzwe zzwe) {
        onGetStartedClick.write((Object) zzwe, "entity");
        String IconCompatParcelizer2 = IconCompatParcelizer("dd MMM yyyy - HH:mm", zzwe.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "transformToDateMonthYear…ty.applicationExpiryDate)");
        Collection arrayList = new ArrayList();
        for (Object next : zzwe.write) {
            if (!((zzwe.write) next).MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (zzwe.write write : (List) arrayList) {
            List singletonList = Collections.singletonList(new writeSessionEvent(write.read));
            onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
            Collection collection = singletonList;
            Iterable<zzwe.IconCompatParcelizer> write2 = HmlNTBBusinessURLInformationActivity.write(write.MediaBrowserCompat$CustomActionResultReceiver, new readCount$MediaBrowserCompat$CustomActionResultReceiver());
            int i = 10;
            onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
            if (write2 instanceof Collection) {
                i = ((Collection) write2).size();
            }
            Collection arrayList3 = new ArrayList(i);
            for (zzwe.IconCompatParcelizer iconCompatParcelizer : write2) {
                String str = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                if (str2 == null) {
                    str2 = "";
                }
                String c_ = this.IconCompatParcelizer.mo26549c_(iconCompatParcelizer.IconCompatParcelizer);
                onGetStartedClick.IconCompatParcelizer((Object) c_, "baseAssetsDisplayMapper.…AssetUrl(entity.iconPath)");
                arrayList3.add(new writeInitialPartsTo(str, str2, c_));
            }
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList2, HmlNTBBusinessURLInformationActivity.write(collection, (List) arrayList3));
        }
        return new writeFatal(IconCompatParcelizer2, (List) arrayList2);
    }
}
