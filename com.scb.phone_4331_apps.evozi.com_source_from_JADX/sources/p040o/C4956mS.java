package p040o;

import p040o.C4957mT;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.mS */
public final /* synthetic */ class C4956mS implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4957mT.read IconCompatParcelizer;
    private final /* synthetic */ deactivate MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4956mS(C4957mT.read read, deactivate deactivate) {
        this.IconCompatParcelizer = read;
        this.MediaBrowserCompat$CustomActionResultReceiver = deactivate;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4957mT.read read = this.IconCompatParcelizer;
        deactivate deactivate = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getDocumentFramingError.write) obj).read(true, C4957mT.this.write.IconCompatParcelizer(deactivate.MediaBrowserCompat$ItemReceiver, C4957mT.this.read.MediaBrowserCompat$ItemReceiver.setItemInvoker()), deactivate.write);
    }
}
