package p040o;

import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jA */
public final /* synthetic */ class C4843jA implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ kb$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ C4843jA(kb$MediaBrowserCompat$ItemReceiver kb_mediabrowsercompat_itemreceiver) {
        this.read = kb_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStrip.IconCompatParcelizer) obj).read("03".equalsIgnoreCase(this.read.read.read.RatingCompat));
    }
}
