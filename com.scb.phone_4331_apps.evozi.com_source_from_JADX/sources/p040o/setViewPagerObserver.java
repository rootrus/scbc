package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.C4998nC;

/* renamed from: o.setViewPagerObserver */
public final class setViewPagerObserver implements OPRStatusRewardsLandingActivity_ViewBinding<C7514tY> {
    private final HmlReviewDocumentActivity<makeGooglePlayServicesAvailable> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindRegistrationEmailSetupFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<setDefaultNotificationChannelId> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<C4998nC.read> read;
    private final HmlReviewDocumentActivity<ScriptIntrinsicConvolve5x5> write;

    private setViewPagerObserver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4998nC.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindRegistrationEmailSetupFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setDefaultNotificationChannelId> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<makeGooglePlayServicesAvailable> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<ScriptIntrinsicConvolve5x5> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
    }

    public static setViewPagerObserver write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4998nC.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindRegistrationEmailSetupFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setDefaultNotificationChannelId> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<makeGooglePlayServicesAvailable> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<ScriptIntrinsicConvolve5x5> hmlReviewDocumentActivity5) {
        return new setViewPagerObserver(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        C7514tY MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
