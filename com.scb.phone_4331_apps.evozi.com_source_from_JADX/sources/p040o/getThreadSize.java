package p040o;

/* renamed from: o.getThreadSize */
public class getThreadSize extends writeUInt64NoTag<getPercentAverageImageContrast> {
    public infoWindowAnchor MediaBrowserCompat$ItemReceiver;
    public final AppMeasurementJobService read;

    @HmlPinActivity
    public getThreadSize(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementJobService appMeasurementJobService, infoWindowAnchor infowindowanchor) {
        super(regularImmutableBiMap);
        this.read = appMeasurementJobService;
        this.MediaBrowserCompat$ItemReceiver = infowindowanchor;
    }

    public void onDestroy() {
        AppMeasurementJobService appMeasurementJobService = this.read;
        if (!appMeasurementJobService.MediaBrowserCompat$MediaItem.isDisposed()) {
            appMeasurementJobService.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
