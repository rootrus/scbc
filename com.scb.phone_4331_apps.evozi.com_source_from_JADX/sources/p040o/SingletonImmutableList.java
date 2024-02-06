package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.SingletonImmutableList */
public final class SingletonImmutableList extends constrainedListMultimap {
    @HmlPinActivity
    public SingletonImmutableList(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    public final markInitializationStarted MediaBrowserCompat$CustomActionResultReceiver(addGeofence addgeofence) {
        markInitializationStarted markinitializationstarted = new markInitializationStarted();
        markinitializationstarted.read = addgeofence.MediaBrowserCompat$ItemReceiver;
        markinitializationstarted.IconCompatParcelizer = addgeofence.read;
        markinitializationstarted.write = write(Double.valueOf(addgeofence.write));
        markinitializationstarted.MediaBrowserCompat$ItemReceiver = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage_format), new Object[]{constrainedListMultimap.write(Double.valueOf(addgeofence.write)).replaceAll("\\.0*$", ""), this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage)});
        markinitializationstarted.MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(addgeofence.IconCompatParcelizer);
        return markinitializationstarted;
    }
}
