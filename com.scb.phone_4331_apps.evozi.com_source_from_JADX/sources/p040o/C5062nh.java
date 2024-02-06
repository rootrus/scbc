package p040o;

import p040o.Futures;
import p040o.getImageDimensionMismatch;
import p040o.writeUInt64NoTag;

/* renamed from: o.nh */
public final /* synthetic */ class C5062nh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34104 read;

    public /* synthetic */ C5062nh(Futures.C34104 r1) {
        this.read = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getImageDimensionMismatch.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.read);
    }
}
