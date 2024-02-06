package p040o;

import p040o.zzk;

/* renamed from: o.encode */
public final /* synthetic */ class encode implements DirectDebitDeepLinkActivity {
    public /* synthetic */ encode(zzk.zza zza) {
    }

    public final Object write(Object obj) {
        getScale getscale = (getScale) obj;
        checkLocationSettings checklocationsettings = new checkLocationSettings();
        checklocationsettings.write = getscale.MediaBrowserCompat$ItemReceiver;
        checklocationsettings.MediaBrowserCompat$ItemReceiver = getscale.MediaBrowserCompat$CustomActionResultReceiver;
        checklocationsettings.MediaBrowserCompat$CustomActionResultReceiver = getscale.write;
        checklocationsettings.read = getscale.IconCompatParcelizer;
        checklocationsettings.IconCompatParcelizer = getscale.read;
        checklocationsettings.MediaMetadataCompat = getscale.RatingCompat;
        return checklocationsettings;
    }
}
