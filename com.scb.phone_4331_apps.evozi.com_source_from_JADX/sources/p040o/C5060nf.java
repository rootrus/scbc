package p040o;

import p040o.getImageDimensionMismatch;
import p040o.writeUInt64NoTag;

/* renamed from: o.nf */
public final /* synthetic */ class C5060nf implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setStartCap MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C5060nf(setStartCap setstartcap) {
        this.MediaBrowserCompat$ItemReceiver = setstartcap;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getImageDimensionMismatch.IconCompatParcelizer) obj).read(this.MediaBrowserCompat$ItemReceiver.write);
    }
}
