package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.computeUInt32Size */
public final /* synthetic */ class computeUInt32Size implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getIdManager MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ computeUInt32Size(getIdManager getidmanager) {
        this.MediaBrowserCompat$ItemReceiver = getidmanager;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopEdgeTearWidth) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
