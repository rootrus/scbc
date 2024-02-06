package p040o;

import com.scb.phone.domain.interactor.FatcaQuestionnaireCase;
import p040o.access$2300;

/* renamed from: o.nativeAdornBoundary$MediaBrowserCompat$ItemReceiver */
public final class nativeAdornBoundary$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
    private /* synthetic */ nativeAdornBoundary IconCompatParcelizer;

    private nativeAdornBoundary$MediaBrowserCompat$ItemReceiver(nativeAdornBoundary nativeadornboundary) {
        this.IconCompatParcelizer = nativeadornboundary;
    }

    public /* synthetic */ nativeAdornBoundary$MediaBrowserCompat$ItemReceiver(nativeAdornBoundary nativeadornboundary, byte b) {
        this(nativeadornboundary);
    }

    public final /* synthetic */ void onNext(Object obj) {
        super.onNext((zzuk) obj);
        nativeAdornBoundary nativeadornboundary = this.IconCompatParcelizer;
        XVrsDetectionVisualizer xVrsDetectionVisualizer = XVrsDetectionVisualizer.write;
        if (nativeadornboundary.RatingCompat != null) {
            xVrsDetectionVisualizer.IconCompatParcelizer(nativeadornboundary.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        if (th instanceof FatcaQuestionnaireCase.FatcaVerificationCodeException) {
            nativeAdornBoundary.write(this.IconCompatParcelizer);
            nativeAdornBoundary nativeadornboundary = this.IconCompatParcelizer;
            nativeAdornReferenceFeature nativeadornreferencefeature = nativeAdornReferenceFeature.read;
            if (nativeadornboundary.RatingCompat != null) {
                nativeadornreferencefeature.IconCompatParcelizer(nativeadornboundary.RatingCompat);
                return;
            }
            return;
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final void onComplete() {
        super.onComplete();
        nativeAdornBoundary.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }
}
