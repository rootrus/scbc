package p040o;

import p040o.access$2300;
import p040o.nativeWriteJpegImage;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDpiX */
public final /* synthetic */ class getDpiX implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeWriteJpegImage.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ getDpiX(nativeWriteJpegImage.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteJpegImage.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = this.write;
        setExpirationMonth setexpirationmonth = (setExpirationMonth) obj;
        setexpirationmonth.aj_();
        setexpirationmonth.write(nativeWriteJpegImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
