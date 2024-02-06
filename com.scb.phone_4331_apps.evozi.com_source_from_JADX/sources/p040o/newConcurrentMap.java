package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.Calendar;
import p040o.Iterables;
import p040o.SimpleTimeLimiter;

/* renamed from: o.newConcurrentMap */
public final class newConcurrentMap extends constrainedSetMultimap<setDaemon, SimpleTimeLimiter.C37891.C37901> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return IconCompatParcelizer((setDaemon) obj, false);
    }

    @HmlPinActivity
    public newConcurrentMap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final SimpleTimeLimiter.C37891.C37901 IconCompatParcelizer(setDaemon setdaemon, boolean z) {
        SimpleTimeLimiter.C37891.C37901 MediaBrowserCompat$CustomActionResultReceiver = SimpleTimeLimiter.C37891.C37901.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35273.RatingCompat.layout_bulk_transfer_summary_screenshot, String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bulk_transfer_summary_screenshot_filename), new Object[]{String.valueOf(Calendar.getInstance().getTimeInMillis())}), z);
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = setdaemon.RatingCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = setdaemon.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = setdaemon.MediaSessionCompat$QueueItem;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = setdaemon.PlaybackStateCompat;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = setdaemon.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = setdaemon.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = setdaemon.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = setdaemon.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.read = setdaemon.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = setdaemon.ParcelableVolumeInfo;
        MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = setdaemon.MediaSessionCompat$ResultReceiverWrapper;
        MediaBrowserCompat$CustomActionResultReceiver.f2785x50fd9e4a = MediaBrowserCompat$ItemReceiver(setdaemon.MediaMetadataCompat, new filterEntries(this));
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
