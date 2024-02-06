package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.OnDeviceIdExtractor;
import p040o.SignInButton;

/* renamed from: o.calculatePageOffsets */
public final class calculatePageOffsets implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor.C69651> {
    private final HmlReviewDocumentActivity<SignInButton> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceLandingFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SignInButton.ColorScheme> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> MediaBrowserCompat$MediaItem;
    private final RepositoryModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<setNonInteraction> RatingCompat;
    private final HmlReviewDocumentActivity<SignInButton.ButtonSize> read;
    private final HmlReviewDocumentActivity<nE$MediaBrowserCompat$CustomActionResultReceiver> write;

    private calculatePageOffsets(RepositoryModule repositoryModule, HmlReviewDocumentActivity<nE$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<SignInButton.ButtonSize> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setNonInteraction> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<SignInButton.ColorScheme> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<SignInButton> hmlReviewDocumentActivity7) {
        this.MediaDescriptionCompat = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.RatingCompat = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
        this.IconCompatParcelizer = hmlReviewDocumentActivity7;
    }

    public static calculatePageOffsets IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<nE$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<SignInButton.ButtonSize> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setNonInteraction> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<SignInButton.ColorScheme> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<SignInButton> hmlReviewDocumentActivity7) {
        return new calculatePageOffsets(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor.C69651 MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$MediaItem.get(), this.read.get(), this.RatingCompat.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
