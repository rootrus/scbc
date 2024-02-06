package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.cs */
public final /* synthetic */ class C4218cs implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ cy$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ zzwg read;

    public /* synthetic */ C4218cs(cy$MediaBrowserCompat$ItemReceiver cy_mediabrowsercompat_itemreceiver, zzwg zzwg) {
        this.IconCompatParcelizer = cy_mediabrowsercompat_itemreceiver;
        this.read = zzwg;
    }

    public final void IconCompatParcelizer(Object obj) {
        cy$MediaBrowserCompat$ItemReceiver cy_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        ((KtaJsonCheck.read) obj).MediaBrowserCompat$CustomActionResultReceiver(cy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.read));
    }
}
