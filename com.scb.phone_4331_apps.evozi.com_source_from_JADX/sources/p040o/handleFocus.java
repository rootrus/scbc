package p040o;

import java.util.List;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.handleFocus */
public final /* synthetic */ class handleFocus implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ handleFocus(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.read) obj).read((List<setFiles>) this.write);
    }
}
