package p040o;

import p040o.DocumentData;

/* renamed from: o.addHeader */
public final /* synthetic */ class addHeader implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zzjv MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ addHeader(zzjv zzjv) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzjv;
    }

    public final void IconCompatParcelizer(Object obj) {
        zzjv zzjv = this.MediaBrowserCompat$CustomActionResultReceiver;
        DocumentData.Justification justification = (DocumentData.Justification) obj;
        if (justification.read != null && justification.read.MediaBrowserCompat$CustomActionResultReceiver != null) {
            zzjv.ParcelableVolumeInfo.AlertController$RecycleListView = justification.read.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }
}
