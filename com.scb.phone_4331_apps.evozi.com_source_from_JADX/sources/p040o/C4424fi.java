package p040o;

import p040o.C4433fn;
import p040o.getBottomRightCornerHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.fi */
public final /* synthetic */ class C4424fi implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzsj IconCompatParcelizer;
    private final /* synthetic */ C4433fn.read read;

    public /* synthetic */ C4424fi(C4433fn.read read2, zzsj zzsj) {
        this.read = read2;
        this.IconCompatParcelizer = zzsj;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.write(this.IconCompatParcelizer, (getBottomRightCornerHeight.write) obj);
    }
}
