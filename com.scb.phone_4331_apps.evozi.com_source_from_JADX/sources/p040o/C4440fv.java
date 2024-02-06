package p040o;

import p040o.getCompressedFrontImageSize;
import p040o.writeUInt64NoTag;

/* renamed from: o.fv */
public final /* synthetic */ class C4440fv implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ fz$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ zzsj read;

    public /* synthetic */ C4440fv(fz$MediaBrowserCompat$ItemReceiver fz_mediabrowsercompat_itemreceiver, zzsj zzsj) {
        this.MediaBrowserCompat$ItemReceiver = fz_mediabrowsercompat_itemreceiver;
        this.read = zzsj;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.write(this.read, (getCompressedFrontImageSize.read) obj);
    }
}
