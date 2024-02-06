package p040o;

import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBcVersion */
public final /* synthetic */ class getBcVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;
    private final /* synthetic */ int write;

    public /* synthetic */ getBcVersion(List list, int i) {
        this.read = list;
        this.write = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setChecked) obj).write((dropBreadcrumb) this.read.get(this.write), this.write + 1);
    }
}
