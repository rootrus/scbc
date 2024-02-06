package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ContextImageStorage */
public final /* synthetic */ class ContextImageStorage implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ ContextImageStorage IconCompatParcelizer = new ContextImageStorage();

    private /* synthetic */ ContextImageStorage() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCompressedFrontImageSize) obj).read();
    }
}
