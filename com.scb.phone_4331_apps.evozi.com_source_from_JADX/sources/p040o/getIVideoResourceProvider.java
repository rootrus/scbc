package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIVideoResourceProvider */
public final /* synthetic */ class getIVideoResourceProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ce$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getIVideoResourceProvider(ce$MediaBrowserCompat$ItemReceiver ce_mediabrowsercompat_itemreceiver, Throwable th) {
        this.IconCompatParcelizer = ce_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        ce$MediaBrowserCompat$ItemReceiver ce_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        ((CheckExtractorResponse) obj).write(ce_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
