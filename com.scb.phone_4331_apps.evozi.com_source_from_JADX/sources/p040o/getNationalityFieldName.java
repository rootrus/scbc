package p040o;

import p040o.C4880ju;
import p040o.writeUInt64NoTag;

/* renamed from: o.getNationalityFieldName */
public final /* synthetic */ class getNationalityFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4880ju.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getNationalityFieldName(C4880ju.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractor) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.read);
    }
}
