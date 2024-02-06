package p040o;

import p040o.KtaBillExtractor;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyGetIExtractionServerKta */
public final /* synthetic */ class proxyGetIExtractionServerKta implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ KtaBillExtractor.IconCompatParcelizer read;

    public /* synthetic */ proxyGetIExtractionServerKta(KtaBillExtractor.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.read = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        KtaBillExtractor.IconCompatParcelizer iconCompatParcelizer = this.read;
        ((getTopLeftCornerWidth.setItemInvoker) obj).write(KtaBillExtractor.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
