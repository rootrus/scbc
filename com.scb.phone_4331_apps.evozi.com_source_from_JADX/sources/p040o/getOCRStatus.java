package p040o;

import p040o.MapView;
import p040o.OcrEventListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.getOCRStatus */
public final /* synthetic */ class getOCRStatus implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ MapView.zzb MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ OcrEventListener.C37023 read;

    public /* synthetic */ getOCRStatus(OcrEventListener.C37023 r1, MapView.zzb zzb) {
        this.read = r1;
        this.MediaBrowserCompat$ItemReceiver = zzb;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPassportNumber) obj).MediaBrowserCompat$CustomActionResultReceiver(OcrEventListener.read(this.MediaBrowserCompat$ItemReceiver.write));
    }
}
