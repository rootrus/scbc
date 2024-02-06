package p040o;

import p040o.AppStatsSqLiteDs;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsExportResults */
public final /* synthetic */ class AppStatsExportResults implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ doWriteToLog read;

    public /* synthetic */ AppStatsExportResults(doWriteToLog dowritetolog) {
        this.read = dowritetolog;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSqLiteDs.C3040a.C30413.IconCompatParcelizer(this.read, (ICheckExtractorListener$MediaBrowserCompat$ItemReceiver) obj);
    }
}
