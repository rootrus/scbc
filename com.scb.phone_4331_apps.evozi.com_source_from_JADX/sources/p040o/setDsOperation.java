package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDsOperation */
public final /* synthetic */ class setDsOperation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setDsOperation(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsReportSessionOperatingSystemEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
