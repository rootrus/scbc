package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMinFaceSize */
public final /* synthetic */ class getMinFaceSize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getMinFaceSize(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAddress5) obj).read((List<normalize>) this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
