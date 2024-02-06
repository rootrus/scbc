package p040o;

import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.populateSequenceNumber */
public final class populateSequenceNumber extends CLSUUID {
    public final boolean read;
    public final List<CrashlyticsReport.FilesPayload.File.Builder> write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public populateSequenceNumber(Boolean bool, String str, boolean z, List<? extends CrashlyticsReport.FilesPayload.File.Builder> list) {
        super(bool, str);
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) list, "accountDisplays");
        this.read = z;
        this.write = list;
    }
}
