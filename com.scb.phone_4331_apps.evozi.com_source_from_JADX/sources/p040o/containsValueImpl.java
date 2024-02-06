package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.containsValueImpl */
public final class containsValueImpl extends constrainedSetMultimap<zzxl, C10865shutdown> {
    private C10843immutableEntry IconCompatParcelizer;

    @HmlPinActivity
    public containsValueImpl(Resources resources, SharedPreferences sharedPreferences, C10843immutableEntry immutableentry) {
        super(resources, sharedPreferences);
        this.IconCompatParcelizer = immutableentry;
    }

    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public final C10865shutdown MediaBrowserCompat$ItemReceiver(zzxl zzxl) {
        C10865shutdown IconCompatParcelizer2 = C10865shutdown.IconCompatParcelizer();
        IconCompatParcelizer2.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.recipients_counter, new Object[]{zzxl.MediaBrowserCompat$CustomActionResultReceiver});
        IconCompatParcelizer2.read = zzxl.MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(zzxl.write);
        return IconCompatParcelizer2;
    }
}
