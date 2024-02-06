package p040o;

import android.content.SharedPreferences;
import p040o.AbstractMultimap;

/* renamed from: o.setRootView$MediaBrowserCompat$ItemReceiver */
public final class setRootView$MediaBrowserCompat$ItemReceiver implements AbstractMultimap.Entries {
    private final SharedPreferences IconCompatParcelizer;

    private setRootView$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public setRootView$MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences) {
        this.IconCompatParcelizer = sharedPreferences;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer.getBoolean("com.scb.phone.pref.TERMS_AND_CONDITIONS_MUTUAL_FUND_REQUIRED", false);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.TERMS_AND_CONDITIONS_MUTUAL_FUND_REQUIRED", false).apply();
    }
}
