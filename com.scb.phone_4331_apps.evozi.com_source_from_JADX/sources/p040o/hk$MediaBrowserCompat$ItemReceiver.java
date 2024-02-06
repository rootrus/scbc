package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hk$MediaBrowserCompat$ItemReceiver */
public final class hk$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C6939a.read> {
    private /* synthetic */ getCustomAttributes MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C4771hk MediaBrowserCompat$ItemReceiver;

    public hk$MediaBrowserCompat$ItemReceiver(C4771hk hkVar, getCustomAttributes getcustomattributes) {
        this.MediaBrowserCompat$ItemReceiver = hkVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = getcustomattributes;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LocalProjectProvider.C6939a.read) obj).MediaBrowserCompat$ItemReceiver(C4771hk.write(this.MediaBrowserCompat$ItemReceiver), this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }
}
