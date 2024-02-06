package p040o;

import p040o.Futures;
import p040o.getTransit;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRamSizeThreshold */
public final /* synthetic */ class setRamSizeThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34051 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setRamSizeThreshold(Futures.C34051 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTransit.IconCompatParcelizer) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
