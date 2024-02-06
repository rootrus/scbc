package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.MapFragment;

/* renamed from: o.lexicographicalComparator */
public final class lexicographicalComparator extends constrainedListMultimap {
    @HmlPinActivity
    public lexicographicalComparator(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    static setSymbol MediaBrowserCompat$ItemReceiver(MapFragment.zzb zzb, boolean z) {
        setSymbol setsymbol = new setSymbol();
        setsymbol.MediaBrowserCompat$CustomActionResultReceiver = write(Double.valueOf(zzb.read));
        setsymbol.IconCompatParcelizer = zzb.MediaBrowserCompat$CustomActionResultReceiver;
        setsymbol.write = IconCompatParcelizer(zzb.MediaDescriptionCompat, zzb.MediaBrowserCompat$ItemReceiver, z);
        setsymbol.MediaBrowserCompat$ItemReceiver = zzb.MediaDescriptionCompat;
        setsymbol.read = zzb;
        return setsymbol;
    }

    public static setSymbol write(MapFragment.zzb zzb) {
        setSymbol setsymbol = new setSymbol();
        setsymbol.MediaBrowserCompat$CustomActionResultReceiver = write(Double.valueOf(zzb.read));
        setsymbol.IconCompatParcelizer = zzb.MediaBrowserCompat$CustomActionResultReceiver;
        setsymbol.write = write(zzb.MediaDescriptionCompat, zzb.MediaBrowserCompat$ItemReceiver);
        setsymbol.MediaBrowserCompat$ItemReceiver = zzb.MediaDescriptionCompat;
        setsymbol.read = zzb;
        return setsymbol;
    }
}
