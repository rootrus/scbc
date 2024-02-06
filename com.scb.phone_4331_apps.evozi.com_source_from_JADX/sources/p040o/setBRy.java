package p040o;

import p040o.getCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.setBRy */
public final /* synthetic */ class setBRy implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zziu.zza MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getCurrentImageIndex.C45414 write;

    public /* synthetic */ setBRy(getCurrentImageIndex.C45414 r1, zziu.zza zza) {
        this.write = r1;
        this.MediaBrowserCompat$ItemReceiver = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCurrentImageIndex.C45414 r0 = this.write;
        ((getMRZ2) obj).MediaBrowserCompat$ItemReceiver(getCurrentImageIndex.this.write.read(this.MediaBrowserCompat$ItemReceiver), getCurrentImageIndex.read(getCurrentImageIndex.this));
    }
}
