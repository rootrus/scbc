package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.IGPUImageHolder */
public final /* synthetic */ class IGPUImageHolder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ IGPUImageHolder(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
