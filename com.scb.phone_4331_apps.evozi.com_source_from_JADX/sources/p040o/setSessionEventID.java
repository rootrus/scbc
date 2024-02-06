package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSessionEventID */
public final /* synthetic */ class setSessionEventID implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ErrorInfo MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setSessionEventID(ErrorInfo errorInfo, AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = errorInfo;
        this.MediaBrowserCompat$ItemReceiver = crashlyticsReportSessionUserEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(this.MediaBrowserCompat$ItemReceiver, (getProject.write) obj);
    }
}
