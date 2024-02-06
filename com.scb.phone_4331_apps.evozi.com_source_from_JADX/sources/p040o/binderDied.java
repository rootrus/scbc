package p040o;

import com.scb.phone.data.network.service.LoginService;
import com.scb.phone.view.activity.ccrredemption.ecoupon.BaseECouponActivity;

/* renamed from: o.binderDied */
public final class binderDied implements OPRStatusRewardsLandingActivity_ViewBinding<BaseECouponActivity.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<LoginService> write;

    private binderDied(HmlReviewDocumentActivity<LoginService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static binderDied MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<LoginService> hmlReviewDocumentActivity) {
        return new binderDied(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new BaseECouponActivity.IconCompatParcelizer(this.write.get());
    }
}
