package p040o;

import p040o.XVrsImage;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getProjectedCorners */
public final /* synthetic */ class getProjectedCorners implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ XVrsImage.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getProjectedCorners(XVrsImage.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        XVrsImage.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        ((CheckExtractActivity$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(XVrsImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
    }
}
