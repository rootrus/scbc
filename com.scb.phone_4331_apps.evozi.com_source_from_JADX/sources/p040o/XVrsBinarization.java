package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsBinarization */
public final /* synthetic */ class XVrsBinarization implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ XVrsDocument MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ XVrsBinarization(XVrsDocument xVrsDocument) {
        this.MediaBrowserCompat$CustomActionResultReceiver = xVrsDocument;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getImageTooLight) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }
}
