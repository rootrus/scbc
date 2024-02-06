package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.partner.PartnerLandingAdapter;

/* renamed from: o.addTouchables */
public final class addTouchables implements OPRStatusRewardsLandingActivity_ViewBinding<C6548x820c5aab> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindStopChequeReviewFragment> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindRiskSummaryFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<initialize> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<C6893x309be96c> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<keys> read;
    private final HmlReviewDocumentActivity<PartnerLandingAdapter.IconCompatParcelizer> write;

    private addTouchables(RepositoryModule repositoryModule, HmlReviewDocumentActivity<PartnerLandingAdapter.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C6893x309be96c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindStopChequeReviewFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<initialize> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<FragmentBuilder_BindRiskSummaryFragment> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity7) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaMetadataCompat = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.read = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity7;
    }

    public static addTouchables MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<PartnerLandingAdapter.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C6893x309be96c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindStopChequeReviewFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<initialize> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<FragmentBuilder_BindRiskSummaryFragment> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity7) {
        return new addTouchables(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7);
    }

    public final /* synthetic */ Object get() {
        C6548x820c5aab MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.MediaMetadataCompat.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
