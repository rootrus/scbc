package p040o;

import com.scb.phone.data.p033di.easycash.EasycashFeatureAccountRepositoryModule;
import com.scb.phone.view.activity.hml.businessowner.HmlNTBOperatingBankActivity;
import p040o.AbstractMultimap;

/* renamed from: o.onInterceptTouchEvent */
public final class onInterceptTouchEvent implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.SortedKeySet> {
    private final HmlReviewDocumentActivity<setPassword> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<HmlNTBOperatingBankActivity.write> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashFeatureAccountRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> read;

    private onInterceptTouchEvent(EasycashFeatureAccountRepositoryModule easycashFeatureAccountRepositoryModule, HmlReviewDocumentActivity<HmlNTBOperatingBankActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setPassword> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashFeatureAccountRepositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static onInterceptTouchEvent read(EasycashFeatureAccountRepositoryModule easycashFeatureAccountRepositoryModule, HmlReviewDocumentActivity<HmlNTBOperatingBankActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setPassword> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        return new onInterceptTouchEvent(easycashFeatureAccountRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.SortedKeySet read2 = this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
