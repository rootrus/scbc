package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.LocalProjectProvider;
import p040o.getCityFieldName;

/* renamed from: o.ParcelImpl */
public final class ParcelImpl implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider.C6940b> {
    private final HmlReviewDocumentActivity<setFilterByAuthorizedAccounts> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidCashOutSuccessFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getCityFieldName.write> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleMonthlyFragment> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<setNonInteraction> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<SignInConnectionListener> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<withHolder> RatingCompat;
    private final HmlReviewDocumentActivity<addImpression> read;
    private final RepositoryModule write;

    private ParcelImpl(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getCityFieldName.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setFilterByAuthorizedAccounts> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<addImpression> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<SignInConnectionListener> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<withHolder> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<setNonInteraction> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidCashOutSuccessFragment> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleMonthlyFragment> hmlReviewDocumentActivity8) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaMetadataCompat = hmlReviewDocumentActivity4;
        this.RatingCompat = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity7;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity8;
    }

    public static ParcelImpl read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getCityFieldName.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setFilterByAuthorizedAccounts> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<addImpression> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<SignInConnectionListener> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<withHolder> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<setNonInteraction> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidCashOutSuccessFragment> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleMonthlyFragment> hmlReviewDocumentActivity8) {
        return new ParcelImpl(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider.C6940b write2 = this.write.write(this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.read.get(), this.MediaMetadataCompat.get(), this.RatingCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$MediaItem.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
