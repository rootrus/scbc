package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDocumentId  reason: case insensitive filesystem */
public final /* synthetic */ class C10861setDocumentId implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getErr write;

    public /* synthetic */ C10861setDocumentId(getErr geterr) {
        this.write = geterr;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.write.MediaBrowserCompat$ItemReceiver((getProject.read) obj);
    }
}
