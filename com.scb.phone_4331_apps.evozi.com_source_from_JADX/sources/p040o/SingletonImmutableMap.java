package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsCore;
import p040o.GeofencingRequest;
import p040o.isProximityOn;

/* renamed from: o.SingletonImmutableMap */
public final class SingletonImmutableMap extends constrainedSortedSetMultimap<GeofencingRequest.Builder, CrashlyticsCore.C32473> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj, boolean z) {
        String str;
        String str2;
        String str3;
        GeofencingRequest.Builder builder = (GeofencingRequest.Builder) obj;
        if (builder.MediaSessionCompat$QueueItem == null) {
            str = "-";
        } else if (builder.MediaBrowserCompat$SearchResultReceiver) {
            str = IconCompatParcelizer("HH:mm", builder.MediaSessionCompat$QueueItem);
        } else {
            str = IconCompatParcelizer("dd MMM yyyy", builder.MediaSessionCompat$QueueItem);
        }
        if ("T".equals(builder.f2715x50fd9e4a)) {
            str2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(builder.MediaDescriptionCompat, z);
        } else if ("C".equals(builder.f2715x50fd9e4a)) {
            str2 = getICheckDeserializerRtti.IconCompatParcelizer(builder.MediaDescriptionCompat, (String) null);
        } else {
            str2 = builder.MediaDescriptionCompat;
        }
        if ("Units".equals(builder.MediaBrowserCompat$MediaItem)) {
            str3 = MediaBrowserCompat$ItemReceiver(Double.valueOf(builder.MediaMetadataCompat));
        } else {
            "Amount".equals(builder.MediaBrowserCompat$MediaItem);
            str3 = write(Double.valueOf(builder.MediaMetadataCompat));
        }
        CrashlyticsCore.C32473 MediaBrowserCompat$ItemReceiver = CrashlyticsCore.C32473.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = builder.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = builder.read;
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = builder.MediaSessionCompat$ResultReceiverWrapper;
        MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = Integer.valueOf(builder.MediaSessionCompat$Token);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = builder.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = str3;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = builder.RatingCompat;
        MediaBrowserCompat$ItemReceiver.RatingCompat = str2;
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = str;
        MediaBrowserCompat$ItemReceiver.f2694x50fd9e4a = builder.ParcelableVolumeInfo;
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = builder.AlertController$RecycleListView;
        MediaBrowserCompat$ItemReceiver.Keep = builder.Keep;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = builder.IconCompatParcelizer;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = builder.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$ItemReceiver.read = builder.write;
        return MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.SingletonImmutableMap$Values */
    public final class Values extends constrainedListMultimap {
        @HmlPinActivity
        public Values(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        public static isProximityOn write(OffsetDateTime offsetDateTime, String str) {
            String str2;
            isProximityOn.read read = isProximityOn.read();
            if (offsetDateTime == null) {
                str2 = "";
            } else {
                str2 = offsetDateTime.toString();
            }
            read.MediaBrowserCompat$ItemReceiver = CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(str2);
            read.write = str;
            return new isProximityOn(read, (byte) 0);
        }
    }

    @HmlPinActivity
    public SingletonImmutableMap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
