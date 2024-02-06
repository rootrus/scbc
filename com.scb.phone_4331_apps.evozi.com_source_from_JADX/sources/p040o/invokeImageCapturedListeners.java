package p040o;

import p040o.getVisibility;
import p040o.writeUInt64NoTag;

/* renamed from: o.invokeImageCapturedListeners */
public final /* synthetic */ class invokeImageCapturedListeners implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getVisibility.C46904 write;

    public /* synthetic */ invokeImageCapturedListeners(getVisibility.C46904 r1) {
        this.write = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractionListener) obj).write(getVisibility.this.write);
    }
}
