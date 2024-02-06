package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.releaseFrame */
public final /* synthetic */ class releaseFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;

    public /* synthetic */ releaseFrame(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.C6915a) obj).write(this.IconCompatParcelizer);
    }
}
