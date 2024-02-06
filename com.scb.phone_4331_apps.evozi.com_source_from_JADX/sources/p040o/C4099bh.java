package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.bh */
public final /* synthetic */ class C4099bh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4128bz read;

    public /* synthetic */ C4099bh(C4128bz bzVar) {
        this.read = bzVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getFrontImage) obj).read(this.read.MediaBrowserCompat$ItemReceiver());
    }
}
