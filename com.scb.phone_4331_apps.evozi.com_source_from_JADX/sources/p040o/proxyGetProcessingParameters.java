package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyGetProcessingParameters */
public final /* synthetic */ class proxyGetProcessingParameters implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ proxyGetProcessingParameters(int i) {
        this.IconCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setGroupDividerEnabled) obj).write(this.IconCompatParcelizer);
    }
}
