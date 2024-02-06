package p040o;

/* renamed from: o.LogFileManager$DirectoryProvider$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9778x802d794 implements findFragmentByWho {
    private C9778x802d794() {
    }

    public /* synthetic */ C9778x802d794(Feature feature) {
    }

    public final Object IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        getSolidColor getsolidcolor = (getSolidColor) obj;
        getPhoneNumber getphonenumber = new getPhoneNumber();
        getphonenumber.f5540x50fd9e4a = getsolidcolor.MediaSessionCompat$QueueItem;
        String str3 = "-";
        if (getsolidcolor.write != null) {
            str = getsolidcolor.write.write();
        } else {
            str = str3;
        }
        getphonenumber.IconCompatParcelizer = str;
        if (getsolidcolor.read != null) {
            str2 = getsolidcolor.read;
        } else {
            str2 = str3;
        }
        getphonenumber.read = str2;
        if (getsolidcolor.write != null) {
            str3 = getsolidcolor.write.IconCompatParcelizer();
        }
        getphonenumber.RatingCompat = str3;
        getphonenumber.MediaDescriptionCompat = getsolidcolor.MediaMetadataCompat;
        getphonenumber.MediaBrowserCompat$MediaItem = getsolidcolor.MediaBrowserCompat$SearchResultReceiver;
        getphonenumber.MediaSessionCompat$ResultReceiverWrapper = getsolidcolor.MediaDescriptionCompat;
        getphonenumber.MediaBrowserCompat$ItemReceiver = getsolidcolor.MediaBrowserCompat$CustomActionResultReceiver;
        getphonenumber.write = getsolidcolor.IconCompatParcelizer;
        getphonenumber.MediaBrowserCompat$CustomActionResultReceiver = getsolidcolor.MediaBrowserCompat$ItemReceiver;
        getphonenumber.MediaBrowserCompat$SearchResultReceiver = getsolidcolor.MediaBrowserCompat$MediaItem;
        getphonenumber.MediaSessionCompat$QueueItem = getsolidcolor.ParcelableVolumeInfo;
        getphonenumber.MediaMetadataCompat = getsolidcolor.RatingCompat;
        return getphonenumber;
    }
}
