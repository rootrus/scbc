package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.getProcessingProfile */
public final /* synthetic */ class getProcessingProfile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder write;

    public /* synthetic */ getProcessingProfile(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder) {
        this.write = crashlyticsReportSessionUserEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getProject.IconCompatParcelizer) obj).read(this.write.read);
    }
}
