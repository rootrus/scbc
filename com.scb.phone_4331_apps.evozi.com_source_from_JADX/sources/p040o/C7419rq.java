package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.rq */
public final /* synthetic */ class C7419rq implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution write;

    public /* synthetic */ C7419rq(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.write = execution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }
}
