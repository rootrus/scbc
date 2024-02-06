package p040o;

import p040o.CreditCard;
import p040o.writeUInt64NoTag;

/* renamed from: o.initImage */
public final /* synthetic */ class initImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ initImage(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        releaseFileBuffer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, (CreditCard.C11681) obj);
    }
}
