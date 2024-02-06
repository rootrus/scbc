package p040o;

import p040o.CaptureMessage;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDocumentDetectionGuidanceList */
public final /* synthetic */ class getDocumentDetectionGuidanceList implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CaptureMessage.KUIMessageOrientation MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getDocumentDetectionGuidanceList(CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        this.MediaBrowserCompat$CustomActionResultReceiver = kUIMessageOrientation;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getImageProcessingListener) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(kUIMessageOrientation.write, (String) null, kUIMessageOrientation.read, (String) null, (String) null, true, false, (String) null, 72));
    }
}
