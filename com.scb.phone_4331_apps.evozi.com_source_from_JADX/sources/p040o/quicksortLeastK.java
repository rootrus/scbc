package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.quicksortLeastK */
public final class quicksortLeastK extends constrainedListMultimap {
    @HmlPinActivity
    public quicksortLeastK(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final serializeEvent MediaBrowserCompat$ItemReceiver(String str, String str2, boolean z) {
        String str3;
        serializeEvent$MediaBrowserCompat$CustomActionResultReceiver serializeevent_mediabrowsercompat_customactionresultreceiver = new serializeEvent$MediaBrowserCompat$CustomActionResultReceiver();
        serializeevent_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = str;
        serializeevent_mediabrowsercompat_customactionresultreceiver.write = str2;
        serializeevent_mediabrowsercompat_customactionresultreceiver.read = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.done_label);
        if (z) {
            str3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.easycash_success_dialog_second_button);
        } else {
            str3 = null;
        }
        serializeevent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = str3;
        return new serializeEvent(serializeevent_mediabrowsercompat_customactionresultreceiver, (byte) 0);
    }

    public final serializeEvent IconCompatParcelizer() {
        serializeEvent$MediaBrowserCompat$CustomActionResultReceiver serializeevent_mediabrowsercompat_customactionresultreceiver = new serializeEvent$MediaBrowserCompat$CustomActionResultReceiver();
        serializeevent_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.easycash_success_title_successfull_request);
        serializeevent_mediabrowsercompat_customactionresultreceiver.write = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2731x50b36e12);
        serializeevent_mediabrowsercompat_customactionresultreceiver.read = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.done_label);
        return new serializeEvent(serializeevent_mediabrowsercompat_customactionresultreceiver, (byte) 0);
    }
}
