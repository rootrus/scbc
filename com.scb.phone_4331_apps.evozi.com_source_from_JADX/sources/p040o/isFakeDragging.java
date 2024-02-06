package p040o;

import com.scb.phone.data.p033di.easycash.EasycashCardInfoRepositoryModule;
import com.scb.phone.view.activity.hml.HmlNTBCompanyNameActivity;

/* renamed from: o.isFakeDragging */
public final class isFakeDragging implements OPRStatusRewardsLandingActivity_ViewBinding<comparator> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getAccountTypesSet> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<HmlNTBCompanyNameActivity.IconCompatParcelizer> MediaBrowserCompat$ItemReceiver;
    private final EasycashCardInfoRepositoryModule write;

    private isFakeDragging(EasycashCardInfoRepositoryModule easycashCardInfoRepositoryModule, HmlReviewDocumentActivity<HmlNTBCompanyNameActivity.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getAccountTypesSet> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        this.write = easycashCardInfoRepositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static isFakeDragging MediaBrowserCompat$CustomActionResultReceiver(EasycashCardInfoRepositoryModule easycashCardInfoRepositoryModule, HmlReviewDocumentActivity<HmlNTBCompanyNameActivity.IconCompatParcelizer> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getAccountTypesSet> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        return new isFakeDragging(easycashCardInfoRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        comparator MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
