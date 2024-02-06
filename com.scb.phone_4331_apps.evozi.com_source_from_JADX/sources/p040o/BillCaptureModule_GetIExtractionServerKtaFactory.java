package p040o;

import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule_GetIExtractionServerKtaFactory */
public final /* synthetic */ class BillCaptureModule_GetIExtractionServerKtaFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ BillCaptureModule_GetIExtractionServerKtaFactory(KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver ktaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver, Throwable th) {
        this.IconCompatParcelizer = ktaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver ktaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        ((getTopLeftCornerWidth.setItemInvoker) obj).write(ktaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
