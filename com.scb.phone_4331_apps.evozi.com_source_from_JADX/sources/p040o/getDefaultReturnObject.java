package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDefaultReturnObject */
public final /* synthetic */ class getDefaultReturnObject implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseEventSignal MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDefaultReturnObject(parseEventSignal parseeventsignal) {
        this.MediaBrowserCompat$ItemReceiver = parseeventsignal;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setCheckable) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
