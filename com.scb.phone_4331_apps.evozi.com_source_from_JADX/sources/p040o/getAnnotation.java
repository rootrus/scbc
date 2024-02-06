package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAnnotation */
public final /* synthetic */ class getAnnotation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean write;

    public /* synthetic */ getAnnotation(boolean z) {
        this.write = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        separateCamelCase.IconCompatParcelizer(this.write, (getHair) obj);
    }
}
