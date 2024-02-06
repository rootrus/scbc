package p040o;

import p040o.IIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.thresholdReached */
public final /* synthetic */ class thresholdReached implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ thresholdReached write = new thresholdReached();

    private /* synthetic */ thresholdReached() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IIdExtractor.write) obj).read();
    }
}
