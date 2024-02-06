package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: o.getLeftChildIndex */
public final class getLeftChildIndex extends constrainedSetMultimap<isGeodesic, isRequired> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return write((isGeodesic) obj);
    }

    @HmlPinActivity
    getLeftChildIndex(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static isRequired write(isGeodesic isgeodesic) {
        isRequired MediaBrowserCompat$ItemReceiver = isRequired.MediaBrowserCompat$ItemReceiver();
        double d = 0.0d;
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = IconCompatParcelizer(Double.valueOf(!TextUtils.isEmpty(isgeodesic.MediaMetadataCompat) ? Double.valueOf(isgeodesic.MediaMetadataCompat).doubleValue() : 0.0d));
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = isgeodesic.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = isgeodesic.read;
        if (!TextUtils.isEmpty(isgeodesic.write)) {
            d = Double.valueOf(isgeodesic.write).doubleValue();
        }
        MediaBrowserCompat$ItemReceiver.read = IconCompatParcelizer(Double.valueOf(d));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = isgeodesic.MediaBrowserCompat$ItemReceiver;
        return MediaBrowserCompat$ItemReceiver;
    }
}
