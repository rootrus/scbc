package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.C4750hg;

/* renamed from: o.getScaleY */
public final class getScaleY implements OPRStatusRewardsLandingActivity_ViewBinding<getRegionName> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C4750hg.write> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<asActivity> read;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindTopUpBillerFragment> write;

    private getScaleY(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4750hg.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindTopUpBillerFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<asActivity> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static getScaleY IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4750hg.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindTopUpBillerFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<asActivity> hmlReviewDocumentActivity3) {
        return new getScaleY(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        getRegionName MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
