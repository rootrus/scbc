package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.bubbleUpAlternatingLevels */
public final class bubbleUpAlternatingLevels extends constrainedSetMultimap<setGeodesic, required> {
    private bubbleUp IconCompatParcelizer;

    @HmlPinActivity
    bubbleUpAlternatingLevels(Resources resources, SharedPreferences sharedPreferences, bubbleUp bubbleup) {
        super(resources, sharedPreferences);
        this.IconCompatParcelizer = bubbleup;
    }

    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public final required MediaBrowserCompat$ItemReceiver(setGeodesic setgeodesic) {
        required MediaBrowserCompat$ItemReceiver = required.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = write(setgeodesic.read);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setgeodesic.MediaBrowserCompat$ItemReceiver);
        return MediaBrowserCompat$ItemReceiver;
    }
}
