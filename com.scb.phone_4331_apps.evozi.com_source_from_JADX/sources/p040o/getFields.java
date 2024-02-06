package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFields */
public final /* synthetic */ class getFields implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ getFields(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigure.read(this.write, (IdCaptureModule_GetIParametersFactory) obj);
    }
}
