package p040o;

import com.scb.phone.data.network.service.easycash.EasycashBusinessAndMaritalInfoService;
import com.scb.phone.data.p033di.easycash.EasycashBusinessAndMaritalInfoRepositoryModule;

/* renamed from: o.onDetachedFromWindow */
public final class onDetachedFromWindow implements OPRStatusRewardsLandingActivity_ViewBinding<headMap> {
    private final HmlReviewDocumentActivity<EasycashBusinessAndMaritalInfoService> IconCompatParcelizer;
    private final EasycashBusinessAndMaritalInfoRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> read;
    private final HmlReviewDocumentActivity<getFamilyName> write;

    private onDetachedFromWindow(EasycashBusinessAndMaritalInfoRepositoryModule easycashBusinessAndMaritalInfoRepositoryModule, HmlReviewDocumentActivity<EasycashBusinessAndMaritalInfoService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getFamilyName> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashBusinessAndMaritalInfoRepositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static onDetachedFromWindow IconCompatParcelizer(EasycashBusinessAndMaritalInfoRepositoryModule easycashBusinessAndMaritalInfoRepositoryModule, HmlReviewDocumentActivity<EasycashBusinessAndMaritalInfoService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getFamilyName> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        return new onDetachedFromWindow(easycashBusinessAndMaritalInfoRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        headMap read2 = this.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer.get(), this.write.get(), this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
