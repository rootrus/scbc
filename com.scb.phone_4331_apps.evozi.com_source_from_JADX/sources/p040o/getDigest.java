package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.getDigest */
public final class getDigest extends constrainedListMultimap {
    @HmlPinActivity
    public getDigest(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static AutoValue_CrashlyticsReport_CustomAttribute MediaBrowserCompat$ItemReceiver(animateCamera animatecamera) {
        if (animatecamera == null) {
            return null;
        }
        AutoValue_CrashlyticsReport_CustomAttribute read = AutoValue_CrashlyticsReport_CustomAttribute.read();
        read.Keep = animatecamera.MediaSessionCompat$QueueItem;
        read.PlaybackStateCompat = animatecamera.PlaybackStateCompat$CustomAction;
        read.MediaDescriptionCompat = animatecamera.MediaBrowserCompat$SearchResultReceiver;
        read.MediaSessionCompat$QueueItem = animatecamera.MediaSessionCompat$Token;
        read.RatingCompat = animatecamera.MediaBrowserCompat$CustomActionResultReceiver;
        read.ParcelableVolumeInfo = animatecamera.f2798x50fd9e4a;
        read.MediaMetadataCompat = animatecamera.MediaDescriptionCompat;
        read.MediaSessionCompat$ResultReceiverWrapper = animatecamera.MediaBrowserCompat$MediaItem;
        read.MediaBrowserCompat$CustomActionResultReceiver = animatecamera.MediaBrowserCompat$ItemReceiver;
        read.MediaBrowserCompat$ItemReceiver = animatecamera.write;
        read.MediaBrowserCompat$MediaItem = animatecamera.RatingCompat;
        read.IconCompatParcelizer = animatecamera.IconCompatParcelizer;
        read.f2671x50fd9e4a = animatecamera.MediaSessionCompat$ResultReceiverWrapper;
        read.MediaSessionCompat$Token = animatecamera.MediaMetadataCompat;
        read.read = animatecamera.read;
        read.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(animatecamera.read, false);
        return read;
    }
}
