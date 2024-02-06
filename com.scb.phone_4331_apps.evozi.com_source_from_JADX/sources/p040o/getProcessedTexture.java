package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getProcessedTexture */
public final /* synthetic */ class getProcessedTexture implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;

    public /* synthetic */ getProcessedTexture(List list) {
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv$MediaBrowserCompat$ItemReceiver) obj).read(this.IconCompatParcelizer);
    }
}
