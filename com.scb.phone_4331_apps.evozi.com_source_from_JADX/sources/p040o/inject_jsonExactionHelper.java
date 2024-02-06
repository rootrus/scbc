package p040o;

import p040o.AppMeasurementSdk;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.inject_jsonExactionHelper */
public class inject_jsonExactionHelper extends writeUInt64NoTag<getTopLeftCornerWidth.setContentHeight> {
    private final AppMeasurementSdk.OnEventListener IconCompatParcelizer;
    public final onInfoWindowLongClick MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public inject_jsonExactionHelper(drainTo drainto, AppMeasurementSdk.OnEventListener onEventListener, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = onEventListener;
        this.MediaBrowserCompat$ItemReceiver = onEventListener.read.write();
    }

    public void onDestroy() {
        super.onDestroy();
        AppMeasurementSdk.OnEventListener onEventListener = this.IconCompatParcelizer;
        if (!onEventListener.MediaBrowserCompat$MediaItem.isDisposed()) {
            onEventListener.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
