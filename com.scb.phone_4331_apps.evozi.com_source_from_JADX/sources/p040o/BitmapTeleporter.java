package p040o;

import com.scb.phone.data.network.service.easycash.EasycashLoanFeatureInformationService;
import com.scb.phone.view.activity.hml.fatca.C5633xa804aa18;

/* renamed from: o.BitmapTeleporter */
public final class BitmapTeleporter implements OPRStatusRewardsLandingActivity_ViewBinding<C5633xa804aa18> {
    private final HmlReviewDocumentActivity<EasycashLoanFeatureInformationService> IconCompatParcelizer;

    private BitmapTeleporter(HmlReviewDocumentActivity<EasycashLoanFeatureInformationService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static BitmapTeleporter IconCompatParcelizer(HmlReviewDocumentActivity<EasycashLoanFeatureInformationService> hmlReviewDocumentActivity) {
        return new BitmapTeleporter(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C5633xa804aa18(this.IconCompatParcelizer.get());
    }
}
