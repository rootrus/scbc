package p040o;

import p040o.Check;
import p040o.ImageProcessor;
import p040o.writeUInt64NoTag;

/* renamed from: o.onTaskCompleted */
public final /* synthetic */ class onTaskCompleted implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ onTaskCompleted(IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver isgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver, Throwable th) {
        this.write = isgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver isgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver = this.write;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        Check.IconCompatParcelizer iconCompatParcelizer = (Check.IconCompatParcelizer) obj;
        iconCompatParcelizer.aj_();
        iconCompatParcelizer.write(isgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new ImageProcessor.C3486c(iconCompatParcelizer)));
    }
}
