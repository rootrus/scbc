package p040o;

import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.Shader */
public final /* synthetic */ class Shader implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes read;

    public /* synthetic */ Shader(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.read = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((newCheckExtractor.IconCompatParcelizer) obj).read(this.read, IGoogleMapDelegate.PROMPTPAY);
    }
}
