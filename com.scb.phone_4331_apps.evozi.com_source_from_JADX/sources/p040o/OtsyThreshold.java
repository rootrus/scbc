package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.OtsyThreshold */
public final /* synthetic */ class OtsyThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ cacheUserData write;

    public /* synthetic */ OtsyThreshold(cacheUserData cacheuserdata) {
        this.write = cacheuserdata;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassProgram.IconCompatParcelizer(this.write, (setCvv.IconCompatParcelizer) obj);
    }
}
