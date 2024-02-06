package p040o;

import android.content.SharedPreferences;

/* renamed from: o.readObjectNoData$MediaBrowserCompat$ItemReceiver */
public final class readObjectNoData$MediaBrowserCompat$ItemReceiver {
    public final SharedPreferences IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    private readObjectNoData$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public readObjectNoData$MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences) {
        this.write = "";
        this.MediaBrowserCompat$ItemReceiver = "";
        this.IconCompatParcelizer = sharedPreferences;
        sharedPreferences.edit().remove("com.scb.phone.pref.key.LAST_ACTIVE_TIME").apply();
    }
}
