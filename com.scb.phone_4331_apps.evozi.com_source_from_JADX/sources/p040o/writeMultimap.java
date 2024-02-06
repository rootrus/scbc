package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.SignedBytes;
import p040o.zzfy;
import p040o.zziu;
import p040o.zzjx;

/* renamed from: o.writeMultimap */
public final class writeMultimap extends RegularImmutableSet {
    private final SignedBytes.LexicographicalComparator MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public writeMultimap(SignedBytes.LexicographicalComparator lexicographicalComparator, Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) lexicographicalComparator, "baseAssetsDisplayMapper");
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
        this.MediaBrowserCompat$ItemReceiver = lexicographicalComparator;
    }

    private static C5462x904c0edb MediaBrowserCompat$ItemReceiver(zziu.zzb zzb) {
        List list;
        getFilesDir getfilesdir;
        List<zzjx.zzc> list2;
        String str;
        List<zzjx.zzc> list3;
        String str2 = zzb.IconCompatParcelizer;
        String str3 = zzb.MediaBrowserCompat$CustomActionResultReceiver;
        for (zzjx.zzc zzc : zzb.MediaBrowserCompat$ItemReceiver) {
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(zzc.IconCompatParcelizer, zzb.read, false)) {
                getFilesDir read = read(zzc);
                Iterable<zzjx.zzc> iterable = zzb.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                int i = 10;
                Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
                for (zzjx.zzc read2 : iterable) {
                    arrayList.add(read(read2));
                }
                List list4 = (List) arrayList;
                zzjx.zze.zzb zzb2 = zzb.write;
                if (zzb2 == null || (list3 = zzb2.write) == null) {
                    list = null;
                } else {
                    Iterable<zzjx.zzc> iterable2 = list3;
                    onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
                    if (iterable2 instanceof Collection) {
                        i = ((Collection) iterable2).size();
                    }
                    Collection arrayList2 = new ArrayList(i);
                    for (zzjx.zzc read3 : iterable2) {
                        arrayList2.add(read(read3));
                    }
                    list = (List) arrayList2;
                }
                zzjx.zze.zzb zzb3 = zzb.write;
                if (!(zzb3 == null || (list2 = zzb3.write) == null)) {
                    for (zzjx.zzc zzc2 : list2) {
                        String str4 = zzc2.IconCompatParcelizer;
                        zzjx.zze.zzb zzb4 = zzb.write;
                        if (zzb4 != null) {
                            str = zzb4.MediaBrowserCompat$ItemReceiver;
                        } else {
                            str = null;
                        }
                        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str4, str, false)) {
                            if (zzc2 != null) {
                                getfilesdir = read(zzc2);
                                return new C5462x904c0edb(str2, str3, read, list4, list, getfilesdir);
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                getfilesdir = null;
                return new C5462x904c0edb(str2, str3, read, list4, list, getfilesdir);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final writeSessionPartsToSessionFile MediaBrowserCompat$CustomActionResultReceiver(zzfy.zzg zzg) {
        zzfy.zzg zzg2 = zzg;
        onGetStartedClick.write((Object) zzg2, "landing");
        String str = zzg2.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = zzg2.write;
        SignedBytes.LexicographicalComparator lexicographicalComparator = this.MediaBrowserCompat$ItemReceiver;
        String str3 = zzg2.read.IconCompatParcelizer;
        if (str3 == null) {
            str3 = "";
        }
        String c_ = lexicographicalComparator.mo26549c_(str3);
        onGetStartedClick.IconCompatParcelizer((Object) c_, "baseAssetsDisplayMapper.…simulator.imageUrl ?: \"\")");
        String str4 = zzg2.read.MediaDescriptionCompat;
        if (str4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        String str5 = zzg2.read.MediaBrowserCompat$ItemReceiver;
        if (str5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        double d = zzg2.read.MediaBrowserCompat$SearchResultReceiver;
        double d2 = zzg2.read.MediaBrowserCompat$CustomActionResultReceiver;
        double d3 = zzg2.read.RatingCompat;
        Iterable<zziu.zzb> iterable = zzg2.read.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (zziu.zzb MediaBrowserCompat$ItemReceiver2 : iterable) {
            arrayList.add(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2));
        }
        return new writeSessionPartsToSessionFile(str, str2, c_, str4, str5, d, d2, d3, (List) arrayList, zzg2.read.write, IconCompatParcelizer(zzg2.read.MediaBrowserCompat$MediaItem));
    }

    private static getFilesDir read(zzjx.zzc zzc) {
        onGetStartedClick.write((Object) zzc, "model");
        String str = zzc.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        String str2 = zzc.MediaBrowserCompat$ItemReceiver;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return new getFilesDir(str, str2);
    }
}
