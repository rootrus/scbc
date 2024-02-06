package p040o;

import p040o.CharMatcher;

/* renamed from: o.surfaceDestroyed */
public class surfaceDestroyed extends writeUInt64NoTag<injectRttiCheckDeserializer$MediaBrowserCompat$MediaItem> {
    public final CharMatcher.C315914 IconCompatParcelizer;
    final sortedBackingMap MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public surfaceDestroyed(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.C315914 r2, sortedBackingMap sortedbackingmap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = r2;
        this.MediaBrowserCompat$ItemReceiver = sortedbackingmap;
    }

    public void onDestroy() {
        super.onDestroy();
        CharMatcher.C315914 r0 = this.IconCompatParcelizer;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(surfaceDestroyed surfacedestroyed, LocationSettingsResult locationSettingsResult) {
        getFocusAreas getfocusareas = new getFocusAreas(surfacedestroyed, locationSettingsResult);
        if (surfacedestroyed.RatingCompat != null) {
            getfocusareas.IconCompatParcelizer(surfacedestroyed.RatingCompat);
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(surfaceDestroyed surfacedestroyed, Throwable th) {
        getGpsUsage getgpsusage = new getGpsUsage(surfacedestroyed, th);
        if (surfacedestroyed.RatingCompat != null) {
            getgpsusage.IconCompatParcelizer(surfacedestroyed.RatingCompat);
        }
    }
}
