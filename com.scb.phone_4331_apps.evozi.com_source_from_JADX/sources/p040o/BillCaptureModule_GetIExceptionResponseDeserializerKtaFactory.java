package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory */
public final /* synthetic */ class BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ reportToJson read;

    public /* synthetic */ BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory(reportToJson reporttojson) {
        this.read = reporttojson;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setIcon) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
