package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.onTorchChange */
public final /* synthetic */ class onTorchChange implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDeviceFile MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ onTorchChange(getDeviceFile getdevicefile) {
        this.MediaBrowserCompat$ItemReceiver = getdevicefile;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageOutListener.read(this.MediaBrowserCompat$ItemReceiver, (getTopLeftCornerWidth.setForceShowIcon) obj);
    }
}
