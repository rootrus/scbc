package p040o;

import p040o.CrashlyticsReport;
import p040o.IdCaptureBackActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGenericComponentType$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4577xa9b053c3<V> implements writeUInt64NoTag.IconCompatParcelizer<IdCaptureBackActivity_MembersInjector.IconCompatParcelizer> {
    private /* synthetic */ CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver;

    public C4577xa9b053c3(CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.MediaBrowserCompat$ItemReceiver = builder;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdCaptureBackActivity_MembersInjector.IconCompatParcelizer) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
