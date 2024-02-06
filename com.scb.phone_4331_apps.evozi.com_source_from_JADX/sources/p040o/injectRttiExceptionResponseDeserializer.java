package p040o;

import java.util.List;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.injectRttiExceptionResponseDeserializer */
public final /* synthetic */ class injectRttiExceptionResponseDeserializer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ injectRttiExceptionResponseDeserializer(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.ExpandedMenuView) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
