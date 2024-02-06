package p040o;

import p040o.C4198cm;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMainSingletonComponent */
public final /* synthetic */ class getMainSingletonComponent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C4198cm.write write;

    public /* synthetic */ getMainSingletonComponent(C4198cm.write write2, Throwable th) {
        this.write = write2;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4198cm.write write2 = this.write;
        ((KtaJsonCheck$MediaBrowserCompat$ItemReceiver) obj).write(C4198cm.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
