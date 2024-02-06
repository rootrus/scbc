package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetElement */
public final /* synthetic */ class nativeGetElement implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeGetRows read;

    public /* synthetic */ nativeGetElement(nativeGetRows nativegetrows) {
        this.read = nativegetrows;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIIdExtractionServerOnDeviceFactory) obj).read(nativeGetRows.read(this.read.read));
    }
}
