package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashFeatureAccountService;

/* renamed from: o.getComponentName */
public final class getComponentName implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashFeatureAccountService> {
    private final EasycashServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> read;

    private getComponentName(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = easycashServiceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getComponentName read(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getComponentName(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashFeatureAccountService MediaDescriptionCompat = this.IconCompatParcelizer.MediaDescriptionCompat(this.read.get());
        if (MediaDescriptionCompat != null) {
            return MediaDescriptionCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
