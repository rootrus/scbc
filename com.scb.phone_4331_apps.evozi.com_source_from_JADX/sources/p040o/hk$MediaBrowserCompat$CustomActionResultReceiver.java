package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hk$MediaBrowserCompat$CustomActionResultReceiver */
public final class hk$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C6939a.read> {
    private /* synthetic */ C4771hk MediaBrowserCompat$CustomActionResultReceiver;

    public hk$MediaBrowserCompat$CustomActionResultReceiver(C4771hk hkVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hkVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        newWriter unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        ((LocalProjectProvider.C6939a.read) obj).read(newWriter.MediaBrowserCompat$CustomActionResultReceiver(C4771hk.write(this.MediaBrowserCompat$CustomActionResultReceiver), C4771hk.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), "S"));
    }
}
