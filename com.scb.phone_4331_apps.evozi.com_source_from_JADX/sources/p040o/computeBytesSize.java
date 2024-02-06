package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.computeBytesSize */
public final /* synthetic */ class computeBytesSize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ standardStartAndWait write;

    public /* synthetic */ computeBytesSize(standardStartAndWait standardstartandwait) {
        this.write = standardstartandwait;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).write(this.write.IconCompatParcelizer);
    }
}
