package p040o;

import p040o.C4957mT;
import p040o.access$2300;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.nZ */
public final /* synthetic */ class C5027nZ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4957mT.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C5027nZ(C4957mT.read read, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4957mT.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getDocumentFramingError.write) obj).MediaBrowserCompat$CustomActionResultReceiver(C4957mT.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
