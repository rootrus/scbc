package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.access$2300;

/* renamed from: o.newDataOutput */
public final class newDataOutput extends RegularImmutableBiMap {
    @HmlPinActivity
    public newDataOutput(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public access$2300 IconCompatParcelizer() {
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2737ok);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = string;
        access_2300.read = access$2300.write.JUST_DISMISS;
        return access_2300;
    }
}
