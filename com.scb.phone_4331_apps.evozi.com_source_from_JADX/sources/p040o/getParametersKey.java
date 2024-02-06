package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getParametersKey */
public final /* synthetic */ class getParametersKey implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseEventSignal write;

    public /* synthetic */ getParametersKey(parseEventSignal parseeventsignal) {
        this.write = parseeventsignal;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setCheckable) obj).read(this.write);
    }
}
