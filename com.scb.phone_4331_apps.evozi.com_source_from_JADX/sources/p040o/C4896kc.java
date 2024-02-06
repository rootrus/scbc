package p040o;

import p040o.C4915ks;
import p040o.QuickExtractor;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.kc */
public final /* synthetic */ class C4896kc implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4915ks.C49161 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ C4896kc(C4915ks.C49161 r1, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4915ks.C49161 r0 = this.MediaBrowserCompat$ItemReceiver;
        ((QuickExtractor.C70184) obj).write(C4915ks.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.NAVIGATE_BACK));
    }
}
