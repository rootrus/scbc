package p040o;

import p040o.getSecondPassTexelHeightUniform;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadProgram */
public final /* synthetic */ class loadProgram implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ cacheUserData IconCompatParcelizer;
    private final /* synthetic */ getSecondPassTexelHeightUniform.C46521 read;

    public /* synthetic */ loadProgram(getSecondPassTexelHeightUniform.C46521 r1, cacheUserData cacheuserdata) {
        this.read = r1;
        this.IconCompatParcelizer = cacheuserdata;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform.C46521 r0 = this.read;
        ((setCvv.MediaDescriptionCompat) obj).write(getSecondPassTexelHeightUniform.this.IconCompatParcelizer.read(this.IconCompatParcelizer));
    }
}
