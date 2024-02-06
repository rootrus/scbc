package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.AnalyticsConnectorReceiver;
import p040o.zzag;

/* renamed from: o.greatestOf */
public final class greatestOf extends constrainedSetMultimap<zzag.zzc, AnalyticsConnectorReceiver> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        zzag.zzc zzc = (zzag.zzc) obj;
        AnalyticsConnectorReceiver.read read = new AnalyticsConnectorReceiver.read();
        read.MediaBrowserCompat$CustomActionResultReceiver = zzc.MediaSessionCompat$ResultReceiverWrapper;
        read.MediaBrowserCompat$ItemReceiver = zzc.MediaBrowserCompat$CustomActionResultReceiver;
        read.read = zzc.MediaMetadataCompat;
        read.IconCompatParcelizer = zzc.MediaDescriptionCompat;
        return new AnalyticsConnectorReceiver(read, (byte) 0);
    }

    @HmlPinActivity
    public greatestOf(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
