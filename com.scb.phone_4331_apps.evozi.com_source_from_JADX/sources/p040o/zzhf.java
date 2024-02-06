package p040o;

/* renamed from: o.zzhf */
public final /* synthetic */ class zzhf implements DataPrivacyManagementDeepLinkActivity {
    private final /* synthetic */ Boolean IconCompatParcelizer;
    private final /* synthetic */ zzjv MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzhf(zzjv zzjv, Boolean bool) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzjv;
        this.IconCompatParcelizer = bool;
    }

    public final void read() {
        this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo.PlaybackStateCompat = this.IconCompatParcelizer;
    }
}
