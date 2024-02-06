package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nG$MediaBrowserCompat$CustomActionResultReceiver */
public final class nG$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C69342> {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public nG$MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LocalProjectProvider.C69342) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
