package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaView;

/* renamed from: o.shutDown */
public final class shutDown extends constrainedSetMultimap<StreetViewPanoramaView.zzb, CrashlyticsReport.Session.Event.Device> {
    @HmlPinActivity
    public shutDown(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: write */
    public final CrashlyticsReport.Session.Event.Device MediaBrowserCompat$ItemReceiver(StreetViewPanoramaView.zzb zzb) {
        if (zzb == null) {
            return null;
        }
        CrashlyticsReport.Session.Event.Device read = CrashlyticsReport.Session.Event.Device.read();
        read.f2703x50fd9e4a = zzb.MediaSessionCompat$QueueItem;
        read.MediaSessionCompat$ResultReceiverWrapper = zzb.ParcelableVolumeInfo;
        read.RatingCompat = zzb.MediaMetadataCompat;
        read.write = IconCompatParcelizer("dd MMM yyyy - HH:mm", zzb.MediaBrowserCompat$CustomActionResultReceiver);
        read.MediaBrowserCompat$ItemReceiver = zzb.write;
        read.IconCompatParcelizer = zzb.MediaBrowserCompat$ItemReceiver;
        read.MediaSessionCompat$QueueItem = zzb.MediaSessionCompat$Token;
        read.MediaBrowserCompat$CustomActionResultReceiver = write(zzb.read);
        read.MediaBrowserCompat$MediaItem = zzb.MediaBrowserCompat$MediaItem;
        read.MediaDescriptionCompat = zzb.MediaDescriptionCompat;
        OffsetDateTime offsetDateTime = zzb.MediaBrowserCompat$SearchResultReceiver;
        read.MediaMetadataCompat = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.finish_transaction), new Object[]{IconCompatParcelizer("HH:mm", offsetDateTime)});
        read.MediaBrowserCompat$SearchResultReceiver = zzb.RatingCompat;
        read.read = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.cinema_and_seat), new Object[]{zzb.MediaBrowserCompat$ItemReceiver, zzb.MediaSessionCompat$Token});
        return read;
    }

    public final String IconCompatParcelizer(OffsetDateTime offsetDateTime) {
        return String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.finish_transaction), new Object[]{IconCompatParcelizer("HH:mm", offsetDateTime)});
    }
}
