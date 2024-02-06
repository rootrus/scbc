package p040o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.onExportAppStatsRowEvent$MediaBrowserCompat$CustomActionResultReceiver */
final class C5096x41e4b15e extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getHoles> {
    private /* synthetic */ onExportAppStatsRowEvent MediaBrowserCompat$ItemReceiver;

    private C5096x41e4b15e(onExportAppStatsRowEvent onexportappstatsrowevent) {
        this.MediaBrowserCompat$ItemReceiver = onexportappstatsrowevent;
    }

    /* synthetic */ C5096x41e4b15e(onExportAppStatsRowEvent onexportappstatsrowevent, byte b) {
        this(onexportappstatsrowevent);
    }

    public final /* synthetic */ void onNext(Object obj) {
        Context MediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
        String string = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token.getSharedPreferences("FCM_TOKEN", 0).getString("FCM_TOKEN", "");
        SharedPreferences.Editor edit = MediaMetadataCompat.getSharedPreferences("FCM_LAST_UPDATE_TOKEN", 0).edit();
        edit.putString("FCM_LAST_UPDATE_TOKEN", string);
        edit.apply();
    }
}
