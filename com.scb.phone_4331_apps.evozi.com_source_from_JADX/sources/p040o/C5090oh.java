package p040o;

import java.util.List;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.oh */
public final /* synthetic */ class C5090oh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onExitAmbient MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C5090oh(onExitAmbient onexitambient) {
        this.MediaBrowserCompat$ItemReceiver = onexitambient;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getDocumentFramingError.read) obj).write(false, (List<setOffset>) null, this.MediaBrowserCompat$ItemReceiver.write);
    }
}
