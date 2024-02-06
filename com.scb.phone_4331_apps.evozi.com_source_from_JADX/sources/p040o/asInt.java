package p040o;

import p040o.getSecondPassTexelHeightUniform;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.asInt */
public final /* synthetic */ class asInt implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSecondPassTexelHeightUniform.C46521 IconCompatParcelizer;
    private final /* synthetic */ access$1900 write;

    public /* synthetic */ asInt(getSecondPassTexelHeightUniform.C46521 r1, access$1900 access_1900) {
        this.IconCompatParcelizer = r1;
        this.write = access_1900;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform.C46521 r0 = this.IconCompatParcelizer;
        ((setCvv.MediaDescriptionCompat) obj).IconCompatParcelizer(getSecondPassTexelHeightUniform.this.IconCompatParcelizer.IconCompatParcelizer(this.write));
    }
}
