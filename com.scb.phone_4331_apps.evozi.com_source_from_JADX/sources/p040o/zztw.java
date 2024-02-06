package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashLoanFeatureInfoCaseModule;

/* renamed from: o.zztw */
public final class zztw implements OPRStatusRewardsLandingActivity_ViewBinding<getFrameMetadata> {
    private final EasycashLoanFeatureInfoCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<headSet> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;

    private zztw(EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headSet> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = easycashLoanFeatureInfoCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static zztw MediaBrowserCompat$CustomActionResultReceiver(EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headSet> hmlReviewDocumentActivity3) {
        return new zztw(easycashLoanFeatureInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        getFrameMetadata MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
