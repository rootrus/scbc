package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.C4310dy;

/* renamed from: o.getTranslateY */
public final class getTranslateY implements OPRStatusRewardsLandingActivity_ViewBinding<getProject> {
    private final HmlReviewDocumentActivity<getChangeType> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<AccountChangeEventsRequest> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidRequestInputFragment> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<C4310dy.IconCompatParcelizer> read;
    private final RepositoryModule write;

    private getTranslateY(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4310dy.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AccountChangeEventsRequest> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getChangeType> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidRequestInputFragment> hmlReviewDocumentActivity4) {
        this.write = repositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
    }

    public static getTranslateY IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4310dy.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AccountChangeEventsRequest> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getChangeType> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidRequestInputFragment> hmlReviewDocumentActivity4) {
        return new getTranslateY(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        getProject MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
