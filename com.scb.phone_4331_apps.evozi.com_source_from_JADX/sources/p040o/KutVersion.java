package p040o;

import p040o.C4121bx;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.KutVersion */
public final /* synthetic */ class KutVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4121bx.C41221 read;

    public /* synthetic */ KutVersion(C4121bx.C41221 r1, Throwable th) {
        this.read = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4121bx.C41221 r0 = this.read;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        getVariant getvariant = (getVariant) obj;
        getvariant.aj_();
        getvariant.write(C4121bx.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
