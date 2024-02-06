package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setLongEdgeThreshold */
public final /* synthetic */ class setLongEdgeThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ clearBitmapWithoutRecycle MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ setLongEdgeThreshold(clearBitmapWithoutRecycle clearbitmapwithoutrecycle, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = clearbitmapwithoutrecycle;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.MediaBrowserCompat$ItemReceiver;
        ((CheckExtractActivity_MembersInjector.setShortcut.read) obj).write(clearbitmapwithoutrecycle.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.NAVIGATE_BACK));
    }
}
