package p040o;

import p040o.getCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.setTLx */
public final /* synthetic */ class setTLx implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zziu.zza MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getCurrentImageIndex.C45414 read;

    public /* synthetic */ setTLx(getCurrentImageIndex.C45414 r1, zziu.zza zza) {
        this.read = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCurrentImageIndex.C45414 r0 = this.read;
        ((getMRZ2) obj).MediaBrowserCompat$ItemReceiver(getCurrentImageIndex.this.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), getCurrentImageIndex.read(getCurrentImageIndex.this));
    }
}
