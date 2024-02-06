package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDrawVideoFramesFlag */
public final /* synthetic */ class getDrawVideoFramesFlag implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable read;
    private final /* synthetic */ C4120bw write;

    public /* synthetic */ getDrawVideoFramesFlag(C4120bw bwVar, Throwable th) {
        this.write = bwVar;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4120bw bwVar = this.write;
        ((getExtractSignatureImage) obj).write(bwVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}
