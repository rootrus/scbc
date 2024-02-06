package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zznp */
public final class zznp implements OPRStatusRewardsLandingActivity_ViewBinding<getGrayscaleImageData> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69375> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zznp(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zznp write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        return new zznp(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        getGrayscaleImageData MediaSessionCompat$Token = this.IconCompatParcelizer.MediaSessionCompat$Token(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.read.get());
        if (MediaSessionCompat$Token != null) {
            return MediaSessionCompat$Token;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
