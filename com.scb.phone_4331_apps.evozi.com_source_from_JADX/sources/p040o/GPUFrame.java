package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.GPUFrame */
public final /* synthetic */ class GPUFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ GPUFrame(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCardNumber) obj).MediaBrowserCompat$ItemReceiver(this.write);
    }
}
