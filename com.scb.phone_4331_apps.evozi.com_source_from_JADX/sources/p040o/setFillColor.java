package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.setFillColor */
public final class setFillColor implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.AsMap> {
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSentFragment> write;

    private setFillColor(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindSentFragment> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static setFillColor IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindSentFragment> hmlReviewDocumentActivity) {
        return new setFillColor(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.AsMap write2 = this.MediaBrowserCompat$ItemReceiver.write(this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
