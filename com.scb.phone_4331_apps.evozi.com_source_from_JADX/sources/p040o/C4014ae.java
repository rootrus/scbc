package p040o;

import p040o.C5075nw;
import p040o.getCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.ae */
public final /* synthetic */ class C4014ae implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCurrentImageIndex.C45414 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ zziu.zza write;

    public /* synthetic */ C4014ae(getCurrentImageIndex.C45414 r1, zziu.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.write = zza;
    }

    /* renamed from: o.ae$a */
    public final /* synthetic */ class C4016a implements Runnable {
        private final /* synthetic */ C5075nw.C50761 write;

        public /* synthetic */ C4016a(C5075nw.C50761 r1) {
            this.write = r1;
        }

        public final void run() {
            C5075nw nwVar = C5075nw.this;
            C10083nt ntVar = C10083nt.read;
            if (nwVar.RatingCompat != null) {
                ntVar.IconCompatParcelizer(nwVar.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        getCurrentImageIndex.C45414 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        zziu.zza zza = this.write;
        ((getMRZ2) obj).write(getCurrentImageIndex.this.write.IconCompatParcelizer(zza.MediaBrowserCompat$CustomActionResultReceiver, zza.MediaBrowserCompat$ItemReceiver, zza.read), getCurrentImageIndex.this.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver(), getCurrentImageIndex.read(getCurrentImageIndex.this));
    }
}
