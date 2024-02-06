package p040o;

import java.util.List;
import p040o.CheckExtractor_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.releaseImage */
public final /* synthetic */ class releaseImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;

    public /* synthetic */ releaseImage(List list) {
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractor_MembersInjector.read) obj).write(this.IconCompatParcelizer);
    }
}
