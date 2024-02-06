package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.GPUImageHolderImpl_Factory */
public final /* synthetic */ class GPUImageHolderImpl_Factory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ doCloseSessions read;

    public /* synthetic */ GPUImageHolderImpl_Factory(doCloseSessions doclosesessions) {
        this.read = doclosesessions;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCardNumber) obj).write(this.read.write, this.read.read);
    }
}
