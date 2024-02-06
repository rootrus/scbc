package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getLatitude */
public final /* synthetic */ class getLatitude implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution write;

    public /* synthetic */ getLatitude(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.write = execution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }
}
