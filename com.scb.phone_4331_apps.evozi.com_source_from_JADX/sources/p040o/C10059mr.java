package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.mr */
public final /* synthetic */ class C10059mr implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onMarkerDragEnd MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C10059mr(onMarkerDragEnd onmarkerdragend) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onmarkerdragend;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBarcodes) obj).read(Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.read), Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.write));
    }
}
