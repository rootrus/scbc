package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.LoginService;

/* renamed from: o.setShouldDowngrade */
public final class setShouldDowngrade implements OPRStatusRewardsLandingActivity_ViewBinding<LoginService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private setShouldDowngrade(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static setShouldDowngrade write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setShouldDowngrade(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LoginService popupTheme = this.MediaBrowserCompat$ItemReceiver.setPopupTheme(this.read.get());
        if (popupTheme != null) {
            return popupTheme;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
