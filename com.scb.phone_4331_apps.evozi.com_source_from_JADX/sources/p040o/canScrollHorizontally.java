package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.deeplink.C5586x287d9eb4;

/* renamed from: o.canScrollHorizontally */
public final class canScrollHorizontally implements OPRStatusRewardsLandingActivity_ViewBinding<C6372x3d677cbb> {
    private final HmlReviewDocumentActivity<zabg> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zabl> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSSFTabFragment> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindScbsMaritalStatusFragment> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<C5586x287d9eb4> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<zabk> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSCBSproductDetailFragment> MediaSessionCompat$QueueItem;
    private final HmlReviewDocumentActivity<onConnectionFailed> RatingCompat;
    private final HmlReviewDocumentActivity<zam> read;
    private final HmlReviewDocumentActivity<zaat> write;

    private canScrollHorizontally(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5586x287d9eb4> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindScbsMaritalStatusFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindSSFTabFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<FragmentBuilder_BindSCBSproductDetailFragment> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zaat> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<zabg> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<onConnectionFailed> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zam> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<zabl> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<zabk> hmlReviewDocumentActivity10) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity3;
        this.MediaSessionCompat$QueueItem = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.IconCompatParcelizer = hmlReviewDocumentActivity6;
        this.RatingCompat = hmlReviewDocumentActivity7;
        this.read = hmlReviewDocumentActivity8;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity9;
        this.MediaMetadataCompat = hmlReviewDocumentActivity10;
    }

    public static canScrollHorizontally MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5586x287d9eb4> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindScbsMaritalStatusFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindSSFTabFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<FragmentBuilder_BindSCBSproductDetailFragment> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zaat> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<zabg> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<onConnectionFailed> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zam> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<zabl> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<zabk> hmlReviewDocumentActivity10) {
        return new canScrollHorizontally(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10);
    }

    public final /* synthetic */ Object get() {
        C6372x3d677cbb MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaSessionCompat$QueueItem.get(), this.write.get(), this.IconCompatParcelizer.get(), this.RatingCompat.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaMetadataCompat.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
