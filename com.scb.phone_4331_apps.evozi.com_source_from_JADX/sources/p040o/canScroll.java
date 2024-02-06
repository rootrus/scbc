package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.deeplink.C5585x106633ac;
import p040o.BaseImplementation;
import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.canScroll */
public final class canScroll implements OPRStatusRewardsLandingActivity_ViewBinding<getDocument$MediaBrowserCompat$CustomActionResultReceiver> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C5585x106633ac> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<BaseImplementation.ApiMethodImpl> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<EasycashSalesheetIndexActivity> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<HmlPromptPayVerificationActivity.write> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<String> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<onBtnSendEmailVerificationClicked> read;
    private final HmlReviewDocumentActivity<zar> write;

    private canScroll(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C5585x106633ac> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<EasycashSalesheetIndexActivity> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<BaseImplementation.ApiMethodImpl> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<HmlPromptPayVerificationActivity.write> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<onBtnSendEmailVerificationClicked> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<zar> hmlReviewDocumentActivity7) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity5;
        this.read = hmlReviewDocumentActivity6;
        this.write = hmlReviewDocumentActivity7;
    }

    public static canScroll MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C5585x106633ac> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<EasycashSalesheetIndexActivity> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<BaseImplementation.ApiMethodImpl> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<HmlPromptPayVerificationActivity.write> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<onBtnSendEmailVerificationClicked> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<zar> hmlReviewDocumentActivity7) {
        return new canScroll(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7);
    }

    public final /* synthetic */ Object get() {
        getDocument$MediaBrowserCompat$CustomActionResultReceiver write2 = this.IconCompatParcelizer.write(this.MediaMetadataCompat.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaDescriptionCompat.get(), this.read.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
