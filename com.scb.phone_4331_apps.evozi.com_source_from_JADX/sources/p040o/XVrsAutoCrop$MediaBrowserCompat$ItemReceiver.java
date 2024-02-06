package p040o;

import p040o.CrashlyticsReport;
import p040o.IdWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsAutoCrop$MediaBrowserCompat$ItemReceiver */
public final class XVrsAutoCrop$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity.C69161.write> {
    private /* synthetic */ CrashlyticsReport.FilesPayload.File.Builder read;

    public XVrsAutoCrop$MediaBrowserCompat$ItemReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.read = builder;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdWorkflowActivity.C69161.write) obj).mo36953a_(this.read);
    }
}
