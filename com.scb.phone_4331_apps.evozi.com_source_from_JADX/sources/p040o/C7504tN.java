package p040o;

import java.util.List;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.tN */
public final /* synthetic */ class C7504tN implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C7504tN(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setCheckable) obj).read((List<Integer>) this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
