package p040o;

import java.util.List;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.nX */
public final /* synthetic */ class C5025nX implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C5025nX(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getDocumentFramingError.write) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
