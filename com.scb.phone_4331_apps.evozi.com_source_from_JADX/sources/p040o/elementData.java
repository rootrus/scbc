package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.elementData */
public final class elementData extends constrainedSetMultimap<addGeofences, initializeEagerComponents> {
    @HmlPinActivity
    public elementData(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: read */
    public final initializeEagerComponents MediaBrowserCompat$ItemReceiver(addGeofences addgeofences) {
        initializeEagerComponents IconCompatParcelizer = initializeEagerComponents.IconCompatParcelizer();
        IconCompatParcelizer.IconCompatParcelizer = addgeofences.write;
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = addgeofences.read;
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = write(Double.valueOf(addgeofences.MediaBrowserCompat$ItemReceiver));
        IconCompatParcelizer.MediaDescriptionCompat = String.valueOf(addgeofences.MediaMetadataCompat);
        IconCompatParcelizer.MediaMetadataCompat = write(Double.valueOf(addgeofences.IconCompatParcelizer));
        IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = String.valueOf(addgeofences.RatingCompat);
        IconCompatParcelizer.MediaBrowserCompat$MediaItem = write(Double.valueOf(addgeofences.MediaBrowserCompat$MediaItem));
        IconCompatParcelizer.MediaSessionCompat$Token = String.valueOf(addgeofences.MediaDescriptionCompat);
        IconCompatParcelizer.RatingCompat = String.valueOf(addgeofences.MediaBrowserCompat$SearchResultReceiver);
        IconCompatParcelizer.MediaSessionCompat$QueueItem = write(Double.valueOf(0.0d));
        IconCompatParcelizer.read = IconCompatParcelizer(addgeofences.MediaBrowserCompat$CustomActionResultReceiver);
        return IconCompatParcelizer;
    }
}
