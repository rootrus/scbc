package p040o;

import p040o.C4889kC;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.jr */
public final /* synthetic */ class C4878jr implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4889kC.read write;

    public /* synthetic */ C4878jr(C4889kC.read read, Throwable th) {
        this.write = read;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4889kC.read read = this.write;
        ((getMicr) obj).write(C4889kC.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.NAVIGATE_BACK));
    }
}
