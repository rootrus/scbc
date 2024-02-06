package p040o;

import com.google.gson.Gson;
import com.scb.phone.data.network.service.PartnerDiscoverWebViewService;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.setScrollingCacheEnabled */
public final class setScrollingCacheEnabled implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindCcSofBillPaymentInputFragment> {
    private final HmlReviewDocumentActivity<PartnerDiscoverWebViewService> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Gson> read;
    private final HmlReviewDocumentActivity<onLoadFinished> write;

    private setScrollingCacheEnabled(RepositoryModule repositoryModule, HmlReviewDocumentActivity<PartnerDiscoverWebViewService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<onLoadFinished> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static setScrollingCacheEnabled IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<PartnerDiscoverWebViewService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<onLoadFinished> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity3) {
        return new setScrollingCacheEnabled(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindCcSofBillPaymentInputFragment write2 = this.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.read.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
