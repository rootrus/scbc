package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.header */
public final /* synthetic */ class header implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setVersion MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ header(setVersion setversion) {
        this.MediaBrowserCompat$ItemReceiver = setversion;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerKta) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
