package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.mm */
public final /* synthetic */ class C10056mm implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ILocationSourceDelegate write;

    public /* synthetic */ C10056mm(ILocationSourceDelegate iLocationSourceDelegate) {
        this.write = iLocationSourceDelegate;
    }

    public final void IconCompatParcelizer(Object obj) {
        ILocationSourceDelegate iLocationSourceDelegate = this.write;
        ((getBarcodes) obj).write(iLocationSourceDelegate.write.write, iLocationSourceDelegate.write.read);
    }
}
