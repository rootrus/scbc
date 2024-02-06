package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.TermsConditionsService;

/* renamed from: o.getGravityForPopups */
public final class getGravityForPopups implements OPRStatusRewardsLandingActivity_ViewBinding<TermsConditionsService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule write;

    private getGravityForPopups(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getGravityForPopups write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getGravityForPopups(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        TermsConditionsService primaryBackground = this.write.setPrimaryBackground(this.MediaBrowserCompat$ItemReceiver.get());
        if (primaryBackground != null) {
            return primaryBackground;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
