package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.JustCapturedListener */
public final /* synthetic */ class JustCapturedListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ valueOrNull write;

    public /* synthetic */ JustCapturedListener(valueOrNull valueornull) {
        this.write = valueornull;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBottomEdgeTearWidth) obj).write(this.write);
    }
}
