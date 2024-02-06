package p040o;

import java.util.List;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jL */
public final /* synthetic */ class C4850jL implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ C4850jL(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStrip.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver((List<Integer>) this.write);
    }
}
