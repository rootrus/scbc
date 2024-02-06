package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;

/* renamed from: o.ScriptIntrinsicLUT */
public class ScriptIntrinsicLUT {
    public final Gson MediaBrowserCompat$CustomActionResultReceiver;
    public final SharedPreferences write;

    @HmlPinActivity
    public ScriptIntrinsicLUT(SharedPreferences sharedPreferences, Gson gson) {
        this.write = sharedPreferences;
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
    }

    public final zzwi IconCompatParcelizer() {
        String string = this.write.getString("com.scb.phone.PREK_KEY_APP_CONFIG", (String) null);
        if (string != null) {
            return (zzwi) this.MediaBrowserCompat$CustomActionResultReceiver.fromJson(string, zzwi.class);
        }
        return null;
    }
}
