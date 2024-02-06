package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.onTorchLuminance */
public final /* synthetic */ class onTorchLuminance implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ onTorchLuminance(getPosX getposx) {
        this.MediaBrowserCompat$ItemReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.MediaBrowserCompat$ItemReceiver;
        getposx.read = "WORK";
        ((RttiJsonPassport) obj).MediaBrowserCompat$CustomActionResultReceiver(getposx.IconCompatParcelizer.MediaSessionCompat$QueueItem, getposx.read);
    }
}
