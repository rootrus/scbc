package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.aZ */
public final /* synthetic */ class C3988aZ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder IconCompatParcelizer;
    private final /* synthetic */ getOCRDescription MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C3988aZ(getOCRDescription getocrdescription, AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder) {
        this.MediaBrowserCompat$ItemReceiver = getocrdescription;
        this.IconCompatParcelizer = crashlyticsReportSessionUserEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, (getProject.write) obj);
    }
}
