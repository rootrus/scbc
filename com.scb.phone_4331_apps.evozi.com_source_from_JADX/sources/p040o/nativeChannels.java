package p040o;

import p040o.AppMeasurementSdk;
import p040o.CheckExtractActivity;

/* renamed from: o.nativeChannels */
public class nativeChannels extends writeUInt64NoTag<CheckExtractActivity.IconCompatParcelizer> {
    public final AppMeasurementSdk.ConditionalUserProperty MediaBrowserCompat$ItemReceiver;
    public getBinaryImagesFile read;

    @HmlPinActivity
    public nativeChannels(AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = conditionalUserProperty;
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$ItemReceiver.read.ListMenuItemView();
    }
}
