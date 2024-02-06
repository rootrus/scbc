package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFieldname */
public final /* synthetic */ class getFieldname implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getFieldname(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder) {
        this.MediaBrowserCompat$ItemReceiver = crashlyticsReportSessionApplicationOrganizationEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getProject$MediaBrowserCompat$CustomActionResultReceiver) obj).write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }
}
