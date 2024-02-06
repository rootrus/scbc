package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.mn */
public final /* synthetic */ class C10057mn implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ILocationSourceDelegate MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C10057mn(ILocationSourceDelegate iLocationSourceDelegate) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iLocationSourceDelegate;
    }

    public final void IconCompatParcelizer(Object obj) {
        ILocationSourceDelegate iLocationSourceDelegate = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getBarcodes) obj).IconCompatParcelizer(iLocationSourceDelegate.write.write, iLocationSourceDelegate.write.read);
    }
}
