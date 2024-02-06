package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.CheckedFuture */
public final class CheckedFuture extends constrainedListMultimap {
    @HmlPinActivity
    public CheckedFuture(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static parseSession write(parseOs parseos, String str) {
        eventToJson eventtojson = new eventToJson();
        eventtojson.MediaBrowserCompat$ItemReceiver = str;
        eventtojson.MediaBrowserCompat$CustomActionResultReceiver = parseos.write;
        eventtojson.MediaDescriptionCompat = parseos.read;
        eventtojson.write = parseos.MediaBrowserCompat$ItemReceiver;
        eventtojson.read = parseos.MediaBrowserCompat$CustomActionResultReceiver;
        eventtojson.RatingCompat = IGoogleMapDelegate.OWN;
        return eventtojson;
    }
}
