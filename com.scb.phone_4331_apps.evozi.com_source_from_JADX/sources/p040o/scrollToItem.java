package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.FragmentBuilder_BindNTBLifestyleLandingFragment;

/* renamed from: o.scrollToItem */
public final class scrollToItem implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindChangeChannelStatementReviewFragment> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindNTBLifestyleLandingFragment.write> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule write;

    private scrollToItem(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindNTBLifestyleLandingFragment.write> hmlReviewDocumentActivity) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static scrollToItem write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindNTBLifestyleLandingFragment.write> hmlReviewDocumentActivity) {
        return new scrollToItem(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindChangeChannelStatementReviewFragment IconCompatParcelizer = this.write.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
