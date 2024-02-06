package p040o;

import com.scb.phone.data.p033di.easycash.EasycashSummaryRepositoryModule;
import com.scb.phone.view.activity.investment.discover.C5640x3a3161c0;
import p040o.AbstractMultimap;

/* renamed from: o.onTouchEvent */
public final class onTouchEvent implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.ValueIterator> {
    private final HmlReviewDocumentActivity<getAccountType> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C5640x3a3161c0> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashSummaryRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> write;

    private onTouchEvent(EasycashSummaryRepositoryModule easycashSummaryRepositoryModule, HmlReviewDocumentActivity<C5640x3a3161c0> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getAccountType> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashSummaryRepositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static onTouchEvent read(EasycashSummaryRepositoryModule easycashSummaryRepositoryModule, HmlReviewDocumentActivity<C5640x3a3161c0> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getAccountType> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        return new onTouchEvent(easycashSummaryRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.ValueIterator MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
