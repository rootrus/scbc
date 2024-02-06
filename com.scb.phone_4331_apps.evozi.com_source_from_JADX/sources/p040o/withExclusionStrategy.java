package p040o;

import java.util.List;
import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.StreetViewPanorama;

/* renamed from: o.withExclusionStrategy */
public class withExclusionStrategy extends writeUInt64NoTag<CheckCaptureModule_GetIJsonExactionHelperKtaFactory.IconCompatParcelizer> {
    public logEventInternal read;

    @HmlPinActivity
    public withExclusionStrategy(RegularImmutableBiMap regularImmutableBiMap, logEventInternal logeventinternal) {
        super(regularImmutableBiMap);
        this.read = logeventinternal;
    }

    /* renamed from: o.withExclusionStrategy$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> {
        private read() {
        }

        public /* synthetic */ read(withExclusionStrategy withexclusionstrategy, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            withExclusionStrategy withexclusionstrategy = withExclusionStrategy.this;
            isValidSince isvalidsince = new isValidSince((List) obj);
            if (withexclusionstrategy.RatingCompat != null) {
                isvalidsince.IconCompatParcelizer(withexclusionstrategy.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            super.MediaBrowserCompat$ItemReceiver();
            withExclusionStrategy.MediaBrowserCompat$CustomActionResultReceiver(withExclusionStrategy.this);
        }

        public final void onComplete() {
            withExclusionStrategy.read(withExclusionStrategy.this);
        }

        public final void onError(Throwable th) {
            withExclusionStrategy.MediaBrowserCompat$ItemReceiver(withExclusionStrategy.this);
            withExclusionStrategy withexclusionstrategy = withExclusionStrategy.this;
            isInnerClass isinnerclass = isInnerClass.MediaBrowserCompat$ItemReceiver;
            if (withexclusionstrategy.RatingCompat != null) {
                isinnerclass.IconCompatParcelizer(withexclusionstrategy.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(withExclusionStrategy withexclusionstrategy) {
        if (withexclusionstrategy.RatingCompat != null) {
            withexclusionstrategy.RatingCompat.AlertController$RecycleListView();
        }
    }

    static /* synthetic */ void read(withExclusionStrategy withexclusionstrategy) {
        if (withexclusionstrategy.RatingCompat != null) {
            withexclusionstrategy.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(withExclusionStrategy withexclusionstrategy) {
        if (withexclusionstrategy.RatingCompat != null) {
            withexclusionstrategy.RatingCompat.aj_();
        }
    }
}
