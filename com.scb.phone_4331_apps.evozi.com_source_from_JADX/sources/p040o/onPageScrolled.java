package p040o;

import com.scb.phone.data.network.service.easycash.EasycashLoanTrackService;
import com.scb.phone.data.p033di.easycash.EasycashLoanTrackRepositoryModule;

/* renamed from: o.onPageScrolled */
public final class onPageScrolled implements OPRStatusRewardsLandingActivity_ViewBinding<lastKey> {
    private final HmlReviewDocumentActivity<EasycashLoanTrackService> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashLoanTrackRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> write;

    private onPageScrolled(EasycashLoanTrackRepositoryModule easycashLoanTrackRepositoryModule, HmlReviewDocumentActivity<EasycashLoanTrackService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = easycashLoanTrackRepositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static onPageScrolled write(EasycashLoanTrackRepositoryModule easycashLoanTrackRepositoryModule, HmlReviewDocumentActivity<EasycashLoanTrackService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new onPageScrolled(easycashLoanTrackRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        lastKey write2 = this.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
