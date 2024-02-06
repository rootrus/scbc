package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.List;
import p040o.access$2300;

/* renamed from: o.AppStatsState */
public class AppStatsState extends writeUInt64NoTag<setCheckParameters> {
    /* access modifiers changed from: private */
    public final asWriter IconCompatParcelizer;
    public boolean read;
    public final TileOverlay write;

    @HmlPinActivity
    public AppStatsState(RegularImmutableBiMap regularImmutableBiMap, TileOverlay tileOverlay, asWriter aswriter) {
        super(regularImmutableBiMap);
        this.write = tileOverlay;
        this.IconCompatParcelizer = aswriter;
    }

    public void onDestroy() {
        super.onDestroy();
        TileOverlay tileOverlay = this.write;
        if (!tileOverlay.MediaBrowserCompat$MediaItem.isDisposed()) {
            tileOverlay.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.AppStatsState$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setMapType> {
        private read() {
        }

        public /* synthetic */ read(AppStatsState appStatsState, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z = true;
            List<Out> MediaBrowserCompat$ItemReceiver = constrainedSortedSetMultimap.MediaBrowserCompat$ItemReceiver(((setMapType) obj).write, new constrainedMap(AppStatsState.this.IconCompatParcelizer, true));
            if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.isEmpty()) {
                AppStatsState appStatsState = AppStatsState.this;
                getThresholdType getthresholdtype = getThresholdType.MediaBrowserCompat$CustomActionResultReceiver;
                if (appStatsState.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getthresholdtype.IconCompatParcelizer(appStatsState.RatingCompat);
                    return;
                }
                return;
            }
            AppStatsState appStatsState2 = AppStatsState.this;
            AppStatsThresholdReachedEvent appStatsThresholdReachedEvent = new AppStatsThresholdReachedEvent(MediaBrowserCompat$ItemReceiver);
            if (appStatsState2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                appStatsThresholdReachedEvent.IconCompatParcelizer(appStatsState2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            AppStatsState appStatsState = AppStatsState.this;
            AppStatsWriteFileListener appStatsWriteFileListener = new AppStatsWriteFileListener(th);
            if (appStatsState.RatingCompat != null) {
                appStatsWriteFileListener.IconCompatParcelizer(appStatsState.RatingCompat);
            }
            if (th instanceof RetrofitException) {
                RetrofitException retrofitException = (RetrofitException) th;
                if (retrofitException.IconCompatParcelizer != null && "1601".equals(retrofitException.IconCompatParcelizer.write.IconCompatParcelizer)) {
                    AppStatsState.this.MediaBrowserCompat$ItemReceiver(AppStatsState.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                    return;
                }
            }
            if (AppStatsState.this.read) {
                AppStatsState.this.MediaBrowserCompat$ItemReceiver(AppStatsState.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            } else {
                AppStatsState.this.MediaBrowserCompat$ItemReceiver(AppStatsState.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }
}
