package p040o;

import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.Collections2;

/* renamed from: o.ISO8601Utils */
public class ISO8601Utils extends writeUInt64NoTag<CheckCaptureModule_GetIJsonExactionHelperRttiFactory.IconCompatParcelizer> {
    private final AppMeasurementDynamiteService read;
    /* access modifiers changed from: private */
    public final bubbleUpAlternatingLevels write;

    @HmlPinActivity
    public ISO8601Utils(bubbleUpAlternatingLevels bubbleupalternatinglevels, RegularImmutableBiMap regularImmutableBiMap, AppMeasurementDynamiteService appMeasurementDynamiteService) {
        super(regularImmutableBiMap);
        this.read = appMeasurementDynamiteService;
        this.write = bubbleupalternatinglevels;
    }

    public void onDestroy() {
        super.onDestroy();
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.read;
        if (!appMeasurementDynamiteService.MediaBrowserCompat$MediaItem.isDisposed()) {
            appMeasurementDynamiteService.MediaBrowserCompat$MediaItem.dispose();
        }
        appMeasurementDynamiteService.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }

    static /* synthetic */ void write(ISO8601Utils iSO8601Utils) {
        if (iSO8601Utils.RatingCompat != null) {
            iSO8601Utils.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(ISO8601Utils iSO8601Utils) {
        if (iSO8601Utils.RatingCompat != null) {
            iSO8601Utils.RatingCompat.ay_();
        }
    }

    public final void read(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.read;
        if (!appMeasurementDynamiteService.MediaBrowserCompat$MediaItem.isDisposed()) {
            appMeasurementDynamiteService.MediaBrowserCompat$MediaItem.dispose();
        }
        AppMeasurementDynamiteService appMeasurementDynamiteService2 = this.read;
        Collections2.FilteredCollection MediaBrowserCompat$CustomActionResultReceiver = Collections2.FilteredCollection.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.write = str;
        appMeasurementDynamiteService2.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver);
        this.read.IconCompatParcelizer(new ISO8601Utils$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }
}
