package p040o;

import p040o.zzjx;

/* renamed from: o.getContent */
public final /* synthetic */ class getContent implements DataPrivacyManagementDeepLinkActivity {
    private final /* synthetic */ zzjv MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ zzjx.zze write;

    public /* synthetic */ getContent(zzjv zzjv, zzjx.zze zze) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzjv;
        this.write = zze;
    }

    public final void read() {
        this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo.MediaSessionCompat$ResultReceiverWrapper = this.write;
    }
}
