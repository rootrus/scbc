package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.aF */
public final /* synthetic */ class C3968aF implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getGeoDataClient write;

    public /* synthetic */ C3968aF(getGeoDataClient getgeodataclient) {
        this.write = getgeodataclient;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule.RttiExceptionResponseDeserializer) obj).write(this.write);
    }
}
