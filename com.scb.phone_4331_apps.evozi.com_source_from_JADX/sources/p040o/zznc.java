package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zznc */
public final class zznc implements OPRStatusRewardsLandingActivity_ViewBinding<detect> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69375> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zznc(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zznc MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        return new zznc(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        detect MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaMetadataCompat != null) {
            return MediaMetadataCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
