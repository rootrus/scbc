package p040o;

import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.sL */
public final /* synthetic */ class C7437sL implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder read;

    public /* synthetic */ C7437sL(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        this.read = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth$MediaSessionCompat$QueueItem) obj).write(this.read);
    }
}
