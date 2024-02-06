package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.CrashlyticsReport;

/* renamed from: o.getTicker */
public final class getTicker extends constrainedSetMultimap<zzxd, CrashlyticsReport.FilesPayload.File.Builder> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        zzxd zzxd = (zzxd) obj;
        CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReport.FilesPayload.File.Builder.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = true;
        MediaBrowserCompat$CustomActionResultReceiver.Keep = zzxd.write;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = zzxd.read;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    @HmlPinActivity
    public getTicker(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
