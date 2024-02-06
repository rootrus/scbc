package p040o;

import java.util.List;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.setResizedResolution */
public final /* synthetic */ class setResizedResolution implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;

    public /* synthetic */ setResizedResolution(List list) {
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.write) obj).IconCompatParcelizer((List<String>) this.IconCompatParcelizer);
    }
}
