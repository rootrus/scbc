package p040o;

import p040o.MapView;
import p040o.OcrEventListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.setQuickAnalysisSettings */
public final /* synthetic */ class setQuickAnalysisSettings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ OcrEventListener.C37034 IconCompatParcelizer;
    private final /* synthetic */ MapView.zzb write;

    public /* synthetic */ setQuickAnalysisSettings(OcrEventListener.C37034 r1, MapView.zzb zzb) {
        this.IconCompatParcelizer = r1;
        this.write = zzb;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPassportNumber) obj).MediaBrowserCompat$CustomActionResultReceiver(OcrEventListener.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(false), OcrEventListener.read(this.write.write).booleanValue());
    }
}
