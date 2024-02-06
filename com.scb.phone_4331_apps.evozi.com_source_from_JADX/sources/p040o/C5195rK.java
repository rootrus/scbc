package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.rK */
public final /* synthetic */ class C5195rK implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.FilesPayload.File read;

    public /* synthetic */ C5195rK(CrashlyticsReport.FilesPayload.File file) {
        this.read = file;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.read) obj).IconCompatParcelizer(this.read);
    }
}
