package p040o;

/* renamed from: o.zzhx */
public final /* synthetic */ class zzhx implements DataPrivacyManagementDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ zzjv MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzhx(zzjv zzjv, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzjv;
        this.IconCompatParcelizer = str;
    }

    public final void read() {
        this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo.write = this.IconCompatParcelizer;
    }
}
