package p040o;

import com.scb.phone.domain.interactor.FatcaQuestionnaireCase;
import p040o.access$2300;

/* renamed from: o.nativeAdornBoundary$MediaBrowserCompat$CustomActionResultReceiver */
public final class C10075x265976a8 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getProjection> {
    private /* synthetic */ nativeAdornBoundary write;

    private C10075x265976a8(nativeAdornBoundary nativeadornboundary) {
        this.write = nativeadornboundary;
    }

    public /* synthetic */ C10075x265976a8(nativeAdornBoundary nativeadornboundary, byte b) {
        this(nativeadornboundary);
    }

    public final /* synthetic */ void onNext(Object obj) {
        super.onNext((getProjection) obj);
        nativeAdornBoundary nativeadornboundary = this.write;
        XVrsDetectionVisualizer xVrsDetectionVisualizer = XVrsDetectionVisualizer.write;
        if (nativeadornboundary.RatingCompat != null) {
            xVrsDetectionVisualizer.IconCompatParcelizer(nativeadornboundary.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        if (th instanceof FatcaQuestionnaireCase.FatcaVerificationCodeException) {
            nativeAdornBoundary.RatingCompat(this.write);
            nativeAdornBoundary nativeadornboundary = this.write;
            nativeAdornReferenceFeature nativeadornreferencefeature = nativeAdornReferenceFeature.read;
            if (nativeadornboundary.RatingCompat != null) {
                nativeadornreferencefeature.IconCompatParcelizer(nativeadornboundary.RatingCompat);
                return;
            }
            return;
        }
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final void onComplete() {
        super.onComplete();
        nativeAdornBoundary.MediaBrowserCompat$SearchResultReceiver(this.write);
    }
}
