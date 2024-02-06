package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.tryRestoreState */
public final /* synthetic */ class tryRestoreState implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.FilesPayload.File write;

    public /* synthetic */ tryRestoreState(CrashlyticsReport.FilesPayload.File file) {
        this.write = file;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setPadding) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }
}
