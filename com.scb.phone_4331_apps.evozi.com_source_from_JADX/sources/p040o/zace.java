package p040o;

import com.scb.phone.data.network.api.GoogleSigninApi;
import com.scb.phone.data.network.service.GoogleSigninService;

/* renamed from: o.zace */
public final class zace implements OPRStatusRewardsLandingActivity_ViewBinding<GoogleSigninApi> {
    private final HmlReviewDocumentActivity<GoogleSigninService> IconCompatParcelizer;

    private zace(HmlReviewDocumentActivity<GoogleSigninService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static zace write(HmlReviewDocumentActivity<GoogleSigninService> hmlReviewDocumentActivity) {
        return new zace(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new GoogleSigninApi(this.IconCompatParcelizer.get());
    }
}
