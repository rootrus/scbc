package p040o;

import com.scb.phone.domain.interactor.FatcaQuestionnaireCase;
import java.util.List;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.Iterables;
import p040o.access$2300;

/* renamed from: o.nativeAdornBoundary */
public class nativeAdornBoundary extends writeUInt64NoTag<CheckCaptureModule_GetLookAndFeelParametersFactory.IconCompatParcelizer> {
    public List<doWriteNonFatal> IconCompatParcelizer;
    public Iterables.C352212 MediaBrowserCompat$ItemReceiver;
    public FabTransformationSheetBehavior MediaBrowserCompat$MediaItem;
    private synchronizedListMultimap MediaBrowserCompat$SearchResultReceiver;
    public int read;
    public FatcaQuestionnaireCase write;

    @HmlPinActivity
    public nativeAdornBoundary(RegularImmutableBiMap regularImmutableBiMap, FatcaQuestionnaireCase fatcaQuestionnaireCase, synchronizedListMultimap synchronizedlistmultimap, FabTransformationSheetBehavior fabTransformationSheetBehavior, Iterables.C352212 r5) {
        super(regularImmutableBiMap);
        this.write = fatcaQuestionnaireCase;
        this.MediaBrowserCompat$SearchResultReceiver = synchronizedlistmultimap;
        this.MediaBrowserCompat$MediaItem = fabTransformationSheetBehavior;
        this.MediaBrowserCompat$ItemReceiver = r5;
    }

    /* renamed from: o.nativeAdornBoundary$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private read() {
        }

        public /* synthetic */ read(nativeAdornBoundary nativeadornboundary, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            super.onNext((Boolean) obj);
            nativeAdornBoundary.read(nativeAdornBoundary.this);
            nativeAdornBoundary nativeadornboundary = nativeAdornBoundary.this;
            XVrsDetectionVisualizer xVrsDetectionVisualizer = XVrsDetectionVisualizer.write;
            if (nativeadornboundary.RatingCompat != null) {
                xVrsDetectionVisualizer.IconCompatParcelizer(nativeadornboundary.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            if (th instanceof FatcaQuestionnaireCase.FatcaVerificationCodeException) {
                nativeAdornBoundary.IconCompatParcelizer(nativeAdornBoundary.this);
                nativeAdornBoundary nativeadornboundary = nativeAdornBoundary.this;
                nativeAdornReferenceFeature nativeadornreferencefeature = nativeAdornReferenceFeature.read;
                if (nativeadornboundary.RatingCompat != null) {
                    nativeadornreferencefeature.IconCompatParcelizer(nativeadornboundary.RatingCompat);
                    return;
                }
                return;
            }
            nativeAdornBoundary.this.MediaBrowserCompat$ItemReceiver(nativeAdornBoundary.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void onComplete() {
            super.onComplete();
            nativeAdornBoundary.MediaBrowserCompat$ItemReceiver(nativeAdornBoundary.this);
        }
    }

    static /* synthetic */ void write(nativeAdornBoundary nativeadornboundary) {
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(nativeAdornBoundary nativeadornboundary) {
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(nativeAdornBoundary nativeadornboundary) {
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(nativeAdornBoundary nativeadornboundary) {
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(nativeAdornBoundary nativeadornboundary) {
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(nativeAdornBoundary nativeadornboundary) {
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(nativeAdornBoundary nativeadornboundary) {
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.aj_();
        }
    }
}
