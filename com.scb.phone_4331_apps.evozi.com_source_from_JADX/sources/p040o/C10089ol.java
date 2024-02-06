package p040o;

import p040o.C4959mW;
import p040o.access$2300;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.ol */
public final /* synthetic */ class C10089ol implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4959mW.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10089ol(C4959mW.write write, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4959mW.write write = this.MediaBrowserCompat$ItemReceiver;
        ((getDocumentFramingError.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(C4959mW.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
    }
}
