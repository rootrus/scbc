package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.asWriter */
public final class asWriter extends constrainedSortedSetMultimap<String, getContents> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj, boolean z) {
        return MediaBrowserCompat$CustomActionResultReceiver((String) obj, z);
    }

    @HmlPinActivity
    public asWriter(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static getContents MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        getContents MediaBrowserCompat$ItemReceiver = getContents.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.write = str;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(z, true, str);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = read(str);
        MediaBrowserCompat$ItemReceiver.read = false;
        return MediaBrowserCompat$ItemReceiver;
    }
}
