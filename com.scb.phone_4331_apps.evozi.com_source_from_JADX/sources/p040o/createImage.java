package p040o;

import p040o.CreditCard;
import p040o.access$2300;
import p040o.releaseFileBuffer;
import p040o.writeUInt64NoTag;

/* renamed from: o.createImage */
public final /* synthetic */ class createImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ releaseFileBuffer.IconCompatParcelizer IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ createImage(releaseFileBuffer.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        releaseFileBuffer.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        CreditCard.C11681 r4 = (CreditCard.C11681) obj;
        r4.ay_();
        r4.write(releaseFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
