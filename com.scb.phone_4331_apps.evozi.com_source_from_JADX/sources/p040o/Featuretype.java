package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.Featuretype */
public final /* synthetic */ class Featuretype implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ Featuretype write = new Featuretype();

    private /* synthetic */ Featuretype() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAdditionalRightScanLinesWidth) obj).write();
    }
}
