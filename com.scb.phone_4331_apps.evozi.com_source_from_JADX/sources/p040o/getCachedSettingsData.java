package p040o;

import java.util.List;
import p040o.Futures;

/* renamed from: o.getCachedSettingsData */
public class getCachedSettingsData extends writeUInt64NoTag<CheckCaptureModule$a$MediaSessionCompat$QueueItem> {
    /* access modifiers changed from: private */
    public final MapDifference IconCompatParcelizer;
    public List<Futures.ChainingListenableFuture> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public boolean read;
    private final transparency write;

    @HmlPinActivity
    public getCachedSettingsData(RegularImmutableBiMap regularImmutableBiMap, transparency transparency, MapDifference mapDifference) {
        super(regularImmutableBiMap);
        this.write = transparency;
        this.IconCompatParcelizer = mapDifference;
    }

    public void onDestroy() {
        super.onDestroy();
        transparency transparency = this.write;
        if (!transparency.MediaBrowserCompat$MediaItem.isDisposed()) {
            transparency.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (!this.read) {
            boolean z = true;
            this.read = true;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.Keep();
            }
            this.write.MediaMetadataCompat();
            this.write.IconCompatParcelizer(new C4513xa1018272(this, (byte) 0));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCachedSettingsData getcachedsettingsdata) {
        if (getcachedsettingsdata.RatingCompat != null) {
            getcachedsettingsdata.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(getCachedSettingsData getcachedsettingsdata) {
        if (getcachedsettingsdata.RatingCompat != null) {
            getcachedsettingsdata.RatingCompat.az_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getCachedSettingsData getcachedsettingsdata) {
        if (getcachedsettingsdata.RatingCompat != null) {
            getcachedsettingsdata.RatingCompat.az_();
        }
    }
}
