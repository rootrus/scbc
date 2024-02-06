package p040o;

import p040o.C4261dN;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.dO */
public final /* synthetic */ class C4263dO implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4261dN.write IconCompatParcelizer;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ C4263dO(C4261dN.write write, Throwable th) {
        this.IconCompatParcelizer = write;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4261dN.write write = this.IconCompatParcelizer;
        ((getAdditionalLeftScanLinesWidth) obj).write(C4261dN.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
