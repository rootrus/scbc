package p040o;

import p040o.QuickExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.onAutoFocusMoving */
public final /* synthetic */ class onAutoFocusMoving implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;

    public /* synthetic */ onAutoFocusMoving(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractor.C70184) obj).read(this.IconCompatParcelizer);
    }
}
