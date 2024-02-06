package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.getRowKey */
public final class getRowKey extends constrainedListMultimap {
    @HmlPinActivity
    public getRowKey(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final getUuidUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver(onStreetViewPanoramaLongClick onstreetviewpanoramalongclick, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        String str;
        setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes.ListMenuItemView, true));
        getUuidUtf8Bytes getuuidutf8bytes = new getUuidUtf8Bytes();
        if (onstreetviewpanoramalongclick.f5555x50fd9e4a == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM yyyy - HH:mm", onstreetviewpanoramalongclick.f5555x50fd9e4a);
        }
        getuuidutf8bytes.MediaDescriptionCompat = str;
        getuuidutf8bytes.ParcelableVolumeInfo = onstreetviewpanoramalongclick.MediaBrowserCompat$SearchResultReceiver;
        getuuidutf8bytes.MediaSessionCompat$Token = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id, new Object[]{onstreetviewpanoramalongclick.MediaBrowserCompat$SearchResultReceiver});
        getuuidutf8bytes.AlertController$RecycleListView = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_success_payment);
        getuuidutf8bytes.MediaSessionCompat$QueueItem = write(onstreetviewpanoramalongclick.ParcelableVolumeInfo);
        getuuidutf8bytes.PlaybackStateCompat = setuuidfromutf8bytes;
        return getuuidutf8bytes;
    }
}
