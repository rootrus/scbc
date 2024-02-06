package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyGetIExceptionResponseDeserializerKta */
public final /* synthetic */ class proxyGetIExceptionResponseDeserializerKta implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ IBillExtractorListener write;

    public /* synthetic */ proxyGetIExceptionResponseDeserializerKta(IBillExtractorListener iBillExtractorListener) {
        this.write = iBillExtractorListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        IBillExtractorListener iBillExtractorListener = this.write;
        ((getTopLeftCornerWidth.setIcon) obj).read(iBillExtractorListener.MediaDescriptionCompat, iBillExtractorListener.f3156x50fd9e4a);
    }
}
