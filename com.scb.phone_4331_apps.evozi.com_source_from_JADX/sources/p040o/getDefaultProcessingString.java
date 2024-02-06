package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDefaultProcessingString */
public final /* synthetic */ class getDefaultProcessingString implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseEventSignal MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDefaultProcessingString(parseEventSignal parseeventsignal) {
        this.MediaBrowserCompat$ItemReceiver = parseeventsignal;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setShortcut) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
