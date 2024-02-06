package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getElements */
public final /* synthetic */ class getElements implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getElements(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigure.write(this.MediaBrowserCompat$ItemReceiver, (IdCaptureModule_GetIParametersFactory) obj);
    }
}
