package p040o;

import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.excludeClass */
public final /* synthetic */ class excludeClass implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes write;

    public /* synthetic */ excludeClass(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIJsonExactionHelperKtaFactory.write) obj).read(this.write);
    }
}
