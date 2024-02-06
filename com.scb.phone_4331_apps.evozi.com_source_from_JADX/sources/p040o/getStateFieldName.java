package p040o;

import p040o.C4880ju;
import p040o.writeUInt64NoTag;

/* renamed from: o.getStateFieldName */
public final /* synthetic */ class getStateFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4880ju.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getStateFieldName(C4880ju.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4880ju.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((QuickExtractor) obj).MediaBrowserCompat$ItemReceiver(write.MediaBrowserCompat$ItemReceiver, write.MediaBrowserCompat$CustomActionResultReceiver, !write.read);
    }
}
