package p040o;

import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.populateTime */
public final class populateTime extends CLSUUID {
    public final List<CrashlyticsReport.FilesPayload.File.Builder> IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public populateTime(Boolean bool, String str, List<? extends CrashlyticsReport.FilesPayload.File.Builder> list) {
        super(bool, str);
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) list, "accountDisplays");
        this.IconCompatParcelizer = list;
    }
}
