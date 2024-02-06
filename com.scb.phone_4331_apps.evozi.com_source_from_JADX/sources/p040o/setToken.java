package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.setToken */
public final /* synthetic */ class setToken implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseFile MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setToken(parseFile parsefile) {
        this.MediaBrowserCompat$ItemReceiver = parsefile;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
