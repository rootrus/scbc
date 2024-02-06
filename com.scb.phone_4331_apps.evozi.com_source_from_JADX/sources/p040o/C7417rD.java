package p040o;

import java.util.List;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.rD */
public final /* synthetic */ class C7417rD implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ C7417rD(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth$MediaSessionCompat$QueueItem) obj).write((List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder>) this.write);
    }
}
