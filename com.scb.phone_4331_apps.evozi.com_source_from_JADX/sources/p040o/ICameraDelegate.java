package p040o;

import p040o.C4124by;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.ICameraDelegate */
public final /* synthetic */ class ICameraDelegate implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4124by.C41275 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ ICameraDelegate(C4124by.C41275 r1, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4124by.C41275 r0 = this.MediaBrowserCompat$ItemReceiver;
        ((getExtractFaceImage) obj).write(C4124by.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
    }
}
