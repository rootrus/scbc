package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetIBillDeserializerRttiFactory */
public final /* synthetic */ class BillCaptureModule_GetIBillDeserializerRttiFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ IBillExtractorListener write;

    public /* synthetic */ BillCaptureModule_GetIBillDeserializerRttiFactory(IBillExtractorListener iBillExtractorListener) {
        this.write = iBillExtractorListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setIcon) obj).read(this.write.IconCompatParcelizer);
    }
}
