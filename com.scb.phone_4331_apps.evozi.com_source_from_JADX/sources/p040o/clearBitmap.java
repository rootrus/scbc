package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.clearBitmap */
public final /* synthetic */ class clearBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseEventSignal write;

    public /* synthetic */ clearBitmap(parseEventSignal parseeventsignal) {
        this.write = parseeventsignal;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setShortcut) obj).read(this.write);
    }
}
