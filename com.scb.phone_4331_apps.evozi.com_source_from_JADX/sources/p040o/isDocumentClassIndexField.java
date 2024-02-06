package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isDocumentClassIndexField */
public final /* synthetic */ class isDocumentClassIndexField implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDestination write;

    public /* synthetic */ isDocumentClassIndexField(getDestination getdestination) {
        this.write = getdestination;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.write.read((getHorizontalStreaks) obj);
    }
}
