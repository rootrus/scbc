package p040o;

import p040o.CrashlyticsReport;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCancelled */
public final /* synthetic */ class setCancelled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution write;

    public /* synthetic */ setCancelled(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.write = execution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.read) obj).write(this.write);
    }
}
