package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.isBatchClassIndexField */
public final /* synthetic */ class isBatchClassIndexField implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable read;
    private final /* synthetic */ getDestination$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ isBatchClassIndexField(getDestination$MediaBrowserCompat$CustomActionResultReceiver getdestination_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.write = getdestination_mediabrowsercompat_customactionresultreceiver;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getDestination$MediaBrowserCompat$CustomActionResultReceiver getdestination_mediabrowsercompat_customactionresultreceiver = this.write;
        Throwable th = this.read;
        ((getHorizontalStreaks) obj).aj_();
        getDestination getdestination = getdestination_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        getdestination.MediaBrowserCompat$ItemReceiver(getdestination.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
