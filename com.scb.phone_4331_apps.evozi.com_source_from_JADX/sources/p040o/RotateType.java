package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.RotateType */
public final /* synthetic */ class RotateType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;

    public /* synthetic */ RotateType(String str) {
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractionType) obj).IconCompatParcelizer(this.read);
    }
}
