package p040o;

import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.excludeClassInStrategy */
public final /* synthetic */ class excludeClassInStrategy implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ toGraph write;

    public /* synthetic */ excludeClassInStrategy(toGraph tograph) {
        this.write = tograph;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIJsonExactionHelperKtaFactory.write) obj).read(this.write);
    }
}
