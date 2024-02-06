package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ThemesService;

/* renamed from: o.validateScopes */
public final class validateScopes implements OPRStatusRewardsLandingActivity_ViewBinding<ThemesService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule read;

    private validateScopes(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static validateScopes write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new validateScopes(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ThemesService provider = this.read.setProvider(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (provider != null) {
            return provider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
