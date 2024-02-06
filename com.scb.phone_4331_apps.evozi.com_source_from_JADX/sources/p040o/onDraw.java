package p040o;

import com.scb.phone.data.p033di.easycash.EasycashLoanFeatureInfoRepositoryModule;
import com.scb.phone.view.activity.hml.fatca.C5633xa804aa18;

/* renamed from: o.onDraw */
public final class onDraw implements OPRStatusRewardsLandingActivity_ViewBinding<headSet> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<setProfilePictureUri> MediaBrowserCompat$ItemReceiver;
    private final EasycashLoanFeatureInfoRepositoryModule read;
    private final HmlReviewDocumentActivity<C5633xa804aa18> write;

    private onDraw(EasycashLoanFeatureInfoRepositoryModule easycashLoanFeatureInfoRepositoryModule, HmlReviewDocumentActivity<C5633xa804aa18> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setProfilePictureUri> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        this.read = easycashLoanFeatureInfoRepositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static onDraw MediaBrowserCompat$CustomActionResultReceiver(EasycashLoanFeatureInfoRepositoryModule easycashLoanFeatureInfoRepositoryModule, HmlReviewDocumentActivity<C5633xa804aa18> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setProfilePictureUri> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        return new onDraw(easycashLoanFeatureInfoRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        headSet write2 = this.read.write(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
