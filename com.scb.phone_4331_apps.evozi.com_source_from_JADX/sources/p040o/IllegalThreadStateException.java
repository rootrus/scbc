package p040o;

import p040o.C4121bx;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.IllegalThreadStateException */
public final /* synthetic */ class IllegalThreadStateException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable read;
    private final /* synthetic */ C4121bx.C41232 write;

    public /* synthetic */ IllegalThreadStateException(C4121bx.C41232 r1, Throwable th) {
        this.write = r1;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4121bx.C41232 r0 = this.write;
        ((getVariant) obj).read(C4121bx.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}
