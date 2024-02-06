package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMaxVaryingVectors */
public final /* synthetic */ class getMaxVaryingVectors implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;

    public /* synthetic */ getMaxVaryingVectors(boolean z) {
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.write) obj).read(this.read);
    }
}
