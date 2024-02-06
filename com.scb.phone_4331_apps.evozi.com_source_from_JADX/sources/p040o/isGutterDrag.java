package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.FullScreenLoadingActivity;
import p040o.HintRequest;

/* renamed from: o.isGutterDrag */
public final class isGutterDrag implements OPRStatusRewardsLandingActivity_ViewBinding<ServerProjectProvider> {
    private final HmlReviewDocumentActivity<FullScreenLoadingActivity.write> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<HintRequest.Builder> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<enableUsingApkIndependentContext> RatingCompat;
    private final HmlReviewDocumentActivity<GooglePlayServicesUtilLight> read;
    private final HmlReviewDocumentActivity<setGoogleIdTokenRequestOptions> write;

    private isGutterDrag(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FullScreenLoadingActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GooglePlayServicesUtilLight> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setGoogleIdTokenRequestOptions> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<HintRequest.Builder> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity6) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.RatingCompat = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity6;
    }

    public static isGutterDrag write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FullScreenLoadingActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GooglePlayServicesUtilLight> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setGoogleIdTokenRequestOptions> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<HintRequest.Builder> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity6) {
        return new isGutterDrag(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        ServerProjectProvider MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.read.get(), this.RatingCompat.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaDescriptionCompat.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
