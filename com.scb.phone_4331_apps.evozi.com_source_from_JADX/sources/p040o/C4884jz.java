package p040o;

import p040o.C4895kb;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jz */
public final /* synthetic */ class C4884jz implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4895kb.IconCompatParcelizer write;

    public /* synthetic */ C4884jz(C4895kb.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStrip.IconCompatParcelizer) obj).read(C4895kb.IconCompatParcelizer(C4895kb.this));
    }
}
