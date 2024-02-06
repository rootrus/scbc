package p040o;

import p040o.zzca;

/* renamed from: o.zzhu */
public final /* synthetic */ class zzhu implements DataPrivacyManagementDeepLinkActivity {
    private final /* synthetic */ zzca.zzf.zza IconCompatParcelizer;
    private final /* synthetic */ zzjv write;

    public /* synthetic */ zzhu(zzjv zzjv, zzca.zzf.zza zza) {
        this.write = zzjv;
        this.IconCompatParcelizer = zza;
    }

    public final void read() {
        this.write.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
    }
}
