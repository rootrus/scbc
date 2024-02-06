package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IFaceDetectionResult$MediaBrowserCompat$ItemReceiver */
public final class IFaceDetectionResult$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetIExtractionServerRttiFactory> {
    private /* synthetic */ standardStartAndWait MediaBrowserCompat$CustomActionResultReceiver;

    public IFaceDetectionResult$MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait) {
        this.MediaBrowserCompat$CustomActionResultReceiver = standardstartandwait;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
