package p040o;

import p040o.getBottomRightCornerHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.fj */
public final /* synthetic */ class C4428fj implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getArch read;

    public /* synthetic */ C4428fj(getArch getarch) {
        this.read = getarch;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBottomRightCornerHeight.IconCompatParcelizer) obj).write(this.read);
    }
}
