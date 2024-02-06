package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.tc */
public final /* synthetic */ class C10159tc implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes read;

    public /* synthetic */ C10159tc(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.read = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setExpandedFormat) obj).read(this.read);
    }
}
