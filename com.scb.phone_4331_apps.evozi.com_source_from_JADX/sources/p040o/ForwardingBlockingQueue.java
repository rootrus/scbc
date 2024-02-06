package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.ForwardingBlockingQueue */
public final class ForwardingBlockingQueue extends constrainedSetMultimap<parseFile, parseSession> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return IconCompatParcelizer((parseFile) obj);
    }

    @HmlPinActivity
    public ForwardingBlockingQueue(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static parseSession IconCompatParcelizer(parseFile parsefile) {
        IGoogleMapDelegate iGoogleMapDelegate;
        if ("014".equalsIgnoreCase(parsefile.read.write)) {
            iGoogleMapDelegate = IGoogleMapDelegate.SCB;
        } else {
            iGoogleMapDelegate = IGoogleMapDelegate.OTHER;
        }
        eventToJson eventtojson = new eventToJson();
        eventtojson.MediaBrowserCompat$ItemReceiver = parsefile.read.write;
        eventtojson.MediaDescriptionCompat = parsefile.MediaBrowserCompat$ItemReceiver;
        eventtojson.read = parsefile.IconCompatParcelizer;
        eventtojson.RatingCompat = iGoogleMapDelegate;
        return eventtojson;
    }
}
