package p040o;

import java.util.List;
import p040o.getDetectorBasedCropper;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCreditCardParameters */
public final /* synthetic */ class getCreditCardParameters implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addPolyline IconCompatParcelizer;
    private final /* synthetic */ getDetectorBasedCropper.read write;

    public /* synthetic */ getCreditCardParameters(getDetectorBasedCropper.read read, addPolyline addpolyline) {
        this.write = read;
        this.IconCompatParcelizer = addpolyline;
    }

    public final void IconCompatParcelizer(Object obj) {
        getDetectorBasedCropper.read read = this.write;
        ((KtaCheckExtractor) obj).MediaBrowserCompat$CustomActionResultReceiver((List<setNdkPayload>) skipBytes.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, new readUnsignedByte(getDetectorBasedCropper.this.MediaDescriptionCompat)));
    }
}
