package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nL$MediaBrowserCompat$CustomActionResultReceiver */
public final class nL$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<cancelLoadAllVariants> {
    private /* synthetic */ C5011nL IconCompatParcelizer;

    public nL$MediaBrowserCompat$CustomActionResultReceiver(C5011nL nLVar) {
        this.IconCompatParcelizer = nLVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        this.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem();
        ((cancelLoadAllVariants) obj).write();
    }
}
