package p040o;

import p040o.C4041ao;
import p040o.writeUInt64NoTag;

/* renamed from: o.muteAutoTorch */
public final /* synthetic */ class muteAutoTorch implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4041ao.C40424 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ muteAutoTorch(C4041ao.C40424 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IImageProcessorListener) obj).read(C4041ao.this.write);
    }
}
