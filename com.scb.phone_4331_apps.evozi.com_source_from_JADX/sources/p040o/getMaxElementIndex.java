package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.getMaxElementIndex */
public final class getMaxElementIndex extends constrainedSetMultimap<removeGeofences, processSetComponents> {
    @HmlPinActivity
    public getMaxElementIndex(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: read */
    public final processSetComponents MediaBrowserCompat$ItemReceiver(removeGeofences removegeofences) {
        processSetComponents write = processSetComponents.write();
        write.read = removegeofences.MediaBrowserCompat$ItemReceiver;
        write.MediaBrowserCompat$CustomActionResultReceiver = removegeofences.MediaBrowserCompat$CustomActionResultReceiver;
        write.IconCompatParcelizer = write(Double.valueOf(removegeofences.write));
        write.MediaDescriptionCompat = String.valueOf(removegeofences.MediaDescriptionCompat);
        write.RatingCompat = write(Double.valueOf(removegeofences.MediaBrowserCompat$SearchResultReceiver));
        write.MediaBrowserCompat$SearchResultReceiver = String.valueOf(removegeofences.RatingCompat);
        write.MediaMetadataCompat = write(Double.valueOf(removegeofences.MediaBrowserCompat$MediaItem));
        write.MediaSessionCompat$ResultReceiverWrapper = String.valueOf(removegeofences.f2928x50fd9e4a);
        write.MediaBrowserCompat$MediaItem = String.valueOf(removegeofences.MediaMetadataCompat);
        write.ParcelableVolumeInfo = write(Double.valueOf(removegeofences.MediaSessionCompat$QueueItem));
        write.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer(removegeofences.read);
        return write;
    }
}
