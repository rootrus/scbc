package p040o;

import p040o.IdCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.assertInstantiable */
public final /* synthetic */ class assertInstantiable implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;

    public /* synthetic */ assertInstantiable(String str) {
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        SqlDateTypeAdapter.write(this.read, (IdCaptureModule.OnDeviceExceptionResponseDeserializer) obj);
    }
}
