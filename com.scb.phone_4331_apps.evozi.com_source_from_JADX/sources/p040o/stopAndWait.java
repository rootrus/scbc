package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.SupportStreetViewPanoramaFragment;

/* renamed from: o.stopAndWait */
public final class stopAndWait extends constrainedSetMultimap<SupportStreetViewPanoramaFragment.zza, access$lambda$2> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return read((SupportStreetViewPanoramaFragment.zza) obj);
    }

    @HmlPinActivity
    public stopAndWait(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static access$lambda$2 read(SupportStreetViewPanoramaFragment.zza zza) {
        if (zza == null) {
            return null;
        }
        access$lambda$2 MediaBrowserCompat$CustomActionResultReceiver = access$lambda$2.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = zza.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = zza.write;
        MediaBrowserCompat$CustomActionResultReceiver.read = zza.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = zza.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = zza.read;
        MediaBrowserCompat$CustomActionResultReceiver.write = zza.IconCompatParcelizer;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
