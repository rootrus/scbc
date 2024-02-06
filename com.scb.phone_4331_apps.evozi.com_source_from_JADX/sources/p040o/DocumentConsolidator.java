package p040o;

import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentConsolidator */
public final /* synthetic */ class DocumentConsolidator implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeClassify$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ DocumentConsolidator(nativeClassify$MediaBrowserCompat$ItemReceiver nativeclassify_mediabrowsercompat_itemreceiver, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = nativeclassify_mediabrowsercompat_itemreceiver;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeClassify$MediaBrowserCompat$ItemReceiver nativeclassify_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
        ((CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer) obj).mo13730i_(nativeclassify_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
