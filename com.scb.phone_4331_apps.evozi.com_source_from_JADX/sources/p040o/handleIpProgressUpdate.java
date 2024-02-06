package p040o;

import p040o.IsgDetectionModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.handleIpProgressUpdate */
public final /* synthetic */ class handleIpProgressUpdate implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ IsgDetectionModule.write write;

    public /* synthetic */ handleIpProgressUpdate(IsgDetectionModule.write write2, Throwable th) {
        this.write = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        IsgDetectionModule.write write2 = this.write;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        Check$MediaBrowserCompat$CustomActionResultReceiver check$MediaBrowserCompat$CustomActionResultReceiver = (Check$MediaBrowserCompat$CustomActionResultReceiver) obj;
        check$MediaBrowserCompat$CustomActionResultReceiver.aj_();
        check$MediaBrowserCompat$CustomActionResultReceiver.write(IsgDetectionModule.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new IsgDocumentDetector_Factory(check$MediaBrowserCompat$CustomActionResultReceiver)));
    }
}
