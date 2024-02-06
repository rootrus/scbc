package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSupportedPreviewSizes */
public final /* synthetic */ class getSupportedPreviewSizes implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getSupportedPreviewSizes(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getListener) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
