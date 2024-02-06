package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.Futures;
import p040o.Iterables;

@HmlSetNTBPinActivity
/* renamed from: o.entriesInCommon */
public final class entriesInCommon extends constrainedSetMultimap<zzvx, Futures.C34072> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        String str;
        String str2;
        int i;
        zzvx zzvx = (zzvx) obj;
        Futures.C34072 MediaBrowserCompat$ItemReceiver = Futures.C34072.MediaBrowserCompat$ItemReceiver();
        if (zzvx.read == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM", zzvx.read);
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        if (isFlat.CREDIT == zzvx.MediaBrowserCompat$CustomActionResultReceiver) {
            str2 = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.credit_value), new Object[]{write(zzvx.MediaBrowserCompat$ItemReceiver)});
        } else {
            str2 = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_value), new Object[]{write(zzvx.MediaBrowserCompat$ItemReceiver)});
        }
        MediaBrowserCompat$ItemReceiver.read = str2;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = zzvx.write;
        if (isFlat.CREDIT == zzvx.MediaBrowserCompat$CustomActionResultReceiver) {
            i = Iterables.C35273.read.light_green;
        } else {
            i = Iterables.C35273.read.light_red;
        }
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = i;
        return MediaBrowserCompat$ItemReceiver;
    }

    @HmlPinActivity
    entriesInCommon(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
