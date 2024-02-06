package p040o;

import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6468xef3b5654 implements keys {
    private final count$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    private C6468xef3b5654() {
    }

    @HmlPinActivity
    public C6468xef3b5654(count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = count_mediabrowsercompat_customactionresultreceiver;
    }

    public final void read() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = null;
    }

    public final String write() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getString("com.scb.phone.pref.key.API_REFRESH", "");
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getString("randomDeviceId", "");
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getInt("REGISTRATION_FLOW_FLAG", 0);
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getBoolean("com.scb.phone.pref.key.WIREMOCK", false);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        if (!TextUtils.isEmpty(str)) {
            count_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = str;
        }
    }

    public final void write(zzro zzro) {
        count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        count_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = zzro;
        count_mediabrowsercompat_customactionresultreceiver.read = SystemClock.elapsedRealtime();
    }

    public final void read(int i) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.edit().putInt("REGISTRATION_FLOW_FLAG", i).apply();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.MediaBrowserCompat$ItemReceiver.write = str;
    }

    public final void read(boolean z) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.edit().putBoolean("com.scb.phone.pref.key.WIREMOCK", z).apply();
    }

    public final void write(PlaceAutocomplete placeAutocomplete) {
        count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        count_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = placeAutocomplete.write;
        count_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.edit().putString("com.scb.phone.pref.key.API_REFRESH", placeAutocomplete.IconCompatParcelizer).commit();
    }
}
