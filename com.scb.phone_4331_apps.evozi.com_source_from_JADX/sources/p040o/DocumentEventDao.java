package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentEventDao */
public final /* synthetic */ class DocumentEventDao implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ scrollBy write;

    public /* synthetic */ DocumentEventDao(scrollBy scrollby) {
        this.write = scrollby;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IIdExtractionListener) obj).IconCompatParcelizer(this.write.write);
    }
}
