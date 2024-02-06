package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.DiscoverFundPerformanceActivity;
import p040o.HmlMoaActivity;
import p040o.zzcb;

/* renamed from: o.checkExpiration */
public final class checkExpiration extends constrainedListMultimap {
    private final String IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public checkExpiration(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language") String str) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "language");
        this.IconCompatParcelizer = str;
    }

    public final List<String> MediaBrowserCompat$CustomActionResultReceiver(List<zzcb.zzd> list) {
        onGetStartedClick.write((Object) list, "provinceAddress");
        Iterable<zzcb.zzd> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (zzcb.zzd zzd : iterable) {
            String str = zzd.write;
            String str2 = zzd.read;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) "th")) {
                str = str2;
            }
            String str3 = "";
            if (str == null) {
                str = str3;
            }
            if (str != null) {
                str3 = str;
            }
            arrayList.add(str3);
        }
        return (List) arrayList;
    }

    public final List<addDelayedShutdownHook> write(DiscoverFundPerformanceActivity.read read) {
        DiscoverFundPerformanceActivity.read read2 = read;
        onGetStartedClick.write((Object) read2, "provinceAddress");
        List<HmlMoaActivity.write.C10783write> list = read2.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        Iterable iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            HmlMoaActivity.write.C10783write write = (HmlMoaActivity.write.C10783write) it.next();
            onGetStartedClick.write((Object) write, "address");
            String str = write.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = write.MediaBrowserCompat$ItemReceiver;
            String str3 = write.MediaMetadataCompat;
            String str4 = write.read;
            String str5 = write.IconCompatParcelizer;
            String str6 = write.MediaBrowserCompat$MediaItem;
            String str7 = write.read;
            String str8 = write.MediaBrowserCompat$CustomActionResultReceiver;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) "th")) {
                str7 = str8;
            }
            String str9 = str7 == null ? "" : str7;
            String str10 = write.IconCompatParcelizer;
            String str11 = write.MediaBrowserCompat$ItemReceiver;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) "th")) {
                str10 = str11;
            }
            if (str10 == null) {
                str10 = "";
            }
            String str12 = write.MediaBrowserCompat$MediaItem;
            String str13 = write.MediaMetadataCompat;
            Iterator it2 = it;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) "th")) {
                str12 = str13;
            }
            if (str12 == null) {
                str12 = "";
            }
            arrayList.add(new addDelayedShutdownHook(str, str2, str3, str4, str5, str6, str9, str10, str12, write.write));
            it = it2;
        }
        return (List) arrayList;
    }
}
