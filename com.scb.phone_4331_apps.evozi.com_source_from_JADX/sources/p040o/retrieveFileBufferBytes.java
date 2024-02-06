package p040o;

import java.util.List;
import p040o.CheckExtractor_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.retrieveFileBufferBytes */
public final /* synthetic */ class retrieveFileBufferBytes implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;

    public /* synthetic */ retrieveFileBufferBytes(List list) {
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractor_MembersInjector.read) obj).write(this.IconCompatParcelizer);
    }
}
