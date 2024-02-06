package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity;
import p040o.Api;
import p040o.ServerProjectProvider;
import p040o.onSearchButtonClick;

/* renamed from: o.recomputeScrollPosition */
public final class recomputeScrollPosition implements OPRStatusRewardsLandingActivity_ViewBinding<ServerProjectProvider.C70662> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindQuickTopUpFragment> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C7329x31a960dc> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<BaseDiscoverSearchActivity.IconCompatParcelizer> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceSenderAddressFragment> MediaBrowserCompat$SearchResultReceiver;
    private final RepositoryModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<String> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<onSearchButtonClick.read> RatingCompat;
    private final HmlReviewDocumentActivity<Api.SimpleClient> read;
    private final HmlReviewDocumentActivity<isConnecting> write;

    private recomputeScrollPosition(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<BaseDiscoverSearchActivity.IconCompatParcelizer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindQuickTopUpFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7329x31a960dc> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onSearchButtonClick.read> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceSenderAddressFragment> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Api.SimpleClient> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<isConnecting> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity9) {
        this.MediaDescriptionCompat = repositoryModule;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
        this.RatingCompat = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity6;
        this.read = hmlReviewDocumentActivity7;
        this.write = hmlReviewDocumentActivity8;
        this.MediaMetadataCompat = hmlReviewDocumentActivity9;
    }

    public static recomputeScrollPosition MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<BaseDiscoverSearchActivity.IconCompatParcelizer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindQuickTopUpFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7329x31a960dc> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onSearchButtonClick.read> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceSenderAddressFragment> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Api.SimpleClient> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<isConnecting> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity9) {
        return new recomputeScrollPosition(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9);
    }

    public final /* synthetic */ Object get() {
        ServerProjectProvider.C70662 MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.RatingCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.read.get(), this.write.get(), this.MediaMetadataCompat.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
