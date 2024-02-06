package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.OnDeviceIdExtractor;

/* renamed from: o.dispatchOnPageScrolled */
public final class dispatchOnPageScrolled implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor.C6970b> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindDiscoverFragment> IconCompatParcelizer;
    private final RepositoryModule write;

    private dispatchOnPageScrolled(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindDiscoverFragment> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static dispatchOnPageScrolled MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindDiscoverFragment> hmlReviewDocumentActivity) {
        return new dispatchOnPageScrolled(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor.C6970b IconCompatParcelizer2 = this.write.IconCompatParcelizer(this.IconCompatParcelizer.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
