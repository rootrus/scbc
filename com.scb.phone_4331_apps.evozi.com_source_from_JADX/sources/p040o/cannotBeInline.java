package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.cannotBeInline */
public final /* synthetic */ class cannotBeInline implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;

    public /* synthetic */ cannotBeInline(List list) {
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CreditCardCaptureModule_GetExtractionParametersFactory) obj).write(this.read);
    }
}
