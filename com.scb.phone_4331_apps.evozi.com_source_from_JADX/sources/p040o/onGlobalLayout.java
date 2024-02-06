package p040o;

import java.util.List;
import p040o.injectRttiCheckDeserializer;

/* renamed from: o.onGlobalLayout */
public class onGlobalLayout extends writeUInt64NoTag<injectRttiCheckDeserializer.write> {
    /* access modifiers changed from: private */
    public List<getCrashlyticsInstallId> IconCompatParcelizer;
    public final color read;
    /* access modifiers changed from: private */
    public final containsMapping write;

    @HmlPinActivity
    public onGlobalLayout(RegularImmutableBiMap regularImmutableBiMap, color color, containsMapping containsmapping) {
        super(regularImmutableBiMap);
        this.write = containsmapping;
        this.read = color;
    }

    public void onDestroy() {
        color color = this.read;
        if (!color.MediaBrowserCompat$MediaItem.isDisposed()) {
            color.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(onGlobalLayout ongloballayout) {
        if (ongloballayout.RatingCompat != null) {
            ongloballayout.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(onGlobalLayout ongloballayout) {
        if (ongloballayout.RatingCompat != null) {
            ongloballayout.RatingCompat.aj_();
        }
    }
}
