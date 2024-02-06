package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.sW */
public final /* synthetic */ class C10141sW implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C10141sW(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.MediaBrowserCompat$CustomActionResultReceiver = execution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.PlaybackStateCompat) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
