package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.addPage */
public final /* synthetic */ class addPage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean write;

    public /* synthetic */ addPage(boolean z) {
        this.write = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIParametersFactory) obj).write(!this.write);
    }
}
