package p040o;

import p040o.CrashlyticsReport;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.setFaceRectThickness */
public final /* synthetic */ class setFaceRectThickness implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application read;

    public /* synthetic */ setFaceRectThickness(CrashlyticsReport.Session.Event.Application application) {
        this.read = application;
    }

    public final void IconCompatParcelizer(Object obj) {
        C5174qT.write(this.read, (ServerProjectProvider.C70706) obj);
    }
}
