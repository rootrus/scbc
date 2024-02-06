package p040o;

import p040o.access$2300;
import p040o.getErrCause;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImgClassificationEventAltDao */
public final /* synthetic */ class ImgClassificationEventAltDao implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getErrCause.write write;

    public /* synthetic */ ImgClassificationEventAltDao(getErrCause.write write2, Throwable th) {
        this.write = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getErrCause.write write2 = this.write;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        getLatestCachedModelDataBuildInfo getlatestcachedmodeldatabuildinfo = (getLatestCachedModelDataBuildInfo) obj;
        getlatestcachedmodeldatabuildinfo.aj_();
        if (getErrCause.this.MediaBrowserCompat$CustomActionResultReceiver(th, false)) {
            getlatestcachedmodeldatabuildinfo.write(getErrCause.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        } else {
            getlatestcachedmodeldatabuildinfo.write(getErrCause.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
