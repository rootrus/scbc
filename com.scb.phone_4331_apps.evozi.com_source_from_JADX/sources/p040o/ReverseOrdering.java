package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.ReverseOrdering */
public final class ReverseOrdering extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ReverseOrdering(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final AutoValue_CrashlyticsReport_CustomAttribute read(setContentDescription setcontentdescription) {
        String str;
        String str2;
        onGetStartedClick.write((Object) setcontentdescription, "address");
        AutoValue_CrashlyticsReport_CustomAttribute read = AutoValue_CrashlyticsReport_CustomAttribute.read();
        read.Keep = setcontentdescription.MediaSessionCompat$QueueItem;
        read.IconCompatParcelizer = setcontentdescription.f2935x50fd9e4a;
        read.PlaybackStateCompat = setcontentdescription.ParcelableVolumeInfo;
        read.MediaDescriptionCompat = setcontentdescription.write;
        read.MediaSessionCompat$QueueItem = setcontentdescription.MediaMetadataCompat;
        read.RatingCompat = setcontentdescription.MediaBrowserCompat$CustomActionResultReceiver;
        read.ParcelableVolumeInfo = setcontentdescription.MediaDescriptionCompat;
        read.MediaMetadataCompat = setcontentdescription.MediaBrowserCompat$SearchResultReceiver;
        read.MediaSessionCompat$ResultReceiverWrapper = setcontentdescription.RatingCompat;
        read.f2671x50fd9e4a = setcontentdescription.MediaSessionCompat$Token;
        String str3 = null;
        if (write()) {
            zzui<String> zzui = setcontentdescription.MediaBrowserCompat$ItemReceiver;
            if (zzui != null) {
                str = (String) zzui.write;
            } else {
                str = null;
            }
        } else {
            zzui<String> zzui2 = setcontentdescription.MediaBrowserCompat$ItemReceiver;
            if (zzui2 == null || (str = (String) zzui2.read) == null) {
                str = "";
            }
        }
        read.MediaBrowserCompat$CustomActionResultReceiver = str;
        if (write()) {
            zzui<String> zzui3 = setcontentdescription.read;
            if (zzui3 != null) {
                str2 = (String) zzui3.write;
            } else {
                str2 = null;
            }
        } else {
            zzui<String> zzui4 = setcontentdescription.read;
            if (zzui4 == null || (str2 = (String) zzui4.read) == null) {
                str2 = "";
            }
        }
        read.MediaBrowserCompat$ItemReceiver = str2;
        if (write()) {
            zzui<String> zzui5 = setcontentdescription.MediaBrowserCompat$MediaItem;
            if (zzui5 != null) {
                str3 = (String) zzui5.write;
            }
        } else {
            zzui<String> zzui6 = setcontentdescription.MediaBrowserCompat$MediaItem;
            if (zzui6 == null || (str3 = (String) zzui6.read) == null) {
                str3 = "";
            }
        }
        read.MediaBrowserCompat$MediaItem = str3;
        onGetStartedClick.IconCompatParcelizer((Object) read, "EkycAddressDisplay.creat…ddressProvince?.en ?: \"\")");
        return read;
    }
}
