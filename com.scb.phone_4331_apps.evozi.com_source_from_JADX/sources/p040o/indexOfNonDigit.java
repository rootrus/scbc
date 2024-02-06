package p040o;

import p040o.AppMeasurementSdk;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.Predicates;

/* renamed from: o.indexOfNonDigit */
public class indexOfNonDigit extends writeUInt64NoTag<CheckCaptureModule_GetIJsonExactionHelperRttiFactory.write> {
    public final Predicates.ContainsPatternPredicate IconCompatParcelizer;
    public AppMeasurementSdk.ConditionalUserProperty write;

    @HmlPinActivity
    public indexOfNonDigit(AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, Predicates.ContainsPatternPredicate containsPatternPredicate, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = conditionalUserProperty;
        this.IconCompatParcelizer = containsPatternPredicate;
    }

    public void onDestroy() {
        AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty = this.write;
        if (!conditionalUserProperty.MediaBrowserCompat$MediaItem.isDisposed()) {
            conditionalUserProperty.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void write(chain chain, CheckCaptureModule_GetIJsonExactionHelperRttiFactory.write write2) {
        if ("B6".equals(chain.MediaMetadataCompat)) {
            write2.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            write2.read();
        }
    }
}
