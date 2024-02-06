package p040o;

import p040o.CrashlyticsReport;
import p040o.KtaBillExtractor;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyGetIExceptionResponseDeserializerRtti */
public final /* synthetic */ class proxyGetIExceptionResponseDeserializerRtti implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application read;

    public /* synthetic */ proxyGetIExceptionResponseDeserializerRtti(CrashlyticsReport.Session.Event.Application application) {
        this.read = application;
    }

    public final void IconCompatParcelizer(Object obj) {
        KtaBillExtractor.IconCompatParcelizer.read(this.read, (getTopLeftCornerWidth.setItemInvoker) obj);
    }
}
