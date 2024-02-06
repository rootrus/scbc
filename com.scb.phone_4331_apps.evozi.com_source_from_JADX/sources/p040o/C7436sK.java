package p040o;

import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.sK */
public final /* synthetic */ class C7436sK implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder write;

    public /* synthetic */ C7436sK(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        this.write = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth$MediaSessionCompat$QueueItem) obj).read(this.write);
    }
}
