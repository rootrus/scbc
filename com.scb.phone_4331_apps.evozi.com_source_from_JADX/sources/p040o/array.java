package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.zzbc;

/* renamed from: o.array */
public final class array extends constrainedSetMultimap<zzbc.zze, access$2100> {
    @HmlPinActivity
    public array(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: write */
    public final access$2100 MediaBrowserCompat$ItemReceiver(zzbc.zze zze) {
        String str;
        if (zze.MediaBrowserCompat$ItemReceiver == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM yyyy - HH:mm", zze.MediaBrowserCompat$ItemReceiver);
        }
        return new access$2100(str);
    }
}
