package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.deeplink.C5588xdb5a0e5b;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.draw */
public final class draw implements OPRStatusRewardsLandingActivity_ViewBinding<setMap> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<KeepName> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;
    private final HmlReviewDocumentActivity<C5588xdb5a0e5b> write;

    private draw(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5588xdb5a0e5b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<KeepName> hmlReviewDocumentActivity3) {
        this.read = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static draw write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5588xdb5a0e5b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<KeepName> hmlReviewDocumentActivity3) {
        return new draw(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setMap MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
