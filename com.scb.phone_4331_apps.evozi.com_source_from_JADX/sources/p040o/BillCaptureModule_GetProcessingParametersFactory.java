package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetProcessingParametersFactory */
public final /* synthetic */ class BillCaptureModule_GetProcessingParametersFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ IBillDeserializer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean read;
    private final /* synthetic */ parseSession write;

    public /* synthetic */ BillCaptureModule_GetProcessingParametersFactory(IBillDeserializer iBillDeserializer, parseSession parsesession, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iBillDeserializer;
        this.write = parsesession;
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        IBillDeserializer iBillDeserializer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getTopLeftCornerWidth.ListMenuItemView) obj).IconCompatParcelizer(this.write, iBillDeserializer.IconCompatParcelizer, this.read);
    }
}
