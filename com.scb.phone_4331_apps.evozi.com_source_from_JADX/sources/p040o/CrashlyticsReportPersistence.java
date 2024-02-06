package p040o;

import java.util.Set;
import p040o.writeUInt64NoTag;

/* renamed from: o.CrashlyticsReportPersistence */
public final /* synthetic */ class CrashlyticsReportPersistence implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Set write;

    public /* synthetic */ CrashlyticsReportPersistence(Set set) {
        this.write = set;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCar) obj).write(this.write);
    }
}
