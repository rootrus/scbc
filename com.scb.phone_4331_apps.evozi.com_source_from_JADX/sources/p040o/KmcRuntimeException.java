package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.KmcRuntimeException */
public final /* synthetic */ class KmcRuntimeException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4066bA MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ KmcRuntimeException(C4066bA bAVar) {
        this.MediaBrowserCompat$ItemReceiver = bAVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractSignatureImage) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.write);
    }
}
