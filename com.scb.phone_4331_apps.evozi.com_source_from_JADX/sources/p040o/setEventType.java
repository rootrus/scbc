package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.setEventType */
public final /* synthetic */ class setEventType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setEventType(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsReportSessionEventLogEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1594tV) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }
}
