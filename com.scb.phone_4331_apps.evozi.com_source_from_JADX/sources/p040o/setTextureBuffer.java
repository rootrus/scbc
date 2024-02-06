package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setTextureBuffer */
public final /* synthetic */ class setTextureBuffer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ doCloseSessions write;

    public /* synthetic */ setTextureBuffer(doCloseSessions doclosesessions) {
        this.write = doclosesessions;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCardNumber) obj).write(this.write.write, this.write.read);
    }
}
