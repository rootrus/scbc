package p040o;

import p040o.C4879jt;
import p040o.access$2300;
import p040o.getBottomEdgeTearHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.kx */
public final /* synthetic */ class C4921kx implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4879jt.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ C4921kx(C4879jt.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4879jt.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getBottomEdgeTearHeight.IconCompatParcelizer) obj).write(C4879jt.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.NAVIGATE_BACK));
    }
}
