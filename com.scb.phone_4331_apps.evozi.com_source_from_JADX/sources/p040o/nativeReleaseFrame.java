package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeReleaseFrame */
public final /* synthetic */ class nativeReleaseFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setStartCap MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeReleaseFrame(setStartCap setstartcap) {
        this.MediaBrowserCompat$ItemReceiver = setstartcap;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.C6915a) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.write);
    }
}
