package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashLoanFeatureInfoCaseModule;

/* renamed from: o.zzts */
public final class zzts implements OPRStatusRewardsLandingActivity_ViewBinding<setFocus> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<headSet> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashLoanFeatureInfoCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;

    private zzts(EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headSet> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashLoanFeatureInfoCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzts IconCompatParcelizer(EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headSet> hmlReviewDocumentActivity3) {
        return new zzts(easycashLoanFeatureInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setFocus IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
