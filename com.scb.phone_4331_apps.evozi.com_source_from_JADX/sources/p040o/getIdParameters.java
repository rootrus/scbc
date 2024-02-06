package p040o;

import p040o.CheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIdParameters */
public final /* synthetic */ class getIdParameters implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4180ch write;

    public /* synthetic */ getIdParameters(C4180ch chVar) {
        this.write = chVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractor.C63961) obj).read(this.write.MediaBrowserCompat$ItemReceiver);
    }
}
