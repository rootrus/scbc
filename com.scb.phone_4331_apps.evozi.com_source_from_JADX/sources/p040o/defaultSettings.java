package p040o;

import java.util.List;
import p040o.Futures;

/* renamed from: o.defaultSettings */
public class defaultSettings extends writeUInt64NoTag<CheckCaptureModule$a$MediaBrowserCompat$SearchResultReceiver> {
    public List<Futures.C34051> IconCompatParcelizer;
    public final transparency MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final entriesOnlyOnLeft read;
    public boolean write;

    @HmlPinActivity
    public defaultSettings(transparency transparency, entriesOnlyOnLeft entriesonlyonleft, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = transparency;
        this.read = entriesonlyonleft;
    }

    public void onDestroy() {
        super.onDestroy();
        transparency transparency = this.MediaBrowserCompat$ItemReceiver;
        if (!transparency.MediaBrowserCompat$MediaItem.isDisposed()) {
            transparency.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(defaultSettings defaultsettings) {
        if (defaultsettings.RatingCompat != null) {
            defaultsettings.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void write(defaultSettings defaultsettings) {
        if (defaultsettings.RatingCompat != null) {
            defaultsettings.RatingCompat.az_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(defaultSettings defaultsettings) {
        if (defaultsettings.RatingCompat != null) {
            defaultsettings.RatingCompat.az_();
        }
    }
}
