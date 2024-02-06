package p040o;

import java.util.List;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.oi */
public final /* synthetic */ class C5091oi implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C5091oi(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getDocumentFramingError.read) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
