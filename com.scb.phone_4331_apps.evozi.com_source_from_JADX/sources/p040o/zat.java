package p040o;

import com.scb.phone.data.network.service.ThemesService;
import com.scb.phone.view.activity.demo.ntb.RegistrationActivity;

/* renamed from: o.zat */
public final class zat implements OPRStatusRewardsLandingActivity_ViewBinding<RegistrationActivity.write> {
    private final HmlReviewDocumentActivity<ThemesService> read;

    private zat(HmlReviewDocumentActivity<ThemesService> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static zat read(HmlReviewDocumentActivity<ThemesService> hmlReviewDocumentActivity) {
        return new zat(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new RegistrationActivity.write(this.read.get());
    }
}
