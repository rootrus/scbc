package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetField */
public final /* synthetic */ class nativeGetField implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ nativeGetRows MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeGetField(nativeGetRows nativegetrows, int i) {
        this.MediaBrowserCompat$ItemReceiver = nativegetrows;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIIdExtractionServerOnDeviceFactory) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
