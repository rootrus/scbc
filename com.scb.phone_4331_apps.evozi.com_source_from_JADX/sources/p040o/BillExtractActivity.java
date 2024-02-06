package p040o;

import java.util.List;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillExtractActivity */
public final /* synthetic */ class BillExtractActivity implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ BillExtractActivity(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setTitle) obj).MediaBrowserCompat$ItemReceiver((List<parseOs>) this.MediaBrowserCompat$ItemReceiver);
    }
}
