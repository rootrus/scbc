package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.doStart */
public final class doStart extends constrainedListMultimap {
    @HmlPinActivity
    public doStart(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final getUuidUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver(useViewLifecycleInFragment useviewlifecycleinfragment, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        String str;
        setuuidfromutf8bytes.AbsActionBarView = IconCompatParcelizer(useviewlifecycleinfragment.ParcelableVolumeInfo, useviewlifecycleinfragment.MediaBrowserCompat$SearchResultReceiver, true);
        getUuidUtf8Bytes getuuidutf8bytes = new getUuidUtf8Bytes();
        if (useviewlifecycleinfragment.MediaSessionCompat$Token == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("dd MMM yyyy - HH:mm", useviewlifecycleinfragment.MediaSessionCompat$Token);
        }
        getuuidutf8bytes.MediaDescriptionCompat = str;
        getuuidutf8bytes.ParcelableVolumeInfo = useviewlifecycleinfragment.MediaSessionCompat$ResultReceiverWrapper;
        getuuidutf8bytes.MediaSessionCompat$Token = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id), new Object[]{useviewlifecycleinfragment.MediaSessionCompat$ResultReceiverWrapper});
        getuuidutf8bytes.AlertController$RecycleListView = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.review_success_bill_payment);
        getuuidutf8bytes.MediaSessionCompat$QueueItem = write(Double.valueOf(useviewlifecycleinfragment.read));
        getuuidutf8bytes.PlaybackStateCompat = setuuidfromutf8bytes;
        return getuuidutf8bytes;
    }
}
