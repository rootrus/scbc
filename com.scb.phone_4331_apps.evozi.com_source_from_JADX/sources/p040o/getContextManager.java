package p040o;

import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getContextManager */
public final /* synthetic */ class getContextManager implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getContextManager(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((newCheckExtractor.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, IGoogleMapDelegate.PROMPTPAY, "scan");
    }
}
