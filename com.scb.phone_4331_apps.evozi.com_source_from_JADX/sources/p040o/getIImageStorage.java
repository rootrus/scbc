package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getIImageStorage */
public final /* synthetic */ class getIImageStorage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFiles write;

    public /* synthetic */ getIImageStorage(getFiles getfiles) {
        this.write = getfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractorResponse) obj).write(this.write);
    }
}
