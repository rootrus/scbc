package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory */
public final /* synthetic */ class BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ IBillExtractorListener read;

    public /* synthetic */ BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory(IBillExtractorListener iBillExtractorListener) {
        this.read = iBillExtractorListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setIcon) obj).read(this.read.MediaMetadataCompat);
    }
}
