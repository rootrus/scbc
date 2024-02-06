package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyProvideIDocumentBaseOverlayView */
public final /* synthetic */ class proxyProvideIDocumentBaseOverlayView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ proxyProvideIDocumentBaseOverlayView(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiPassportExtractor_Factory) obj).read((List<String>) this.write);
    }
}
