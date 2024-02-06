package p040o;

import p040o.getDocumentNote;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.getWscClientId */
public final /* synthetic */ class getWscClientId implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDocumentNote.write write;

    public /* synthetic */ getWscClientId(getDocumentNote.write write2) {
        this.write = write2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.IconCompatParcelizer) obj).read(getDocumentNote.this.IconCompatParcelizer);
    }
}
