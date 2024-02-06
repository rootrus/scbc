package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.access$2300;

/* renamed from: o.tryWeakKeys */
public class tryWeakKeys extends constrainedListMultimap {
    @HmlPinActivity
    public tryWeakKeys(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final access$2200 MediaBrowserCompat$CustomActionResultReceiver() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_email_unable_to_proceed_title);
        access_2200.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_email_unable_to_proceed_body);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2737ok);
        access_2300.read = access$2300.write.NAVIGATE_BACK;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        return access_2200;
    }
}
