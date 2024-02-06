package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.showCropRectangle */
public final /* synthetic */ class showCropRectangle implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ LevelnessListener write;

    public /* synthetic */ showCropRectangle(LevelnessListener levelnessListener) {
        this.write = levelnessListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((newPassportParameters) obj).read(this.write.write.read);
    }
}
