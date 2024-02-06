package p040o;

import p040o.C10100p;
import p040o.access$2300;
import p040o.getBottomEdgeTearHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.kA */
public final /* synthetic */ class C4887kA implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C10100p.C5120a.write read;

    public /* synthetic */ C4887kA(C10100p.C5120a.write write, Throwable th) {
        this.read = write;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10100p.C5120a.write write = this.read;
        ((getBottomEdgeTearHeight.write) obj).write(C10100p.C5120a.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.NAVIGATE_BACK));
    }
}
