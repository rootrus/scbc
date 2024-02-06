package p040o;

import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jx */
public final /* synthetic */ class C4883jx implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ kb$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ C4883jx(kb$MediaBrowserCompat$ItemReceiver kb_mediabrowsercompat_itemreceiver) {
        this.read = kb_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStrip.IconCompatParcelizer) obj).write(this.read.read.read.MediaBrowserCompat$MediaItem);
    }
}
