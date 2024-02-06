package p040o;

import com.google.gson.Gson;
import p040o.GoogleMap;
import p040o.zzge;

/* renamed from: o.getEventKey */
public final /* synthetic */ class getEventKey implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zzge.zzg MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ getEventKey(zzge.zzg zzg, String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzg;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        zzge.zzg zzg = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.read;
        C7506tP tPVar = (C7506tP) obj;
        if (zzg.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver() == 0) {
            keys keys = zzg.MediaSessionCompat$ResultReceiverWrapper;
            int i = zzge.zzg.C54921.IconCompatParcelizer[tPVar.PlaybackStateCompat$CustomAction.ordinal()];
            int i2 = 1;
            if (i == 1 || i == 2 || i == 3) {
                i2 = 2;
            }
            keys.read(i2);
        }
        zzg.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(tPVar.read);
        zzg.MediaSessionCompat$Token.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.key.USER_LOGGED_IN", false).apply();
        zzg.MediaBrowserCompat$MediaItem.write = null;
        zzg.MediaBrowserCompat$MediaItem.read = null;
        zzg.MediaSessionCompat$Token.write = str;
        zzg.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver = tPVar.MediaBrowserCompat$ItemReceiver;
        zzg.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
        GoogleMap.OnMarkerDragListener onMarkerDragListener = (GoogleMap.OnMarkerDragListener) new Gson().fromJson(tPVar.PlaybackStateCompat, GoogleMap.OnMarkerDragListener.class);
        zzg.ParcelableVolumeInfo.IconCompatParcelizer = onMarkerDragListener;
        if (onMarkerDragListener == null) {
            onMarkerDragListener = new GoogleMap.OnMarkerDragListener();
            onMarkerDragListener.setBackgroundResource = tPVar.AlertController$RecycleListView;
        } else {
            onMarkerDragListener.setBackgroundResource = tPVar.AlertController$RecycleListView;
        }
        zzg.ParcelableVolumeInfo.IconCompatParcelizer = onMarkerDragListener;
        String str2 = tPVar.MediaBrowserCompat$SearchResultReceiver;
        zzg.MediaBrowserCompat$ItemReceiver.write = null;
        zzg.MediaBrowserCompat$ItemReceiver(str2);
    }
}
