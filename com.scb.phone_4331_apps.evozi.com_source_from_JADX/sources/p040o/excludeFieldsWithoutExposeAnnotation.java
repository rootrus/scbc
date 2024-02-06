package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.excludeFieldsWithoutExposeAnnotation */
public final /* synthetic */ class excludeFieldsWithoutExposeAnnotation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4283discover write;

    public /* synthetic */ excludeFieldsWithoutExposeAnnotation(C4283discover discover) {
        this.write = discover;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getLastName) obj).read(this.write.IconCompatParcelizer);
    }
}
