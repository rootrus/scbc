package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.onImageProcessed */
public final /* synthetic */ class onImageProcessed implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ onImageProcessed(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((isUndefined) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
