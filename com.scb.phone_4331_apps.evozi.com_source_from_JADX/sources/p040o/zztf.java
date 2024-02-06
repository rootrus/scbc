package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zztf */
public final class zztf implements OPRStatusRewardsLandingActivity_ViewBinding<logEventInternalNoInterceptor> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69386> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zztf(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69386> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zztf MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69386> hmlReviewDocumentActivity3) {
        return new zztf(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        logEventInternalNoInterceptor MediaDescriptionCompat = this.IconCompatParcelizer.MediaDescriptionCompat(this.write.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaDescriptionCompat != null) {
            return MediaDescriptionCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
