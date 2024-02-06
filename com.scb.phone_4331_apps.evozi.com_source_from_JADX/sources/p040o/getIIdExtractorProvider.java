package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIIdExtractorProvider */
public final /* synthetic */ class getIIdExtractorProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;

    public /* synthetic */ getIIdExtractorProvider(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.write) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}
