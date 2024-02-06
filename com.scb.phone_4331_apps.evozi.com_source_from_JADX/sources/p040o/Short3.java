package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;

/* renamed from: o.Short3 */
public class Short3 {
    public final SharedPreferences MediaBrowserCompat$ItemReceiver;
    private final Gson read;

    @HmlPinActivity
    public Short3(SharedPreferences sharedPreferences, Gson gson) {
        this.MediaBrowserCompat$ItemReceiver = sharedPreferences;
        this.read = gson;
    }

    public final boolean write(KeyframeParser keyframeParser) {
        if (keyframeParser != null) {
            return this.MediaBrowserCompat$ItemReceiver.edit().putString("com.scb.phone.PREF_KEY_TILES", this.read.toJson((Object) keyframeParser)).commit();
        }
        onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Tile entity object is null", new Object[0]);
        return false;
    }

    public final KeyframeParser MediaBrowserCompat$ItemReceiver() {
        KeyframeParser keyframeParser = (KeyframeParser) this.read.fromJson(this.MediaBrowserCompat$ItemReceiver.getString("com.scb.phone.PREF_KEY_TILES", (String) null), KeyframeParser.class);
        return keyframeParser == null ? new KeyframeParser() : keyframeParser;
    }
}
