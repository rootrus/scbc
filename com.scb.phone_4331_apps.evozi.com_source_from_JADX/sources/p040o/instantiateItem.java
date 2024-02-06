package p040o;

import com.scb.phone.data.network.service.FundDiscoverService;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.instantiateItem */
public final class instantiateItem implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider_Factory> {
    private final HmlReviewDocumentActivity<FundDiscoverService> IconCompatParcelizer;
    private final RepositoryModule write;

    private instantiateItem(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FundDiscoverService> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static instantiateItem MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FundDiscoverService> hmlReviewDocumentActivity) {
        return new instantiateItem(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider_Factory read = this.write.read(this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
