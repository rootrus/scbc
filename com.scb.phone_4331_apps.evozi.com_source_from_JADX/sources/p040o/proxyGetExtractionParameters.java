package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyGetExtractionParameters */
public final /* synthetic */ class proxyGetExtractionParameters implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ IBillExtractorListener write;

    public /* synthetic */ proxyGetExtractionParameters(IBillExtractorListener iBillExtractorListener) {
        this.write = iBillExtractorListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setIcon) obj).read(this.write.MediaBrowserCompat$ItemReceiver);
    }
}
