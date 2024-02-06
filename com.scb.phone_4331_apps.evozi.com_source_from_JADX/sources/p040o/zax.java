package p040o;

import com.scb.phone.data.network.service.TouchPointService;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;

/* renamed from: o.zax */
public final class zax implements OPRStatusRewardsLandingActivity_ViewBinding<FriendsLandingActivity.read> {
    private final HmlReviewDocumentActivity<TouchPointService> IconCompatParcelizer;

    private zax(HmlReviewDocumentActivity<TouchPointService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static zax write(HmlReviewDocumentActivity<TouchPointService> hmlReviewDocumentActivity) {
        return new zax(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new FriendsLandingActivity.read(this.IconCompatParcelizer.get());
    }
}
