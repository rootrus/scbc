package p040o;

import p040o.getCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.getWordAtPoint */
public final /* synthetic */ class getWordAtPoint implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzcz.zzh.zza IconCompatParcelizer;
    private final /* synthetic */ getCurrentImageIndex.C45403 read;

    public /* synthetic */ getWordAtPoint(getCurrentImageIndex.C45403 r1, zzcz.zzh.zza zza) {
        this.read = r1;
        this.IconCompatParcelizer = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCurrentImageIndex.C45403 r0 = this.read;
        zzcz.zzh.zza zza = this.IconCompatParcelizer;
        ((getMRZ2) obj).write(getCurrentImageIndex.this.write.IconCompatParcelizer(zza.MediaBrowserCompat$ItemReceiver, zza.MediaBrowserCompat$CustomActionResultReceiver, zza.write), getCurrentImageIndex.this.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver(), getCurrentImageIndex.read(getCurrentImageIndex.this));
    }
}
