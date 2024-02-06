package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetPageIndex */
public final /* synthetic */ class nativeGetPageIndex implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ standardStartAndWait MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeGetPageIndex(standardStartAndWait standardstartandwait) {
        this.MediaBrowserCompat$CustomActionResultReceiver = standardstartandwait;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
