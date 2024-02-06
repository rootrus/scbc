package p040o;

import java.util.List;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCaptureActivityClass */
public final /* synthetic */ class getCaptureActivityClass implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getCaptureActivityClass(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setShortcut) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
