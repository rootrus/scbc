package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashEligibilityService;

/* renamed from: o.getPackage */
public final class getPackage implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashEligibilityService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final EasycashServiceModule write;

    private getPackage(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = easycashServiceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getPackage IconCompatParcelizer(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getPackage(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashEligibilityService RatingCompat = this.write.RatingCompat(this.MediaBrowserCompat$ItemReceiver.get());
        if (RatingCompat != null) {
            return RatingCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
