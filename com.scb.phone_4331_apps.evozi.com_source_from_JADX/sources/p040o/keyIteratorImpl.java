package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.keyIteratorImpl */
public final class keyIteratorImpl extends constrainedSetMultimap<getGeofenceTransition, migrateLegacyId> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        getGeofenceTransition getgeofencetransition = (getGeofenceTransition) obj;
        migrateLegacyId IconCompatParcelizer = migrateLegacyId.IconCompatParcelizer();
        IconCompatParcelizer.read = getgeofencetransition.write;
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getgeofencetransition.RatingCompat;
        return IconCompatParcelizer;
    }

    @HmlPinActivity
    public keyIteratorImpl(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
