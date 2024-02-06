package p040o;

import java.util.List;
import p040o.CrashlyticsReport;
import p040o.getDocumentSkew;
import p040o.writeUInt64NoTag;

/* renamed from: o.gI */
public final /* synthetic */ class C4452gI implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4452gI(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getDocumentSkew.write) obj).read((List<CrashlyticsReport.Session.Builder>) this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
