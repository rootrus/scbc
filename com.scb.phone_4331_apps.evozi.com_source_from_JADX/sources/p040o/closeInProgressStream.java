package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.closeInProgressStream */
public final /* synthetic */ class closeInProgressStream implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ standardStartAndWait MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ closeInProgressStream(standardStartAndWait standardstartandwait) {
        this.MediaBrowserCompat$ItemReceiver = standardstartandwait;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).read(this.MediaBrowserCompat$ItemReceiver, false);
    }
}
