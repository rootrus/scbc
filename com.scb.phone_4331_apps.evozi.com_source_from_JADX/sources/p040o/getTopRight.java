package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTopRight */
public final /* synthetic */ class getTopRight implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getTopRight(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6393xc7fe0382) obj).write((List<enablePublishingAndFlushPending>) this.MediaBrowserCompat$ItemReceiver);
    }
}
