package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.sJ$MediaBrowserCompat$ItemReceiver */
final class sJ$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.AppCompatDialogFragment> {
    private /* synthetic */ C7435sJ MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution write;

    sJ$MediaBrowserCompat$ItemReceiver(C7435sJ sJVar, CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sJVar;
        this.write = execution;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.AppCompatDialogFragment) obj).write(this.write, this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer ? "deeplink" : "");
    }
}
