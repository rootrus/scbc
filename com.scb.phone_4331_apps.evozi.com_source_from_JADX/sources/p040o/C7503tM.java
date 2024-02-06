package p040o;

import java.util.List;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.tM */
public final /* synthetic */ class C7503tM implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C7503tM(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setCheckable) obj).MediaBrowserCompat$ItemReceiver((List<Integer>) this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
