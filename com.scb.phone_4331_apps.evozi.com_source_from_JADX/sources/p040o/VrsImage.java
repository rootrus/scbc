package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.VrsImage */
public final /* synthetic */ class VrsImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ adornBoundary read;

    public /* synthetic */ VrsImage(adornBoundary adornboundary) {
        this.read = adornboundary;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetUriKtaFactory) obj).IconCompatParcelizer(this.read.read);
    }
}
