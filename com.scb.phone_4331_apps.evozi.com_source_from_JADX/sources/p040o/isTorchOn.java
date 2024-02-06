package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isTorchOn */
public final /* synthetic */ class isTorchOn implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ isTorchOn(getPosX getposx) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver;
        getposx.read = "HOME";
        ((RttiJsonPassport) obj).MediaBrowserCompat$CustomActionResultReceiver(getposx.IconCompatParcelizer.MediaMetadataCompat, getposx.read);
    }
}
