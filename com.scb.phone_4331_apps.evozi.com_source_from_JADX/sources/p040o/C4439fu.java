package p040o;

import p040o.Synchronized;
import p040o.getCompressedFrontImageSize;
import p040o.writeUInt64NoTag;

/* renamed from: o.fu */
public final /* synthetic */ class C4439fu implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ fy$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setBoundsBias MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4439fu(fy$MediaBrowserCompat$ItemReceiver fy_mediabrowsercompat_itemreceiver, setBoundsBias setboundsbias) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fy_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        double d;
        fy$MediaBrowserCompat$ItemReceiver fy_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        setBoundsBias setboundsbias = this.MediaBrowserCompat$ItemReceiver;
        getCompressedFrontImageSize.write write = (getCompressedFrontImageSize.write) obj;
        write.ay_();
        Synchronized.SynchronizedSet unused = fy_mediabrowsercompat_itemreceiver.IconCompatParcelizer.write;
        if (setboundsbias != null) {
            d = setboundsbias.MediaBrowserCompat$MediaItem.doubleValue();
        } else {
            d = 0.0d;
        }
        write.read(String.format(Synchronized.SynchronizedSet.write(Double.valueOf(d)), new Object[0]));
    }
}
