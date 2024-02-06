package p040o;

import p040o.C4957mT;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.oa */
public final /* synthetic */ class C5085oa implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ deactivate MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4957mT.read read;

    public /* synthetic */ C5085oa(C4957mT.read read2, deactivate deactivate) {
        this.read = read2;
        this.MediaBrowserCompat$CustomActionResultReceiver = deactivate;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4957mT.read read2 = this.read;
        deactivate deactivate = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getDocumentFramingError.write) obj).read(false, C4957mT.this.write.IconCompatParcelizer(deactivate.MediaBrowserCompat$ItemReceiver, C4957mT.this.read.MediaBrowserCompat$ItemReceiver.setItemInvoker()), deactivate.write);
    }
}
