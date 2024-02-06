package p040o;

import android.content.SharedPreferences;

@HmlSetNTBPinActivity
/* renamed from: o.access$208$MediaBrowserCompat$ItemReceiver */
public final class access$208$MediaBrowserCompat$ItemReceiver {
    public SharedPreferences IconCompatParcelizer;

    private access$208$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public access$208$MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences) {
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        this.IconCompatParcelizer = sharedPreferences;
    }
}
