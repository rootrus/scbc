package p040o;

import p040o.CreditCard;
import p040o.releaseFileBuffer;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeCancelProcessing */
public final /* synthetic */ class nativeCancelProcessing implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable read;
    private final /* synthetic */ releaseFileBuffer.read write;

    public /* synthetic */ nativeCancelProcessing(releaseFileBuffer.read read2, Throwable th) {
        this.write = read2;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        releaseFileBuffer.read read2 = this.write;
        Throwable th = this.read;
        CreditCard.C11681 r4 = (CreditCard.C11681) obj;
        r4.aj_();
        r4.write(releaseFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new nativeReadImageFile(r4)));
    }
}
