package p040o;

import p040o.getCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.CropType */
public final /* synthetic */ class CropType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCurrentImageIndex.C45414 IconCompatParcelizer;
    private final /* synthetic */ zziu.zza read;

    public /* synthetic */ CropType(getCurrentImageIndex.C45414 r1, zziu.zza zza) {
        this.IconCompatParcelizer = r1;
        this.read = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCurrentImageIndex.C45414 r0 = this.IconCompatParcelizer;
        ((getMRZ2) obj).IconCompatParcelizer(getCurrentImageIndex.this.write.write(this.read), getCurrentImageIndex.read(getCurrentImageIndex.this), getCurrentImageIndex.this.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver());
    }
}
