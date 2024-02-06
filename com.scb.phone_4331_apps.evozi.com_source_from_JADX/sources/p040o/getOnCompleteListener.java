package p040o;

import p040o.C4120bw;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getOnCompleteListener */
public final /* synthetic */ class getOnCompleteListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4120bw.write IconCompatParcelizer;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ getOnCompleteListener(C4120bw.write write2, Throwable th) {
        this.IconCompatParcelizer = write2;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4120bw.write write2 = this.IconCompatParcelizer;
        ((getExtractSignatureImage) obj).write(C4120bw.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
    }
}
