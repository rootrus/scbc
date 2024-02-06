package p040o;

import p040o.AppMeasurementSdk;
import p040o.C10829Sizeof;
import p040o.Futures;
import p040o.Iterables;
import p040o.Synchronized;
import p040o.getPercentBlackPixels;
import p040o.getSessionKey;
import p040o.getTransit;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatistics */
public final class AppStatistics implements OPRStatusRewardsLandingActivity_ViewBinding<C10829Sizeof.SizeOfNewObject> {

    /* renamed from: o.AppStatistics$FriendAS */
    public final /* synthetic */ class FriendAS implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ Futures.ChainingListenableFuture MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ FriendAS(Futures.ChainingListenableFuture chainingListenableFuture) {
            this.MediaBrowserCompat$CustomActionResultReceiver = chainingListenableFuture;
        }

        public final void IconCompatParcelizer(Object obj) {
            logAppStats.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, (getPercentBlackPixels.write) obj);
        }
    }

    /* renamed from: o.AppStatistics$ThresholdType */
    public final /* synthetic */ class ThresholdType implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ ThresholdType IconCompatParcelizer = new ThresholdType();

        private /* synthetic */ ThresholdType() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getAverageSpotNoiseGroupingsPerSquareInch) obj).MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* renamed from: o.AppStatistics$a */
    public final /* synthetic */ class C3023a implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C3023a read = new C3023a();

        private /* synthetic */ C3023a() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getAverageSpotNoiseGroupingsPerSquareInch) obj).MediaMetadataCompat();
        }
    }

    /* renamed from: o.AppStatistics$b */
    public final /* synthetic */ class C3024b implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C3024b read = new C3024b();

        private /* synthetic */ C3024b() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getAverageSpotNoiseGroupingsPerSquareInch) obj).MediaDescriptionCompat();
        }
    }

    /* renamed from: o.AppStatistics$DataStoreInitializedListener */
    public final /* synthetic */ class DataStoreInitializedListener implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ DataStoreInitializedListener write = new DataStoreInitializedListener();

        private /* synthetic */ DataStoreInitializedListener() {
        }

        public final void IconCompatParcelizer(Object obj) {
            removeDataStoreInitializedListener.MediaBrowserCompat$ItemReceiver((getEpc) obj);
        }
    }

    /* renamed from: o.AppStatistics$DataStoreStatusCallback */
    public final /* synthetic */ class DataStoreStatusCallback implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ DataStoreStatusCallback MediaBrowserCompat$CustomActionResultReceiver = new DataStoreStatusCallback();

        private /* synthetic */ DataStoreStatusCallback() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getEpc) obj).aj_();
        }
    }

    /* renamed from: o.AppStatistics$c */
    public class C3025c extends writeUInt64NoTag<getPercentBlackPixels.IconCompatParcelizer> {
        @HmlPinActivity
        public C3025c(RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
        }

        static /* synthetic */ void write(Futures.ChainingListenableFuture chainingListenableFuture, getPercentBlackPixels.IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.write(chainingListenableFuture.PlaybackStateCompat);
            iconCompatParcelizer.IconCompatParcelizer(chainingListenableFuture.MediaSessionCompat$Token);
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35273.read.warm_yellow);
            iconCompatParcelizer.RatingCompat(chainingListenableFuture.setChecked);
            iconCompatParcelizer.MediaBrowserCompat$MediaItem(chainingListenableFuture.setExpandedFormat);
            iconCompatParcelizer.read(chainingListenableFuture.Keep.intValue());
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(chainingListenableFuture.AlertController$RecycleListView.intValue());
            iconCompatParcelizer.write();
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(Futures.ChainingListenableFuture chainingListenableFuture, getPercentBlackPixels.IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.write(chainingListenableFuture.PlaybackStateCompat);
            iconCompatParcelizer.IconCompatParcelizer(chainingListenableFuture.MediaSessionCompat$Token);
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35273.read.warm_yellow);
            iconCompatParcelizer.RatingCompat(chainingListenableFuture.setChecked);
            iconCompatParcelizer.MediaBrowserCompat$MediaItem(chainingListenableFuture.setExpandedFormat);
            iconCompatParcelizer.read(chainingListenableFuture.ActionMenuItemView);
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.read(chainingListenableFuture.Keep.intValue());
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(chainingListenableFuture.AlertController$RecycleListView.intValue());
        }

        static /* synthetic */ void IconCompatParcelizer(Futures.ChainingListenableFuture chainingListenableFuture, getPercentBlackPixels.IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.write(chainingListenableFuture.PlaybackStateCompat);
            iconCompatParcelizer.IconCompatParcelizer(chainingListenableFuture.MediaSessionCompat$Token);
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35273.read.red);
            iconCompatParcelizer.RatingCompat(chainingListenableFuture.setChecked);
            iconCompatParcelizer.MediaBrowserCompat$MediaItem(chainingListenableFuture.setExpandedFormat);
            iconCompatParcelizer.read(chainingListenableFuture.ActionMenuItemView);
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.read(chainingListenableFuture.Keep.intValue());
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(chainingListenableFuture.AlertController$RecycleListView.intValue());
        }
    }

    public static C10829Sizeof.SizeOfNewObject read(RegularImmutableBiMap regularImmutableBiMap, StreetViewPanoramaOrientation streetViewPanoramaOrientation, AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, Synchronized.SynchronizedAsMapValues.C38371 r12, toShortArray toshortarray, countIn countin, Synchronized.SynchronizedAsMapEntries.C38351.C38361 r15) {
        return new C10829Sizeof.SizeOfNewObject(regularImmutableBiMap, streetViewPanoramaOrientation, conditionalUserProperty, r12, toshortarray, countin, r15);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        hmlReviewDocumentActivity.get();
        return new C10829Sizeof.SizeOfNewObject((RegularImmutableBiMap) hmlReviewDocumentActivity.get(), (StreetViewPanoramaOrientation) hmlReviewDocumentActivity.get(), (AppMeasurementSdk.ConditionalUserProperty) hmlReviewDocumentActivity.get(), (Synchronized.SynchronizedAsMapValues.C38371) hmlReviewDocumentActivity.get(), (toShortArray) hmlReviewDocumentActivity.get(), (countIn) hmlReviewDocumentActivity.get(), (Synchronized.SynchronizedAsMapEntries.C38351.C38361) hmlReviewDocumentActivity.get());
    }

    /* renamed from: o.AppStatistics$ExportStatusEvent */
    public final /* synthetic */ class ExportStatusEvent implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ getSessionKey.write MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ onStreetViewPanoramaLongClick MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ ExportStatusEvent(getSessionKey.write write, onStreetViewPanoramaLongClick onstreetviewpanoramalongclick) {
            this.MediaBrowserCompat$CustomActionResultReceiver = write;
            this.MediaBrowserCompat$ItemReceiver = onstreetviewpanoramalongclick;
        }

        public final void IconCompatParcelizer(Object obj) {
            getSessionKey.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
            getTransit.write write2 = (getTransit.write) obj;
            write2.IconCompatParcelizer(getSessionKey.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, getSessionKey.this.write));
            String str = write.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                write2.IconCompatParcelizer(str);
            }
        }
    }

    /* renamed from: o.AppStatistics$AppStatsExportFormat */
    public final /* synthetic */ class AppStatsExportFormat implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ removeDataStoreInitializedListener IconCompatParcelizer;
        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ AppStatsExportFormat(removeDataStoreInitializedListener removedatastoreinitializedlistener, String str) {
            this.IconCompatParcelizer = removedatastoreinitializedlistener;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final void IconCompatParcelizer(Object obj) {
            removeDataStoreInitializedListener removedatastoreinitializedlistener = this.IconCompatParcelizer;
            ((getEpc) obj).IconCompatParcelizer(removeDataStoreInitializedListener.write(this.MediaBrowserCompat$CustomActionResultReceiver, removedatastoreinitializedlistener.read, removedatastoreinitializedlistener.MediaBrowserCompat$ItemReceiver));
        }
    }
}
