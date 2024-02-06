package p040o;

import p040o.getDetectorBasedCropper;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBarCodeCaptureView */
public final /* synthetic */ class getBarCodeCaptureView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onEnterAmbient IconCompatParcelizer;
    private final /* synthetic */ getDetectorBasedCropper.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getBarCodeCaptureView(getDetectorBasedCropper.IconCompatParcelizer iconCompatParcelizer, onEnterAmbient onenterambient) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.IconCompatParcelizer = onenterambient;
    }

    public final void IconCompatParcelizer(Object obj) {
        getDetectorBasedCropper.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((KtaCheckExtractor) obj).read(getDetectorBasedCropper.this.MediaDescriptionCompat.IconCompatParcelizer(this.IconCompatParcelizer, getDetectorBasedCropper.this.IconCompatParcelizer));
    }
}
