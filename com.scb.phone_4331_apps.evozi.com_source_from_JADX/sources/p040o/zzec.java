package p040o;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.zzec */
public final /* synthetic */ class zzec implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ warn MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzec(warn warn) {
        this.MediaBrowserCompat$CustomActionResultReceiver = warn;
    }

    public final Object write(Object obj) {
        List<FundSwitchLandingActivity> list;
        List<FundSwitchLandingActivity> list2;
        warn warn = this.MediaBrowserCompat$CustomActionResultReceiver;
        encodedQuery encodedquery = (encodedQuery) obj;
        if (encodedquery == null) {
            return null;
        }
        String str = encodedquery.MediaBrowserCompat$ItemReceiver;
        String str2 = encodedquery.IconCompatParcelizer;
        Integer num = encodedquery.read;
        boolean equals = DiskLruCache.VERSION_1.equals(encodedquery.MediaBrowserCompat$CustomActionResultReceiver);
        int intValue = encodedquery.MediaBrowserCompat$MediaItem.intValue();
        double doubleValue = encodedquery.MediaBrowserCompat$SearchResultReceiver.doubleValue();
        String str3 = encodedquery.write;
        if (encodedquery.MediaMetadataCompat.IconCompatParcelizer != null) {
            list = warn.read(encodedquery.MediaMetadataCompat.IconCompatParcelizer);
        } else {
            list = new ArrayList<>();
        }
        if (encodedquery.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver != null) {
            list2 = warn.read(encodedquery.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver);
        } else {
            list2 = new ArrayList<>();
        }
        return new LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver(str, str2, num, equals, intValue, doubleValue, str3, list, list2, encodedquery.MediaMetadataCompat.write != null ? warn.read(encodedquery.MediaMetadataCompat.write) : new ArrayList<>());
    }
}
