package p040o;

import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSide */
public final /* synthetic */ class getSide implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ getSide(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setPopupCallback) obj).read((List<String>) this.write);
    }
}
