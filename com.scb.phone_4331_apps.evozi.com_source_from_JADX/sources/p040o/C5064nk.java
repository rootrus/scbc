package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nk */
public final /* synthetic */ class C5064nk implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String write;

    public /* synthetic */ C5064nk(String str) {
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getFaceRightPadding) obj).read(this.write);
    }
}
