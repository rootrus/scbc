package p040o;

import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver */
public final class LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver {
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;
    public final List<FundSwitchLandingActivity> MediaDescriptionCompat;
    public final List<FundSwitchLandingActivity> MediaMetadataCompat;
    public final List<FundSwitchLandingActivity> RatingCompat;
    public final Integer read;
    public final String write;

    private LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver(String str, String str2, Integer num, boolean z, int i, double d, String str3, List<FundSwitchLandingActivity> list, List<FundSwitchLandingActivity> list2, List<FundSwitchLandingActivity> list3) {
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.read = num;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$MediaItem = i;
        this.MediaBrowserCompat$SearchResultReceiver = d;
        this.MediaDescriptionCompat = list;
        this.MediaMetadataCompat = list2;
        this.RatingCompat = list3;
        this.MediaBrowserCompat$CustomActionResultReceiver = DiskLruCache.VERSION_1.equals(str3);
    }
}
