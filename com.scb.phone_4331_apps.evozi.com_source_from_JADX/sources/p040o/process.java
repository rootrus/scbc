package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.process */
public final /* synthetic */ class process implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ process(XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver xVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver, List list) {
        this.write = xVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver xVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        ((CheckCaptureModule_GetUriRttiFactory) obj).MediaBrowserCompat$ItemReceiver(xVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, xVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
    }
}
