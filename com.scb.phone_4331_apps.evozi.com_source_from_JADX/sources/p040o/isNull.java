package p040o;

import p040o.zzct;

/* renamed from: o.isNull */
public final /* synthetic */ class isNull implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzjv MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isNull(zzjv zzjv) {
        this.MediaBrowserCompat$ItemReceiver = zzjv;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.IconCompatParcelizer((getSize) obj, zzct.zza.CONSUMER);
    }
}
